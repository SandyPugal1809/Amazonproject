package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;

import com.base.BaseClassMaven;
import com.pagemanager.PageObjectManager;
import com.pages.AmazonPage;

import io.cucumber.java.en.*
;

public class TC1_CancelStep extends BaseClassMaven {
	
	PageObjectManager pom = new PageObjectManager();
	
	

	@Given("User is on the Amazon Page")
	public void user_is_on_the_amazon_page() throws FileNotFoundException, IOException {
		
//		launchBrowser(getProprtiesFileValue("url"));
//		maximize();
//		implicityWait();
		
	    
	}
	
	@Then("User should verify the after launch {string}")
	public void user_should_verify_the_after_launch(String exptLoginMsg) {
		
		Assert.assertTrue(pom.getAmazonPage().txtLoginScuccessMsg().contains(exptLoginMsg));

	   
	}
	@When("User search the product {string}")
	public void user_search_the_product(String search) {
		
		pom.getAmazonPage().searchBox(search);
		
	   
	}
	
	@Then("User should verify after search success message {string}")
	public void user_should_verify_after_search_success_message(String exptProductMsg) {
		
		Assert.assertTrue(pom.getAmazonPage().txtProductSuccessMsg().contains(exptProductMsg));
	   
	}
	@When("User select the radio button to sort by high to low")
	public void user_select_the_radio_button_to_sort_by_high_to_low() throws InterruptedException {
		
		pom.getAmazonPage().clickRdoHightoLow();
		
	    
	}
	@Then("User should verify all product arranged in descending order")
	public void user_should_verify_all_product_arranged_in_descending_order() throws InterruptedException {
		
		Assert.assertTrue(pom.getAmazonPage().sortProductPriceHighToLow());
	    
	}
	@When("User select the first product and save product name and price")
	public void user_select_the_first_product_and_save_product_name_and_price() {
		
		pom.getAmazonPage().clkFirstProduct();
		
		pom.getAmazonPage().ProdutNameandPrice();
	
	   
	}
	@Then("User should verify after select the product {string}")
	public void user_should_verify_after_select_the_product(String exptProductNameMsd) {
		
		Assert.assertEquals(pom.getAmazonPage().txtAfterProductClick(), exptProductNameMsd);
	   
	}
	@When("User add the product to add cart")
	public void user_add_the_product_to_add_cart() {
		
		pom.getAmazonPage().addCart();
		
		
	   
	}
	@Then("User should verify after produt adding to cart {string}")
	public void user_should_verify_after_produt_adding_to_cart(String exptCartMsg) {
		
		Assert.assertEquals(pom.getAmazonPage().txtCartSuccessMsg(), exptCartMsg);
	    
	}

	@When("User is sign in page enter the {string} and {string}")
	public void user_is_sign_in_page_enter_the_and(String username, String password) {
		
		pom.getAmazonPage().loginData(username, password);
	   
	}
	
	@Then("User should verify after adding address {string}")
	public void user_should_verify_after_adding_address(String exptSignSuccessMsg) {
		
		Assert.assertEquals(pom.getAmazonPage().txtCheckOutMsg(), exptSignSuccessMsg);
	   
	}

	@When("User enter the new address {string},{string},{string},{string},{string},{string},{string} & {string}")
	public void user_enter_the_new_address(String Fullname, String MobileNo, String Pincode, String address, String area, String Landmark, String city, String State) throws InterruptedException {
	   
		pom.getAmazonPage().addAddress(Fullname, MobileNo, Pincode, address, area, Landmark, city, State);
	}
	@When("User enter the patyment options using NetBanking")
	public void user_enter_the_patyment_options_using_net_banking() throws InterruptedException {
		
		pom.getAmazonPage().paymentType();
 
	}
	@When("User verify same product and price remove the product in add cart")
	public void user_verify_same_product_and_price_remove_the_product_in_add_cart() throws InterruptedException {
		
		pom.getAmazonPage().returnCart();
		
		Assert.assertEquals(pom.getAmazonPage().correctProductName(),AmazonPage.productName);
		
		Assert.assertEquals(pom.getAmazonPage().correctProductPrice(),AmazonPage.productPrice);
		
		pom.getAmazonPage().productRemoveCart();
	    
	}
	@Then("User should verify after remove the produt to cart {string}")
	public void user_should_verify_after_remove_the_produt_to_cart(String exptRemoveCart) {
		
		Assert.assertEquals(pom.getAmazonPage().txtCartRemoveMsg(), exptRemoveCart);
	   
	}
	
	
	
	








	


}
