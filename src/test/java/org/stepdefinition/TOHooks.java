package org.stepdefinition;

import org.utilities.BaseClassAdactinT;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TOHooks extends BaseClassAdactinT{
    @Before("@Sanity")
    public void beforesanity() {
	  System.out.println("Sanity Scenario Starts...");
	}
    @After("@Sanity")
    public void aftersanity() {
	  System.out.println("...Sanity Scenario Ends");
	}
    @Before("@Regression")
    public void beforeregression(){
      System.out.println("Regression Scenario Starts...");
    }
    @After("@Regression")
    public void afterregression() {
	  System.out.println("...Regression Scenario Ends");
	}
    @Before(order=1)
    public void before1() {
	 System.out.println("Order 1 @Before running");
	}
    @After(order=1)
    public void after1() {
	  System.out.println("Order 1 @After running");
	}
    @Before(order=2)
    public void before2() {
	  System.out.println("Order 2 @Before running");
	}
    @After(order=2)
    public void after2() {
	  System.out.println("Order 2 @After running");
	}
}
