package log.simple;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass extends BaseClass {
	
	@Given("^user launch the adactin url$")
	public void user_launch_the_adactin_url() throws Exception {
		
		 WebDriverManager.chromedriver().setup();
   	  driver=new ChromeDriver();
   	  driver.get("https://adactinhotelapp.com/");
		
		implicitWait();
	}

	@When("^user enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String arg1, String arg2) throws Exception {
	    AdactinHomePage adactin=new AdactinHomePage();
	    WebElement username = adactin.getUsername();
	    enterText(username, arg1);
	    WebElement passward = adactin.getPassward();
	    enterText(passward, arg2);
	    WebElement login = adactin.getLogin();
	    System.out.println("====username passward entered=========");
	}

	@When("^click the login button$")
	public void click_the_login_button() throws Exception {
		
		AdactinHomePage adactin1=new AdactinHomePage();
		WebElement login = adactin1.getLogin();
		click(login);
		
	}

	@Then("^user validate the successful login or not$")
	public void user_validate_the_successful_login_or_not() throws Exception {
	   
		AdactinHomePage adactin2=new AdactinHomePage();
		adactin2.getTitle();
		
	}

	@Then("^user select the location$")
	public void user_select_the_location() throws Exception {
	    AdactinHomePage adactin3=new AdactinHomePage();
	    WebElement location = adactin3.getLocation();
	    selectByIndex(location, 3);
	}

	@Then("^user select the hotel$")
	public void user_select_the_hotel() throws Exception {
	    AdactinHomePage adactin4=new AdactinHomePage();
	    WebElement hotel = adactin4.getHotel();
	    selectByIndex(hotel, 2);
	}

	@Then("^user select the roomtype$")
	public void user_select_the_roomtype() throws Exception {
	 AdactinHomePage adactin5=new AdactinHomePage();
	 WebElement roomtype = adactin5.getRoomtype();
	 selectByIndex(roomtype, 3);
	}

	@Then("^user select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Exception {
		AdactinHomePage adactin6=new AdactinHomePage();
		WebElement numofroom = adactin6.getNumofroom();
		selectByVisibleText(numofroom, "3 - Three");
		
	}

	@Then("^user select the adult per rooms$")
	public void user_select_the_adult_per_rooms() throws Exception {
		AdactinHomePage adactin7=new AdactinHomePage();
		WebElement adultperroom = adactin7.getAdultperroom();
		selectByIndex(adultperroom, 3);
	}

	@Then("^user select the child per rooms$")
	public void user_select_the_child_per_rooms() throws Exception {
		AdactinHomePage adactin8=new AdactinHomePage();
		WebElement childperroom = adactin8.getChildperroom();
		selectByIndex(childperroom, 3);
	}

	@Then("^user click search button$")
	public void user_click_search_button() throws Exception {
		AdactinHomePage adactin9=new AdactinHomePage();
		WebElement searchbutton = adactin9.getSearchbutton();
		click(searchbutton);
	}

	@Then("^user click radio button$")
	public void user_click_radio_button() throws Exception {
		AdactinHomePage adactin10=new AdactinHomePage();
		WebElement radiobutton = adactin10.getRadiobutton();
		click(radiobutton);
	}

	@Then("^user click continue button$")
	public void user_click_continue_button() throws Exception {
		AdactinHomePage adactin11=new AdactinHomePage();
		WebElement continuebtn = adactin11.getContinuebtn();
		click(continuebtn);
	}

	@Then("^user enter the \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_enter_the_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Exception {
		AdactinHomePage adactin12=new AdactinHomePage();
		WebElement firstname = adactin12.getFirstname();
		enterText(firstname, arg1);
		WebElement lastname = adactin12.getLastname();
		enterText(lastname, arg2);
		WebElement BillingAddress = adactin12.getBillingAddress();
		enterText(BillingAddress, arg3);
		WebElement carddtail = adactin12.getCarddtail();
		enterText(carddtail, arg4);
		
		
	}

	@Then("^user select the credit card type$")
	public void user_select_the_credit_card_type() throws Exception {
		AdactinHomePage adactin13=new AdactinHomePage();
		WebElement cardtype = adactin13.getCardtype();
		selectByIndex(cardtype, 2);
	}

	@Then("^user select Expirydate and expiryyear$")
	public void user_select_Expirydate_and_expiryyear() throws Exception {
		AdactinHomePage adactin14=new AdactinHomePage();
		WebElement expirydate = adactin14.getExpirydate();
		selectByVisibleText(expirydate, "September");
		WebElement expiryyear = adactin14.getExpiryyear();
		selectByVisibleText(expiryyear, "2022");
		
	}

	@Then("^user enter the cvv number$")
	public void user_enter_the_cvv_number() throws Exception {
		AdactinHomePage adactin15=new AdactinHomePage();
		WebElement cvvnumber = adactin15.getCvvnumber();
		enterText(cvvnumber, "3456");
	}

	@Then("^user select the booknow$")
	public void user_select_the_booknow() throws Exception {
		AdactinHomePage adactin16=new AdactinHomePage();
		WebElement booknow = adactin16.getBooknow();
		click(booknow);
	}

	@Then("^click booked itinerary$")
	public void click_booked_itinerary() throws Exception {
		AdactinHomePage adactin17=new AdactinHomePage(); 
		WebElement bookitinerary = adactin17.getBookitinerary();
	
		
		click(bookitinerary);
	}

	@Then("^get the order id$")
	public void get_the_order_id() throws Exception {
		AdactinHomePage adactin18=new AdactinHomePage();
		WebElement ordernumber = adactin18.getOrdernumber();
		
		String attribute = ordernumber.getAttribute("id");
		System.out.println(attribute);
		
		System.out.println("test completed");
		
		
	}



}
