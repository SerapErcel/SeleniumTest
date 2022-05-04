import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.testrelic.com/bugshop/");
        driver.manage().window().maximize();

        WebElement nameElement =driver.findElement(
                new By.ByCssSelector(
                        "#primary-menu > li.menu-item.menu-item-type-taxonomy.menu-item-object-download_category.menu-item-23 > a"
                ));
        nameElement.click();

        driver.close();


    }
}
