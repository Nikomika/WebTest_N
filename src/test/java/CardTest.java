import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CardTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "driver/win/chromedriver.exe");
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
        driver = null;
    }
    @Test
    void shouldTestSomething() throws InterruptedException {
        driver.get("http://0.0.0.0:9999");
        WebElement form = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        form.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys ("Nataliya");
        form.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys ("+79270000000");
        form.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        form.findElement(By.cssSelector("[data-test-id=submit]")).click();
        Thread.sleep(5000);

    }
}
