package Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassAdactinT;

public class AdactinPojoClassBookingHotel extends BaseClassAdactinT{
	public AdactinPojoClassBookingHotel() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="first_name")
	  private WebElement FirstName;
	@FindBy(id="last_name")
	  private WebElement LastName;
	@FindBy(id="address")
	  private WebElement Address;
	@FindBy(id="cc_num")
	  private WebElement CreditCardNumber;
	@FindBy(id="cc_type")
	  private WebElement CreditCardType;
	@FindBy(id="cc_exp_month")
	  private WebElement ExpiryDateMonth;
	@FindBy(id="cc_exp_year")
	  private WebElement ExpiryDateYear;
	@FindBy(id="cc_cvv")
	  private WebElement CVVNumber;
	@FindBy(id="book_now")
	  private WebElement BookNowBtn;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCreditCardNumber() {
		return CreditCardNumber;
	}
	public WebElement getCreditCardType() {
		return CreditCardType;
	}
	public WebElement getExpiryDateMonth() {
		return ExpiryDateMonth;
	}
	public WebElement getExpiryDateYear() {
		return ExpiryDateYear;
	}
	public WebElement getCVVNumber() {
		return CVVNumber;
	}
	public WebElement getBookNowBtn() {
		return BookNowBtn;
	}
	
}
