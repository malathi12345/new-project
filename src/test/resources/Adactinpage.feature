Feature: validate adactin login funtionalty
  Scenario Outline: validate the adactinpage username passward

	Given user launch the adactin url
	When  user enter the "<username>" and "<passward>" 
	And click the login button
	Then user validate the successful login or not
	Then user select the location
	And user select the hotel
	And user select the roomtype
	And user select the number of rooms
	And user select the adult per rooms
	And user select the child per rooms
	Then user click search button
	And user click radio button 
	And user click continue button
	Then user enter the "<firstname>"and "<lastname>"and "<BillingAddress>"and "<carddtail>"
	And user select the credit card type
	And user select Expirydate and expiryyear
	Then user enter the cvv number
	Then user select the booknow
	Then click booked itinerary
	Then get the order id
	Examples:
	|username|passward|firstname|lastname|BillingAddress|carddtail|
	|malathigobinath|7325NP|malathi|a|tirunelvali|1234567893456789|
