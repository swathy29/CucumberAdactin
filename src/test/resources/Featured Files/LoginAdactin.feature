Feature: Booking Room Functionality
  @Smoke @Regression
  Scenario Outline: Login in Adactin Hotel App
    Given User in Adactin Hotel page
    When User login with valid "<username>" and "<password>" and user navigate to Search Hotel page
    And User chooosing "<location>","<hotels>","<roomtype>","<noofrooms>","<checkindate>","<checkoutdate>","<adultsperroom>","<childrenperroom>"
    And User click Search button and User go to Select Hotel Page
    And User choose a hotel in the list and click continue button and User should be in payment page
    And User Enter "<firstname>","<lastname>" and "<address>","<ccnum>","<cctype>","<ccexpmonth>","<ccexpyear>" and "<cvvno>"
    And User click Book Now button and user get the Booked Room details
    Then User click search hotel then moved to home page of search hotel

    Examples: 
      | username | password | location | hotels      | roomtype     | noofrooms | checkindate | checkoutdate | adultsperroom | childrenperroom | firstname | lastname | address                                         | ccnum            | cctype | ccexpmonth | ccexpyear|cvvno |     
      | Swathy29 | Swathy29 | London   | Hotel Creek | Super Deluxe | 1-One     | 16-04-2021  | 17-04-2021   | 1-One         | 0-None          | Swathy    | Chandran | 13A East Coast Street,Velacherry,Chennai-610018 | 5678901234509876 | VISA   | May        |  2022    |123   | 
