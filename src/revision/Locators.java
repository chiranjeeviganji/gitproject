package revision;

import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import java.awt.List;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.swing.plaf.FileChooserUI;
import javax.tools.Tool;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
/* driver.get("https://www.facebook.com/");
	driver.findElement( By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("chiru123");
	driver.findElement(By.name("pass")).clear();
	driver.findElement(By.name("pass")).sendKeys("chiru123");
	*/
	


	 
	driver.findElement(By.linkText("Sign Up")).click();
	
	((JavascriptExecutor)driver).executeScript("document.getElementById('day').setAttribute('multiple', 'multiple')");
	boolean b=new Select(driver.findElement(By.id("day"))).isMultiple();
	System.out.println(b);
	
	new Select(driver.findElement(By.id("day"))).selectByVisibleText("24");
	new Select(driver.findElement(By.name("birthday_month"))).selectByValue("10");
	new Select(driver.findElement(By.id("year"))).selectByIndex(24);
	
	
	driver.findElement(By.cssSelector("input[name='firstname']")).clear();
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("123");
	String Actual=driver.getTitle();
	
	//System.out.println();
	
	String title=driver.getTitle();
	System.out.println(title);
	String expected_title="Sign up for Facebook | Facebook";
	boolean c=title.equals(expected_title);
	System.out.println(c);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String urlc="com";
	String actual_url="https://www.FACEBOOK.COM/r.php";
	boolean e=driver.getCurrentUrl().contains(urlc);
	System.out.println(e);
	boolean d=actual_url.equalsIgnoreCase(url);
	System.out.println(d);
	//String pagesource=driver.getPageSource();
	//System.out.println(pagesource);
	String window_id=driver.getWindowHandle();
	System.out.println(window_id);
	Set<String> allwindows=driver.getWindowHandles();
	System.out.println(allwindows);
	WebElement element;
	element=driver.findElement(By.id("cookie-use-link"));
	String element_text=	element.getText();
	System.out.println(element_text);
	

	driver.get("https://www.makemytrip.com"); 
	
	WebElement atribute=	driver.findElement(By.xpath("//li[@class='selected']"));
	String classvalue=atribute.getAttribute("class");
	System.out.println(classvalue);
if(classvalue.contains("selected"))
{
	System.out.println("Attribute value is selected");
}
else
{
	System.out.println("not");
	
}
	
WebElement multitrip=driver.findElement(By.xpath("//li[@class='selected']"));


String roundstyle=multitrip.getCssValue("color");
System.out.println(roundstyle);
String font_size=multitrip.getCssValue("font-size");
System.out.println(font_size);
String text_align=multitrip.getCssValue("text-align");
System.out.println(text_align);
String background_color=multitrip.getCssValue("background-color");
System.out.println(background_color);

WebElement Locaton_round=driver.findElement(By.xpath("//li[@class='selected']"));
Point get_location=Locaton_round.getLocation();
System.out.println(get_location);
int xcoordinator=get_location.getX();
System.out.println(xcoordinator);
int ycoordinator=get_location.getY();
System.out.println(ycoordinator);
if(xcoordinator>0)
System.out.println("object visible at webpage");
else
System.out.println("object not visible at webpage");
WebElement edit_box= driver.findElement(By.xpath("//p[contains(@data-cy,'departureDate')]"));
Dimension dimension=edit_box.getSize();
System.out.println(dimension);
int width=dimension.getWidth();
System.out.println(width);
int height=dimension.getHeight();
System.out.println(height);
if(height>0)
{
	System.out.println("object visible at webpage");
	
}
else
	System.out.println("object not visible at webpage");
String tag_name=driver.findElement(By.xpath("//span[contains(@class,'chNavIcon appendBottom2 chSprite chTrains')]")).getTagName();
System.out.println(tag_name);
WebElement bus=driver.findElement(By.xpath("//span[contains(@class,'chNavIcon appendBottom2 chSprite chBuses')]"));
boolean bus_1=bus.isDisplayed();
System.out.println(bus_1);

/*WebElement more_options=driver.findElement(By.xpath("//span[@class='chNavText']"));
more_options.click();
WebElement trip_ideas=driver.findElement(By.xpath("//span[@class='chNavText']"));
if(trip_ideas.isDisplayed())
{
	System.out.println("element is visible");
	
}
else
	System.out.println("element is not visible");
	*/

