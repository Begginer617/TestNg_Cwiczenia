import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class Login_Test {
    @Test(priority = 0)
    public void sumCalculation() {
        System.out.println(5 + 1);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gamer\\OneDrive\\Dokumenty\\Chrome Driver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onet.pl/");
    }


    @Test(priority = 1)
    public void devideCalculation() {
        System.out.println(6 / 2);
    }

    @Test(priority = 3)
    public void multiplicationCalculation() {
        System.out.println(2 * 8);
    }

}
