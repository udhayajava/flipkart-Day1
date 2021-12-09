import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchAndAddToCart extends Main {
    public void search(){
        WebElement iphoneMobile = driver.findElement(By.xpath("//input[@name='q']"));
        iphoneMobile.sendKeys("iphone 11"+ Keys.ENTER);
        System.out.println("Select the iphone11");
        driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 11 (Black, 64 GB)')]")).click();

    }
    public void cart(){
        WebElement cart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
        cart.click();
    }

}
