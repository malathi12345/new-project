$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ELCOT/eclipse-workspace/basics/Cucumber/src/test/resources/Adactinpage.feature");
formatter.feature({
  "name": "validate adactin login funtionalty",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validate the adactinpage username passward",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch the adactin url",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the \"\u003cusername\u003e\" and \"\u003cpassward\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user validate the successful login or not",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the location",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the hotel",
  "keyword": "And "
});
formatter.step({
  "name": "user select the roomtype",
  "keyword": "And "
});
formatter.step({
  "name": "user select the number of rooms",
  "keyword": "And "
});
formatter.step({
  "name": "user select the adult per rooms",
  "keyword": "And "
});
formatter.step({
  "name": "user select the child per rooms",
  "keyword": "And "
});
formatter.step({
  "name": "user click search button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click radio button",
  "keyword": "And "
});
formatter.step({
  "name": "user click continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the \"\u003cfirstname\u003e\"and \"\u003clastname\u003e\"and \"\u003cBillingAddress\u003e\"and \"\u003ccarddtail\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the credit card type",
  "keyword": "And "
});
formatter.step({
  "name": "user select Expirydate and expiryyear",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the cvv number",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the booknow",
  "keyword": "Then "
});
formatter.step({
  "name": "click booked itinerary",
  "keyword": "Then "
});
formatter.step({
  "name": "get the order id",
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
        "passward",
        "firstname",
        "lastname",
        "BillingAddress",
        "carddtail"
      ]
    },
    {
      "cells": [
        "malathigobinath",
        "7325NP",
        "malathi",
        "a",
        "tirunelvali",
        "1234567893456789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate the adactinpage username passward",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch the adactin url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_the_adactin_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"malathigobinath\" and \"7325NP\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the successful login or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_validate_the_successful_login_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the location",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the roomtype",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_roomtype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the number of rooms",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_number_of_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the adult per rooms",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_adult_per_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the child per rooms",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_child_per_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click radio button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_click_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"malathi\"and \"a\"and \"tirunelvali\"and \"1234567893456789\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_enter_the_and_and_and(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the credit card type",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_credit_card_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Expirydate and expiryyear",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_Expirydate_and_expiryyear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the cvv number",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_enter_the_cvv_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the booknow",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_select_the_booknow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click booked itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.click_booked_itinerary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the order id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.get_the_order_id()"
});
formatter.result({
  "status": "passed"
});
});