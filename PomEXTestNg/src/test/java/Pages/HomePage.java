package Pages;
import static locaters.Locaters.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(css = searchBox)
	private WebElement searchTextBox;
	@FindBy(css=searchButon)
	private WebElement searchButton;
	@FindBy(css=ContactUs)
	private WebElement contactUs;
	@FindBy(css=Signup)
	private WebElement signUp;
	@FindBy(css=Logo)
	private WebElement logo;
	@FindBy(css=Women)
	private WebElement women;
	@FindBy(css=Dresses)
	private WebElement dresses;
	@FindBy(css=T_shirts)
	private WebElement t_shirts;
	@FindBy(css=Blog)
	private WebElement blog;
	
	private WebDriver driver=null;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	public void setSearchTextBox(String searchTextBox) {
		this.searchTextBox.sendKeys(searchTextBox);
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public WebElement getContactUs() {
		return contactUs;
	}
	public WebElement getSignUp() {
		return signUp;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getT_shirts() {
		return t_shirts;
	}
	public WebElement getBlog() {
		return blog;
	}
	
	
}
