$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Newtripadvisor.feature");
formatter.feature({
  "line": 1,
  "name": "Search flights avilable",
  "description": "",
  "id": "search-flights-avilable",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "setup files",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "files setup done",
  "keyword": "When "
});
formatter.match({
  "location": "TripAdvisorStepDef.files_setup_done()"
});
formatter.result({
  "duration": 351787831,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search flights avilable from pune to mumbai",
  "description": "",
  "id": "search-flights-avilable;search-flights-avilable-from-pune-to-mumbai",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open browser and maximize it",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "navigate to https://care.ideacellular.com/wps/portal/account/account-login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter uname and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Pay button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter amt to be paid",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "choose cards and net-banking option",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "TripAdvisorStepDef.open_browser_and_maximize_it()"
});
formatter.result({
  "duration": 8388505070,
  "status": "passed"
});
formatter.match({
  "location": "TripAdvisorStepDef.navigate_to_https_care_ideacellular_com_wps_portal_account_account_login()"
});
formatter.result({
  "duration": 7246664672,
  "status": "passed"
});
formatter.match({
  "location": "TripAdvisorStepDef.enter_uname_and_password()"
});
formatter.result({
  "duration": 2640111437,
  "status": "passed"
});
formatter.match({
  "location": "TripAdvisorStepDef.click_on_login_button()"
});
formatter.result({
  "duration": 7513341709,
  "status": "passed"
});
formatter.match({
  "location": "TripAdvisorStepDef.click_on_Pay_button()"
});
formatter.result({
  "duration": 4999691243,
  "status": "passed"
});
formatter.match({
  "location": "TripAdvisorStepDef.enter_amt_to_be_paid()"
});
formatter.result({
  "duration": 8135296877,
  "status": "passed"
});
formatter.match({
  "location": "TripAdvisorStepDef.choose_cards_and_net_banking_option()"
});
formatter.result({
  "duration": 3410375112,
  "status": "passed"
});
formatter.match({
  "location": "TripAdvisorStepDef.click_on_submit_button()"
});
formatter.result({
  "duration": 10226413039,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"div.add_new\u003ediv.frm\u003einput[value\u003d\u0027Confirm\u0027]\"}\nCommand duration or timeout: 41 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027IPAD25050\u0027, ip: \u0027172.20.215.152\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_92\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d39.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d7645fd3-0481-4fb5-a98d-6a2df562769b\n*** Element info: {Using\u003dcss selector, value\u003ddiv.add_new\u003ediv.frm\u003einput[value\u003d\u0027Confirm\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.syn.tfs.stepdef.TripAdvisorStepDef.click_on_submit_button(TripAdvisorStepDef.java:94)\r\n\tat ✽.Then click on submit button(Newtripadvisor.feature:13)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"div.add_new\u003ediv.frm\u003einput[value\u003d\u0027Confirm\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027IPAD25050\u0027, ip: \u0027172.20.215.152\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_92\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/KULDEE~1.BOR/AppData/Local/Temp/anonymous2259232712771117020webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/KULDEE~1.BOR/AppData/Local/Temp/anonymous2259232712771117020webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/KULDEE~1.BOR/AppData/Local/Temp/anonymous2259232712771117020webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/KULDEE~1.BOR/AppData/Local/Temp/anonymous2259232712771117020webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/KULDEE~1.BOR/AppData/Local/Temp/anonymous2259232712771117020webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
});