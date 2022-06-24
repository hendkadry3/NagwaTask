import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    @FindBy(xpath = "//*[@href='/en/']")
    public WebElement LanguageBtn;
  @FindBy(xpath = "/html/body/header/div[1]/div/div[3]/button")
    public WebElement SearchBtn;
  @FindBy(xpath = "//*[@href='https://www.nagwa.com/en/lessons/167131671315/']")
    public WebElement SecondLink;
  @FindBy(id = "txt_search_query")
    public WebElement SearchText;
  @FindBy(xpath = "//*[@href='https://www.nagwa.com/en/worksheets/805156363640/']")
    public WebElement WorkSheetBtn;


    public TaskPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
