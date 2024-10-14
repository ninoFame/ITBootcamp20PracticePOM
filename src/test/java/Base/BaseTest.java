package Base;

import Pages.HomepagePage;
import Pages.LoginPage;
import Pages.PracticePage;
import Pages.ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    public HomepagePage homepagePage;
    public LoginPage loginPage;
    public PracticePage practicePage;
    public ProfilePage profilePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepagePage = new HomepagePage(driver);
        loginPage = new LoginPage(driver);
        practicePage = new PracticePage(driver);
        profilePage = new ProfilePage(driver);

    }



}
