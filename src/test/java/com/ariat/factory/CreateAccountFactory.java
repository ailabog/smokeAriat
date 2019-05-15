package com.ariat.factory;

	import org.testng.annotations.Factory;
	import org.testng.annotations.Parameters;

import com.ariat.Enums.Environments;
import com.ariat.Tests.Account.Countries.CreateAccount.CreateAccountUKTest;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Environment;

	/**
	 * Utility for creating instances of {} test
	 * classes for provided input parameters.
	 * 
	 * @author aila.bogasieru@ariat.com
	 *
	 */
	public class CreateAccountFactory {

		@Parameters({ "device", "browser", "environment", "offset" })
		@Factory
		public Object[] createAccount(String device, String browser, Environments enviroment, Integer offset) {
			System.out.println("DEV = "+device);
			System.out.println("BRW = "+browser);
			System.out.println("ENV = "+enviroment);
			return FactoryHelperAila.setup(CreateAccountUKTest.class, device, browser, enviroment, offset);
		}
}
