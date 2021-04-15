package org.stepdefinition;

import java.io.IOException;
import java.util.Map;

import org.utilities.BaseClassAdactinT;

import Objectrepository.AdactinPojoClassBookingHotel;
import Objectrepository.AdactinPojoClassLogin;
import Objectrepository.AdactinPojoClassOrderNumber;
import Objectrepository.AdactinPojoClassRoomDetails;
import Objectrepository.AdactinPojoClassSearchRoom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsA extends BaseClassAdactinT{
	public AdactinPojoClassLogin l;
	public AdactinPojoClassSearchRoom s;
	public AdactinPojoClassRoomDetails r;
	public AdactinPojoClassBookingHotel b;
	public AdactinPojoClassOrderNumber o;
	
	@Given("User in Adactin Hotel page")
	public void user_in_Adactin_Hotel_page() {
		LaunchUrl("https://adactinhotelapp.com/");
	}

	@When("User login with valid {string} and {string} and user navigate to Search Hotel page")
	public void user_login_with_valid_and_and_user_navigate_to_Search_Hotel_page(String user, String pass) {
        l=new AdactinPojoClassLogin();
        fillTextbox(l.getTxtUser(),user);
        fillTextbox(l.getTxtPass(),pass);
        btnClick(l.getBtnLogin());
	}

	@When("User chooosing {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_chooosing(String loc, String hot, String rt, String nr, String indate, String outdate, String adult, String child) throws IOException {
       s=new AdactinPojoClassSearchRoom();
       /*For Pojo Class
         fillTextbox(s.getLocation(),loc);
         fillTextbox(s.getHotels(),hot);
         fillTextbox(s.getRoomType(),rt);
         fillTextbox(s.getNumberOfRooms(),nr);
         fillTextbox(s.getCheckInDate(),indate);
         fillTextbox(s.getCheckOutDate(),outdate);
         fillTextbox(s.getAdultsPerRoom(),adult);
         fillTextbox(s.getChildrenPerRoom(),child);*/
    
     Map<String, String> e = excelRead("Hotel Creek");
     System.out.println(e);
     fillTextbox(s.getLocation(),e.get("location"));
     fillTextbox(s.getHotels(),e.get("hotels"));
     fillTextbox(s.getRoomType(),e.get("roomtype"));
     fillTextbox(s.getNumberOfRooms(),e.get("noofrooms"));
     fillTextbox(s.getCheckInDate(),e.get("checkindate"));
     fillTextbox(s.getCheckOutDate(),e.get("checkoutdate"));
     fillTextbox(s.getAdultsPerRoom(),e.get("adultsperroom"));
     fillTextbox(s.getChildrenPerRoom(),e.get("childrenperroom"));
	}

	@When("User click Search button and User go to Select Hotel Page")
	public void user_click_Search_button_and_User_go_to_Select_Hotel_Page() {
		 
		 btnClick(s.getBtnSearch());
	}

	@When("User choose a hotel in the list and click continue button and User should be in payment page")
	public void user_choose_a_hotel_in_the_list_and_click_continue_button_and_User_should_be_in_payment_page(){
	       r=new AdactinPojoClassRoomDetails();
	       btnClick(r.getRadioBtn());
	       btnClick(r.getContinueBtn());
	}

	@When("User Enter {string},{string} and {string},{string},{string},{string},{string} and {string}")
	public void user_Enter_and_and(String fn, String ln, String add, String cn, String ct, String cem, String cey, String cvvno){
          b= new AdactinPojoClassBookingHotel();
          fillTextbox(b.getFirstName(),fn);
          fillTextbox(b.getLastName(),ln);
          fillTextbox(b.getAddress(),add);
          fillTextbox(b.getCreditCardNumber(),cn);
          fillTextbox(b.getCreditCardType(),ct);
          fillTextbox(b.getExpiryDateMonth(),cem);
          fillTextbox(b.getExpiryDateYear(),cey);
          fillTextbox(b.getCVVNumber(),cvvno);
	}

	@When("User click Book Now button and user get the Booked Room details")
	public void user_click_Book_Now_button_and_user_get_the_Booked_Room_details(){
		
		btnClick(b.getBookNowBtn());
	}

	@Then("User click search hotel then moved to home page of search hotel")
	public void user_click_search_hotel_then_moved_to_home_page_of_search_hotel() {
        
	}


}
