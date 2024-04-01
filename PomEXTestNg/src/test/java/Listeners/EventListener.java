package Listeners;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventListener implements WebDriverListener {
    private static final Logger log = LogManager.getLogger(EventListener.class);

    public void beforeAnyCall(Object target, Method method, Object[] args) {
        log.info("Before calling method: {} on target: {}", method.getName() );
    }

    public void afterAnyCall(Object target, Method method, Object[] args, Object result) {
        log.info("After calling method: {} on target: {}", method.getName() );
    }

    public void beforeAnyWebDriverCall(WebDriver driver, Method method, Object[] args) {
        log.info("Before calling WebDriver method: {}", method.getName());
    }

    public void afterAnyWebDriverCall(WebDriver driver, Method method, Object[] args, Object result) {
        log.info("After calling WebDriver method: {}", method.getName());
    }

    public void beforeGet(WebDriver driver, String url) {
        log.info("Before navigating to URL: {}", url);
    }

    public void afterGet(WebDriver driver, String url) {
        log.info("After navigating to URL: {}", url);
    }

    public void beforeGetTitle(WebDriver driver) {
        log.info("Before getting page title");
    }

    public void afterGetTitle(WebDriver driver, String result) {
        log.info("After getting page title: {}", result);
    }

    public void beforeFindElement(WebDriver driver, By locator) {
        log.info("Before finding element by locator: {}", locator);
    }

    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
        log.info("After finding element by locator: {}", locator);
    }

    public void beforeQuit(WebDriver driver) {
        log.info("Before quitting WebDriver");
    }

    public void afterQuit(WebDriver driver) {
        log.info("After quitting WebDriver");
    }
    
    public void beforeGetWindowHandles(WebDriver driver) {
        log.info("Before getting window handles");
    }

    public void afterGetWindowHandles(WebDriver driver, Set<String> result) {
        log.info("After getting window handles");
    }

    public void beforeGetWindowHandle(WebDriver driver) {
        log.info("Before getting window handle");
    }

    public void afterGetWindowHandle(WebDriver driver, String result) {
        log.info("After getting window handle");
    }

    public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
        log.info("Before executing JavaScript: {}", script);
    }

    public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
        log.info("After executing JavaScript: {}", script);
    }

    public void beforeExecuteAsyncScript(WebDriver driver, String script, Object[] args) {
        log.info("Before executing asynchronous JavaScript: {}", script);
    }

    public void afterExecuteAsyncScript(WebDriver driver, String script, Object[] args, Object result) {
        log.info("After executing asynchronous JavaScript: {}", script);
    }

    public void beforePerform(WebDriver driver, Collection<Sequence> actions) {
        log.info("Before performing actions");
    }

    public void afterPerform(WebDriver driver, Collection<Sequence> actions) {
        log.info("After performing actions");
    }

    public void beforeResetInputState(WebDriver driver) {
        log.info("Before resetting input state");
    }

    public void afterResetInputState(WebDriver driver) {
        log.info("After resetting input state");
    }

    // Implement other methods with descriptive log messages

    // ...
}






    

