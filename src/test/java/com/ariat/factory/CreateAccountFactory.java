package com.ariat.factory;

	import org.testng.annotations.Factory;
	import org.testng.annotations.Parameters;

    import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Environment;

	/**
	 * Utility for creating instances of {@link CheckoutPageTranslationsTest} test
	 * classes for provided input parameters.
	 * 
	 * @author aila.bogasieru@ariat.com
	 *
	 */
	public class CreateAccountFactory {

		@Parameters({ "device", "browser", "environment", "offset" })
		@Factory
		public Object[] createAccount(String device, String browser, Environment environment,	Integer offset) {
			return FactoryHelper.setup(CreateAccountFactory.class, device, browser, environment, offset);
		}
}
