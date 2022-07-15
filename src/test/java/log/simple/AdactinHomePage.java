package log.simple;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHomePage extends BaseClass {
public AdactinHomePage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement username;
@FindBy(id="password")
private WebElement passward;
@FindBy(id="login")
private WebElement login;
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="room_nos")
private WebElement numofroom;
@FindBy(id="adult_room")
private WebElement adultperroom;
@FindBy(id="child_room")
private WebElement childperroom;
@FindBy(id="Submit")
private WebElement searchbutton;
@FindBy(id="radiobutton_0")
private WebElement radiobutton;
@FindBy(id="continue")
private WebElement continuebtn;
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement BillingAddress;
@FindBy(id="cc_num")
private WebElement carddtail;
@FindBy(id="cc_type")
private WebElement cardtype;
@FindBy(id="cc_exp_month")
private WebElement expirydate;
@FindBy(id="cc_exp_year")

private WebElement expiryyear;
@FindBy(id="cc_cvv")
private WebElement cvvnumber;
@FindBy(id="book_now")
private WebElement booknow;
@FindBy(xpath="//a[contains(text(),'Booked Itinerary')]")
private WebElement bookitinerary;
@FindBy(xpath="//html/body/table[2]/tbody/tr[2]/td/form//table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]")
private WebElement ordernumber;

public WebElement getUsername() {
	return username;
}

public void setUsername(WebElement username) {
	this.username = username;
}

public WebElement getPassward() {
	return passward;
}

public void setPassward(WebElement passward) {
	this.passward = passward;
}

public WebElement getLogin() {
	return login;
}

public void setLogin(WebElement login) {
	this.login = login;
}

public WebElement getLocation() {
	return location;
}

public void setLocation(WebElement location) {
	this.location = location;
}

public WebElement getHotel() {
	return hotel;
}

public void setHotel(WebElement hotel) {
	this.hotel = hotel;
}

public WebElement getRoomtype() {
	return roomtype;
}

public void setRoomtype(WebElement roomtype) {
	this.roomtype = roomtype;
}

public WebElement getNumofroom() {
	return numofroom;
}

public void setNumofroom(WebElement numofroom) {
	this.numofroom = numofroom;
}

public WebElement getAdultperroom() {
	return adultperroom;
}

public void setAdultperroom(WebElement adultperroom) {
	this.adultperroom = adultperroom;
}

public WebElement getChildperroom() {
	return childperroom;
}

public void setChildperroom(WebElement childperroom) {
	this.childperroom = childperroom;
}

public WebElement getSearchbutton() {
	return searchbutton;
}

public void setSearchbutton(WebElement searchbutton) {
	this.searchbutton = searchbutton;
}

public WebElement getRadiobutton() {
	return radiobutton;
}

public void setRadiobutton(WebElement radiobutton) {
	this.radiobutton = radiobutton;
}

public WebElement getContinuebtn() {
	return continuebtn;
}

public void setContinuebtn(WebElement continuebtn) {
	this.continuebtn = continuebtn;
}

public WebElement getFirstname() {
	return firstname;
}

public void setFirstname(WebElement firstname) {
	this.firstname = firstname;
}

public WebElement getLastname() {
	return lastname;
}

public void setLastname(WebElement lastname) {
	this.lastname = lastname;
}

public WebElement getBillingAddress() {
	return BillingAddress;
}

public void setBillingAddress(WebElement billingAddress) {
	BillingAddress = billingAddress;
}

public WebElement getCarddtail() {
	return carddtail;
}

public void setCarddtail(WebElement carddtail) {
	this.carddtail = carddtail;
}

public WebElement getCardtype() {
	return cardtype;
}

public void setCardtype(WebElement cardtype) {
	this.cardtype = cardtype;
}

public WebElement getExpirydate() {
	return expirydate;
}

public void setExpirydate(WebElement expirydate) {
	this.expirydate = expirydate;
}

public WebElement getExpiryyear() {
	return expiryyear;
}

public void setExpiryyear(WebElement expiryyear) {
	this.expiryyear = expiryyear;
}

public WebElement getCvvnumber() {
	return cvvnumber;
}

public void setCvvnumber(WebElement cvvnumber) {
	this.cvvnumber = cvvnumber;
}

public WebElement getBooknow() {
	return booknow;
}

public void setBooknow(WebElement booknow) {
	this.booknow = booknow;
}

public WebElement getBookitinerary() {
	return bookitinerary;
}

public void setBookitinerary(WebElement bookitinerary) {
	this.bookitinerary = bookitinerary;
}

public WebElement getOrdernumber() {
	return ordernumber;
}

public void setOrdernumber(WebElement ordernumber) {
	this.ordernumber = ordernumber;
}


}
