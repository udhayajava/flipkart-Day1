import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    public Main(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    }

    public static void main(String[] args)  {
    SearchAndAddToCart fn = new SearchAndAddToCart();
    fn.search();
    fn.cart();


    }
}
