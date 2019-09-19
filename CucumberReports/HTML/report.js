$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeatures/application.feature");
formatter.feature({
  "name": "application Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test01"
    }
  ]
});
formatter.scenario({
  "name": "eApp application Feature test Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter HomePage to click Manage cases button",
  "keyword": "When "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_enter_HomePage_to_click_Manage_cases_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input search to find AFBA case",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_search_to_find_AFBA_case()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the AFBA case",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.click_the_AFBA_case()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create New Enrollment",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.create_New_Enrollment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Sponsor SSN and click Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_SSN_and_click_Next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Sponsor firstName, lastName, dateOfBirth",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_firstName_lastName_dateOfBirth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Eligibility_BranchOfService_DutyStatus_Rank_and_Contribution_Mode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input DepartmentCode and SourceCode",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_DepartmentCode_and_SourceCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Show Coverage Options button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Show_Coverage_Options_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select firstOption",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_firstOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.User_click_Next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select yes or No for Other Insurance option",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_yes_or_No_for_Other_Insurance_option()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027step2\u0027]/form/div[2]/div[1]/div[2]/div[2]/div/button[2]\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ALXLWX2304\u0027, ip: \u0027172.27.27.22\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\MABABA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:64352}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 103f6151689b9c8df10bd2dade62d6d5\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027step2\u0027]/form/div[2]/div[1]/div[2]/div[2]/div/button[2]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat stepdefination.ApplicationPageStepDef.user_select_yes_or_No_for_Other_Insurance_option(ApplicationPageStepDef.java:127)\r\n\tat ✽.User select yes or No for Other Insurance option(MyFeatures/application.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User select Yes or No for Better Alternative options",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Yes_or_No_for_Better_Alternative_options()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "cilck the Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.cilck_the_Next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select Sponsor gender",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Sponsor_gender()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Sponsor height and weight",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_height_and_weight()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Sponsor address, Email and contact numbers",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_address_Email_and_contact_numbers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.User_click_Next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Next button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.User_click_Next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter Sponsor beneficiary fullName SSN Relationship DOB",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_enter_Sponsor_beneficiary_fullName_SSN_Relationship_DOB()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Next buuton for next step",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Next_buuton_for_next_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Deducation day",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Deducation_day()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select Deducation day",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Deducation_day()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Credit Card Number, Expiration Date and Cvv",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Credit_Card_Number_Expiration_Date_and_Cvv()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Signing in-person button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Signing_in_person_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click I agree to this coverage and ready to sign button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_I_agree_to_this_coverage_and_ready_to_sign_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the Review Application Ducuments",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_the_Review_Application_Ducuments()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Close the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_Close_the_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select Paper radio button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Paper_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input sponsor lastName",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_sponsor_lastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Last four SSN number",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Last_four_SSN_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Click Sign button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_Click_Sign_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Sign button for Angent eSignature",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Sign_button_for_Angent_eSignature()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "back to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.back_to_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click View Transmittals button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.click_View_Transmittals_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "View Submission button to check submission",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.view_Submission_button_to_check_submission()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check Download Data from XML file",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.check_Download_Data_from_XML_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});