driver.get("https://www.hdfcbank.com/branch-atm-locator");
          Select dropdwon_sel=new Select(driver.findElement(By.xpath("//select[contains(@name,'stateName')]")));

          dropdwon_sel.selectByVisibleText("Andhra Pradesh");
          WebElement is_enable=driver.findElement(By.xpath("//input[contains(@id,'customLocality')]"));
          if(is_enable.isEnabled())
          System.out.println("element is enbled");
          else
        	  System.out.println("element is disable");
driver.navigate().to("https://www.instagram.com");
System.out.println("instagram is loaded in browser window");
driver.navigate().back();
System.out.println("back to hdfc");
driver.navigate().forward();
System.out.println("forward to instagram");
driver.navigate().refresh();
//driver.close();
//driver.quit();


/*driver.navigate().to("http://122.175.8.158/Ranford2/home.aspx");
driver.findElement(By.xpath("//input[contains(@id,'login')]")).click();
if (ExpectedConditions.alertIsPresent()!=null) 
	
{
Alert alert1=	driver.switchTo().alert();
String alert_msg=alert1.getText();
System.out.println(alert_msg);
alert1.accept();
}
else
	System.out.println("Alert not presented at webpage");
try {
	driver.switchTo().alert().accept();
	System.out.println("alert is presented");
} catch (Exception e1) {
	System.out.println(e1.getMessage());
	// TODO: handle exception
	System.out.println("alert is not presented");
}
*/
	driver.navigate().to("https://www.cleartrip.com/account/trips?src=manageTrips");
	driver.switchTo().frame("modal_window");
	driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("chiranjeevi880");
	driver.findElement(By.xpath("//input[contains(@id,'tripidSecond')]")).sendKeys("12345678");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Flights")).click();
	driver.navigate().to("https://epass.apcfss.in/");
	driver.switchTo().frame("menuFrame");
	driver.findElement(By.linkText("Who are Eligible")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("topFrame");    
	driver.navigate().to("https://www.facebook.com");
	driver.findElement(By.linkText("Instagram")).click();
	String window=driver.getWindowHandle();
	driver.switchTo().window(window);
	System.out.println("window is swithed to instagram");
    Set<String> w2=	driver.getWindowHandles();
    Iterator<String> it=w2.iterator();
String nxt=    it.next();
driver.switchTo().window(nxt);
Actions action=	new Actions(driver);
WebElement accnt_creation=driver.findElement(By.cssSelector("a[id*='u_0_2']"));
action.moveToElement(accnt_creation).perform();
Thread.sleep(10000);
action.click();

WebElement element1=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/watch/'][contains(.,'Watch')]"));
action.click(element1).perform();
Robot robot=new Robot();
/*robot.mousePress(InputEvent.BUTTON1_MASK);
robot.mousePress(InputEvent.BUTTON2_MASK);
robot.mousePress(InputEvent.BUTTON3_MASK);
robot.mouseRelease(InputEvent.BUTTON1_MASK);
robot.mouseWheel(5000);
robot.mouseMove(100, 200);
Runtime.getRuntime().exec("notepad.exe");//to launch notepad
String text="a person gets only journy when he has goal";
StringSelection stext=new StringSelection(text);
Clipboard board=Toolkit.getDefaultToolkit().getSystemClipboard();
board.setContents(stext, stext);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_S);
robot.keyRelease(KeyEvent.VK_CONTROL);
/*driver.navigate().to("https://naukri.com");
//Click Upload button
WebElement File_upload_btn=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
File_upload_btn.click();
Thread.sleep(4000);

String path="C:\\Users\\chiranjeevi\\Desktop\\testing knowledge";
StringSelection path1=new StringSelection(path);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path1, path1);

robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_ENTER);*/
driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();


WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
Alert_prompt_link.click();
Thread.sleep(3000);

java.awt.Dimension s_size=Toolkit.getDefaultToolkit().getScreenSize(); 
System.out.println(s_size);
BufferedImage capture=robot.createScreenCapture(new Rectangle(s_size));
ImageIO.write(capture,"png", new File("C:\\Users\\chiranjeevi\\Desktop\\"+"06052021"+"image.png"));
driver.switchTo().alert().accept();
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.createDir(new File("F://myscreenshot//screens"));
FileHandler.copy(src, new File("F://myscreenshot//screens//image"+123456+".png"));
driver.navigate().to("http://www.amazon.com");
File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src1, new File("C:\\Users\\chiranjeevi\\Desktop\\"+"image2.png"));










}
	
}
