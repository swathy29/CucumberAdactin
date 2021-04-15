$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featured%20Files/LoginAdactin.feature");
formatter.feature({
  "name": "Booking Room Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login in Adactin Hotel App",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User in Adactin Hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "User login with valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and user navigate to Search Hotel page",
  "keyword": "When "
});
formatter.step({
  "name": "User chooosing \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomtype\u003e\",\"\u003cnoofrooms\u003e\",\"\u003ccheckindate\u003e\",\"\u003ccheckoutdate\u003e\",\"\u003cadultsperroom\u003e\",\"\u003cchildrenperroom\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click Search button and User go to Select Hotel Page",
  "keyword": "And "
});
formatter.step({
  "name": "User choose a hotel in the list and click continue button and User should be in payment page",
  "keyword": "And "
});
formatter.step({
  "name": "User Enter \"\u003cfirstname\u003e\",\"\u003clastname\u003e\" and \"\u003caddress\u003e\",\"\u003cccnum\u003e\",\"\u003ccctype\u003e\",\"\u003cccexpmonth\u003e\",\"\u003cccexpyear\u003e\" and \"\u003ccvvno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click Book Now button and user get the Booked Room details",
  "keyword": "And "
});
formatter.step({
  "name": "User click search hotel then moved to home page of search hotel",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "roomtype",
        "noofrooms",
        "checkindate",
        "checkoutdate",
        "adultsperroom",
        "childrenperroom",
        "firstname",
        "lastname",
        "address",
        "ccnum",
        "cctype",
        "ccexpmonth",
        "ccexpyear",
        "cvvno"
      ]
    },
    {
      "cells": [
        "Swathy29",
        "Swathy29",
        "London",
        "Hotel Creek",
        "Super Deluxe",
        "1-One",
        "16-04-2021",
        "17-04-2021",
        "1-One",
        "0-None",
        "Swathy",
        "Chandran",
        "13A East Coast Street,Velacherry,Chennai-610018",
        "5678901234509876",
        "VISA",
        "May",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login in Adactin Hotel App",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in Adactin Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsA.user_in_Adactin_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login with valid \"Swathy29\" and \"Swathy29\" and user navigate to Search Hotel page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsA.user_login_with_valid_and_and_user_navigate_to_Search_Hotel_page(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#\\35 3g7wh27\"}\n  (Session info: chrome\u003d89.0.4389.128)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-I6J8VVCM\u0027, ip: \u0027192.168.43.127\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.128, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Sathi\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:49627}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0c5ad0c1ff47572bc7391105c7f024ce\n*** Element info: {Using\u003did, value\u003d53g7wh27}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat org.utilities.BaseClassAdactinT.fillTextbox(BaseClassAdactinT.java:70)\r\n\tat org.stepdefinition.LoginStepsA.user_login_with_valid_and_and_user_navigate_to_Search_Hotel_page(LoginStepsA.java:32)\r\n\tat ✽.User login with valid \"Swathy29\" and \"Swathy29\" and user navigate to Search Hotel page(file:src/test/resources/Featured%20Files/LoginAdactin.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User chooosing \"London\",\"Hotel Creek\",\"Super Deluxe\",\"1-One\",\"16-04-2021\",\"17-04-2021\",\"1-One\",\"0-None\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsA.user_chooosing(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Search button and User go to Select Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsA.user_click_Search_button_and_User_go_to_Select_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User choose a hotel in the list and click continue button and User should be in payment page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsA.user_choose_a_hotel_in_the_list_and_click_continue_button_and_User_should_be_in_payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Enter \"Swathy\",\"Chandran\" and \"13A East Coast Street,Velacherry,Chennai-610018\",\"5678901234509876\",\"VISA\",\"May\",\"2022\" and \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsA.user_Enter_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Book Now button and user get the Booked Room details",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsA.user_click_Book_Now_button_and_user_get_the_Booked_Room_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click search hotel then moved to home page of search hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsA.user_click_search_hotel_then_moved_to_home_page_of_search_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});