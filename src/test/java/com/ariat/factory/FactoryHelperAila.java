package com.ariat.factory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import com.ariat.Enums.Environments;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Environment;

/**
 * Handles initialization of test classes with appropriate combinations of
 * device, brand and offset values.
 * 
 * @author aila.bogasieru@ariat.com
 *
 */
public class FactoryHelperAila {

	// @formatter:off
	public static Object[] setup(Class<?> clazz, String device, String browser, Environments enviroment,
			Integer offset) {
		List<Object> tests = Arrays.stream(device.split(",")).flatMap(
				x -> Arrays.stream(browser.split(",")).map(y -> instantiateTestClass(clazz, x, y,enviroment, offset)))
				.collect(Collectors.toList());
		tests.removeIf(testInstance -> isMobileAndBrowser(testInstance, "Firefox")
				|| isMobileAndBrowser(testInstance, "Edge") || isMobileAndBrowser(testInstance, "Internet Explorer"));
		tests.removeIf(testInstance -> isBrowserAndOffset(testInstance, "Edge", 2)
				|| isBrowserAndOffset(testInstance, "Internet Explorer", 2));
		tests.removeIf(testInstance -> isMobileAndNotOffset(testInstance, 0));
		return tests.toArray();
	}
	// @formatter:on

	private static Object instantiateTestClass(Class<?> clazz, String device, String browser, Environments enviroment,
			Integer offset) {
		Object testInstance = invokeConstructor(clazz);
		writeField(testInstance, "device", device);
		writeField(testInstance, "browser", browser);
		writeField(testInstance, "environment", enviroment);
		writeField(testInstance, "offset", offset);
		return testInstance;
	}

	private static boolean isMobileAndBrowser(Object testInstance, String browser) {
		return readField(testInstance, "device").equals("Mobile") && readField(testInstance, "browser").equals(browser);
	}

	private static boolean isBrowserAndOffset(Object testInstance, String browser, int offset) {
		return readField(testInstance, "browser").equals(browser) && (int) readField(testInstance, "offset") == offset;
	}

	private static boolean isMobileAndNotOffset(Object testInstance, int offset) {
		return readField(testInstance, "device").equals("Mobile") && (int) readField(testInstance, "offset") != offset;
	}

	private static Object readField(Object testInstance, String fieldName) {
		try {
			return FieldUtils.readField(testInstance, fieldName, true);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	private static void writeField(Object testInstance, String fieldName, Object value) {
		try {
			if (FieldUtils.getAllFieldsList(testInstance.getClass()).stream()
					.anyMatch(field -> field.getName().equals(fieldName))) {
				FieldUtils.writeField(testInstance, fieldName, value, true);
			}
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	private static Object invokeConstructor(Class<?> clazz) {
		try {
			return ConstructorUtils.invokeConstructor(clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
