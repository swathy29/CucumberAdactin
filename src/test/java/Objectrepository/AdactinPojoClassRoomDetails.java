package Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassAdactinT;

public class AdactinPojoClassRoomDetails extends BaseClassAdactinT{
	public AdactinPojoClassRoomDetails() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	  private WebElement RadioBtn;
	@FindBy(id="continue")
	  private WebElement ContinueBtn;
	public WebElement getRadioBtn() {
		return RadioBtn;
	}
	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
    
}
