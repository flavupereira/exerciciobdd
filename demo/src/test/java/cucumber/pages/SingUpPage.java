package cucumber.pages;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class SingUpPage extends BasePage {

    public SingUpPage() {
        this.driver = new ChromeDriver();
        this.driver.get("https://the-internet.herokuapp.com/login ");
        this.driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(2))
                .pageLoadTimeout(Duration.ofSeconds(10));

    }

    public void clicarLogin(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void preecherCampoXpath(String xpath, String texto) {
        driver.findElement(By.xpath(xpath)).sendKeys(texto);
    }

    public void clicarXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean paginaCerta(String urlEsperada) {
        return driver.getCurrentUrl().equals(urlEsperada);
    }

    public boolean verificarTextoPorXpath(String xpath, String string) {
        return driver.findElement(By.xpath(xpath)).getText().equals(string);
    }

    public boolean  checarLogin(String xpath) {
      
     assertTrue(driver.getPageSource().contains("You logged into a secure area!"));

        return true;

    }

}
