package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
// Navigate to URL   https://the-internet.herokuapp.com/nested_frames
driver.get( "https://the-internet.herokuapp.com/nested_frames");

// locate the top frame locator using locator  Using Locator "XPath" //frame[@name='frame-top']
driver.switchTo().frame("frame-top");
// switch to frame using   driver.switch to.frame();
// locate the left  frame using locator  Using Locator "XPath" //frame[@name='frame-left']
driver.switchTo().frame("frame-left");
// get the text using tag name body  Using Locator "Tag Name" body
String leftFrame= driver.findElement(By.tagName("body")).getText();
System.out.println("left frame text : " + leftFrame);
// switch to parent frame using  driver.switch to.parentframe();
driver.switchTo().parentFrame();
// locate the middle  frame using locator   //frame[@name='frame-middle']
driver.switchTo().frame("frame-middle");
// get the text using tag name body  Using Locator "Tag Name" body
String middleFrame= driver.findElement(By.tagName("body")).getText();
System.out.println("left frame text : " + middleFrame);
// switch to parent frame using  driver.switch to.parentframe();
driver.switchTo().parentFrame();
// locate the right  frame using locator   //frame[@name='frame-right']
driver.switchTo().frame("frame-right");
// get the text using tag name body  Using Locator "Tag Name" body
String rightFrame= driver.findElement(By.tagName("body")).getText();
System.out.println("left frame text : " + rightFrame);
// switch to parent frame using  driver.switch to.parentframe();
driver.switchTo().parentFrame();
// switch to parent frame using  driver.switch to.parentframe();
driver.switchTo().parentFrame();
// switch to frame bottom  driver.switch to.frame();
driver.switchTo().frame("frame-bottom");
// get text using tag name body Using Locator "Tag Name" body
String bottomframe= driver.findElement(By.tagName("body")).getText();
System.out.println("left frame text : " + bottomframe);
// switch to default content/ parent frame  driver.switch to.parentframe();
driver.switchTo().parentFrame();

}


}
