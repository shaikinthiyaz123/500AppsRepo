$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HipsocialFeatures/Hipsocial.feature");
formatter.feature({
  "line": 1,
  "name": "Test feature of Hipsocial in 500apps Portal",
  "description": "Description: Test Hipsocial App functionality",
  "id": "test-feature-of-hipsocial-in-500apps-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Background:"
    }
  ],
  "line": 7,
  "name": "To create the category",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-create-the-category",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Read Login Data from Excel \"\u003cTestData\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User click on Streams Option",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click on Horizantal bars",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Click on CATEGORIES",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter the Categorie Name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on Save",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-create-the-category;",
  "rows": [
    {
      "cells": [
        "TestData"
      ],
      "line": 17,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-create-the-category;;1"
    },
    {
      "cells": [
        "TestData1"
      ],
      "line": 18,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-create-the-category;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14111100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "To create the category",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-create-the-category;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Read Login Data from Excel \"TestData1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User click on Streams Option",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click on Horizantal bars",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Click on CATEGORIES",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter the Categorie Name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on Save",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TestData1",
      "offset": 28
    }
  ],
  "location": "HipsocialStepdefination.read_Login_Data_from_Excel(String)"
});
formatter.result({
  "duration": 2704249800,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.user_click_on_Streams_Option()"
});
formatter.result({
  "duration": 795786300,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.click_on_Horizantal_bars()"
});
formatter.result({
  "duration": 1380357900,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.click_on_CATEGORIES()"
});
formatter.result({
  "duration": 1497061800,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.enter_the_Categorie_Name()"
});
formatter.result({
  "duration": 1750901900,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.click_on_Save()"
});
formatter.result({
  "duration": 7144700900,
  "status": "passed"
});
formatter.after({
  "duration": 5417800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "To Edit the category",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-edit-the-category",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Read Login Data from Excel \"\u003cTestData\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Mousehover on existing category and click on ellipsis",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click on Edit option",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Clear and enter the name",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Click on Update",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Veriy the Message",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-edit-the-category;",
  "rows": [
    {
      "cells": [
        "TestData"
      ],
      "line": 29,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-edit-the-category;;1"
    },
    {
      "cells": [
        "TestData1"
      ],
      "line": 30,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-edit-the-category;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3074300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "To Edit the category",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-edit-the-category;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Read Login Data from Excel \"TestData1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Mousehover on existing category and click on ellipsis",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click on Edit option",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Clear and enter the name",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Click on Update",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Veriy the Message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TestData1",
      "offset": 28
    }
  ],
  "location": "HipsocialStepdefination.read_Login_Data_from_Excel(String)"
});
formatter.result({
  "duration": 124805200,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.mousehover_on_existing_category_and_click_on_ellipsis()"
});
formatter.result({
  "duration": 598482500,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.click_on_Edit_option()"
});
formatter.result({
  "duration": 444706600,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.clear_and_enter_the_name()"
});
formatter.result({
  "duration": 934574600,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.click_on_Update()"
});
formatter.result({
  "duration": 234598400,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.veriy_the_Message()"
});
formatter.result({
  "duration": 43731971300,
  "error_message": "java.lang.AssertionError: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027IMTIYAZ-PC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d85.0.4183.87 (cd6713ebf92fa1cacc0f1a598df280093af0c5d7-refs/branch-heads/4183@{#1689}), userDataDir\u003dC:\\Users\\Imtiyaz\\AppData\\Local\\Temp\\scoped_dir12092_1309374087}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:53976}, acceptInsecureCerts\u003dfalse, browserVersion\u003d85.0.4183.102, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: f91aa0c4ddf31e61a176e40abad386e4\n*** Element info: {Using\u003dxpath, value\u003d//p[text()\u003d\u0027Updated Sucessfully\u0027]}\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat com.hipsocial.stepdefinitions.HipsocialStepdefination.veriy_the_Message(HipsocialStepdefination.java:208)\r\n\tat ✽.Then Veriy the Message(HipsocialFeatures/Hipsocial.feature:27)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 140589600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 34,
  "name": "To Delete the category",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-delete-the-category",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 33,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Read Login Data from Excel \"\u003cTestData\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Mousehover on existing category and click on ellipsis",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Click on Delete option",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click on Delete Button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Verify the Mesaage",
  "keyword": "Then "
});
formatter.examples({
  "line": 41,
  "name": "",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-delete-the-category;",
  "rows": [
    {
      "cells": [
        "TestData"
      ],
      "line": 42,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-delete-the-category;;1"
    },
    {
      "cells": [
        "TestData1"
      ],
      "line": 43,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-delete-the-category;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5220800,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "To Delete the category",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-delete-the-category;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 33,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Read Login Data from Excel \"TestData1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Mousehover on existing category and click on ellipsis",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Click on Delete option",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click on Delete Button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Verify the Mesaage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TestData1",
      "offset": 28
    }
  ],
  "location": "HipsocialStepdefination.read_Login_Data_from_Excel(String)"
});
formatter.result({
  "duration": 173272300,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.mousehover_on_existing_category_and_click_on_ellipsis()"
});
formatter.result({
  "duration": 7399500,
  "error_message": "java.lang.AssertionError: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027IMTIYAZ-PC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d85.0.4183.87 (cd6713ebf92fa1cacc0f1a598df280093af0c5d7-refs/branch-heads/4183@{#1689}), userDataDir\u003dC:\\Users\\Imtiyaz\\AppData\\Local\\Temp\\scoped_dir12092_1309374087}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:53976}, acceptInsecureCerts\u003dfalse, browserVersion\u003d85.0.4183.102, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: f91aa0c4ddf31e61a176e40abad386e4\n*** Element info: {Using\u003dxpath, value\u003d(//div[@class\u003d\u0027p-0 py-1 ml-2\u0027])[1]}\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat com.hipsocial.stepdefinitions.HipsocialStepdefination.mousehover_on_existing_category_and_click_on_ellipsis(HipsocialStepdefination.java:151)\r\n\tat ✽.Then Mousehover on existing category and click on ellipsis(HipsocialFeatures/Hipsocial.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HipsocialStepdefination.click_on_Delete_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HipsocialStepdefination.click_on_Delete_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HipsocialStepdefination.verify_the_Mesaage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 89971000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 47,
  "name": "To Add the Twitter Network",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-add-the-twitter-network",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 46,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "Read Login Data from Excel \"\u003cTestData\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User click on Streams Option",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Click on Twitter from Add Networks",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Switch to the next tab for Twitter site",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Enter UserName Password and click on Authorise App",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Select the added network from the dropdown to verify",
  "keyword": "Then "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-add-the-twitter-network;",
  "rows": [
    {
      "cells": [
        "TestData"
      ],
      "line": 55,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-add-the-twitter-network;;1"
    },
    {
      "cells": [
        "TestData1"
      ],
      "line": 56,
      "id": "test-feature-of-hipsocial-in-500apps-portal;to-add-the-twitter-network;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4592500,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "To Add the Twitter Network",
  "description": "",
  "id": "test-feature-of-hipsocial-in-500apps-portal;to-add-the-twitter-network;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 46,
      "name": "@Hipsocial"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "Read Login Data from Excel \"TestData1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User click on Streams Option",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Click on Twitter from Add Networks",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Switch to the next tab for Twitter site",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Enter UserName Password and click on Authorise App",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Select the added network from the dropdown to verify",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TestData1",
      "offset": 28
    }
  ],
  "location": "HipsocialStepdefination.read_Login_Data_from_Excel(String)"
});
formatter.result({
  "duration": 125851800,
  "status": "passed"
});
formatter.match({
  "location": "HipsocialStepdefination.user_click_on_Streams_Option()"
});
