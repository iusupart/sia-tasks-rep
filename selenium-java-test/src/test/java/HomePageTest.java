import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.luxkod.pages.HomePage;

import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest {
    private WebDriver webDriver;
    private HomePage homePage;

    @BeforeAll
    public static void init() {
        WebDriverManager
                .chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.get("http://localhost:3000/");
        homePage = new HomePage(webDriver);
    }

    @Test
    public void linkTest(){
        homePage.clickGoToFormPageLink();

        String expectedUrl = "http://localhost:3000/form";
        assertEquals(expectedUrl, webDriver.getCurrentUrl(), "URL не правильный");
    }

    @Test
    public void submitTest(){
        homePage.switchToOurFrame();
        homePage.selectRadioOption("satisfied");
        homePage.submitForm();

        homePage.switchToDefaultContent();
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
