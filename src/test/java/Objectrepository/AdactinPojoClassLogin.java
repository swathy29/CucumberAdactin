package Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClassAdactinT;

public class AdactinPojoClassLogin extends BaseClassAdactinT {

	public AdactinPojoClassLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "53g7wh27")
	private WebElement txtUser;
	@FindBy(id = "password")
	private WebElement txtPass;
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
