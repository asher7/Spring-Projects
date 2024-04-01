package Loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogTest {
	
	private static final Logger logger = LogManager.getLogger(LogTest.class);
	@Test
	public void test() {
		  logger.trace("This is a TRACE level log message.");
	        logger.debug("This is a DEBUG level log message.");
	        logger.info("This is an INFO level log message.");
	        logger.warn("This is a WARN level log message.");
	        logger.error("This is an ERROR level log message.");
	        logger.fatal("This is a FATAL level log message.");

	}

}
