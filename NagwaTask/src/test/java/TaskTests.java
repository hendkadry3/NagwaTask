import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TaskTests extends BaseTest{

    TaskPage taskPage;

    @BeforeClass
    public void inital() {

        taskPage = new TaskPage(driver);
    }

    @BeforeMethod
    public void navigateToHomePage() {

        driver.get("https://www.nagwa.com/");
    }

    @Test
    public void Task() {
        taskPage.LanguageBtn.click();
        taskPage.SearchBtn.click();
        taskPage.SearchText.sendKeys("addition");
        taskPage.SearchText.sendKeys(Keys.ENTER);
        taskPage.SecondLink.click();
        taskPage.WorkSheetBtn.click();
        List<WebElement> questions  =  driver.findElements(By.tagName("b"));
        System.out.println("The number of questions is "+ questions.size());

    }
}
