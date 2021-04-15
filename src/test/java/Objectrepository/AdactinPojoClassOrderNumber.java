package Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassAdactinT;

public class AdactinPojoClassOrderNumber extends BaseClassAdactinT{
	public AdactinPojoClassOrderNumber() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="order_no")
	  private WebElement OrderNo;
	public WebElement getOrderNo() {
		return OrderNo;
	}
}