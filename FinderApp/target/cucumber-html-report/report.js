$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FinderApp.feature");
formatter.feature({
  "line": 1,
  "name": "Test the functionaliy of the finder app in 500apps portal",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify user is able to Search Emails by Using DomainSearch",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-user-is-able-to-search-emails-by-using-domainsearch",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Read the test data  \"\u003cFinderTestData\u003e\" from Excel file for Finder",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the DomainName for Domainsearch",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Find Email Address",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-user-is-able-to-search-emails-by-using-domainsearch;",
  "rows": [
    {
      "cells": [
        "FinderTestData"
      ],
      "line": 11,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-user-is-able-to-search-emails-by-using-domainsearch;;1"
    },
    {
      "cells": [
        "FinderTestData1"
      ],
      "line": 12,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-user-is-able-to-search-emails-by-using-domainsearch;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9519200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify user is able to Search Emails by Using DomainSearch",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-user-is-able-to-search-emails-by-using-domainsearch;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Read the test data  \"FinderTestData1\" from Excel file for Finder",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the DomainName for Domainsearch",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Find Email Address",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FinderTestData1",
      "offset": 21
    }
  ],
  "location": "FinderAppSteps.read_the_test_data_from_Excel_file_for_Finder(String)"
});
formatter.result({
  "duration": 4832298600,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.enter_the_DomainName_for_Domainsearch()"
});
formatter.result({
  "duration": 18704092600,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Find_Email_Address()"
});
formatter.result({
  "duration": 13496988100,
  "status": "passed"
});
formatter.after({
  "duration": 3786700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Verify that user is able to Find Email id status by giving data in First name , Last name, Domain name",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-find-email-id-status-by-giving-data-in-first-name-,-last-name,-domain-name",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Read the test data  \"\u003cFinderTestData\u003e\" from Excel file for Finder",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "click on Email_Finder module",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Enter FN LN and DN for Emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on Find",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-find-email-id-status-by-giving-data-in-first-name-,-last-name,-domain-name;",
  "rows": [
    {
      "cells": [
        "FinderTestData"
      ],
      "line": 23,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-find-email-id-status-by-giving-data-in-first-name-,-last-name,-domain-name;;1"
    },
    {
      "cells": [
        "FinderTestData1"
      ],
      "line": 24,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-find-email-id-status-by-giving-data-in-first-name-,-last-name,-domain-name;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3370900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify that user is able to Find Email id status by giving data in First name , Last name, Domain name",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-find-email-id-status-by-giving-data-in-first-name-,-last-name,-domain-name;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Read the test data  \"FinderTestData1\" from Excel file for Finder",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "click on Email_Finder module",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Enter FN LN and DN for Emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on Find",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FinderTestData1",
      "offset": 21
    }
  ],
  "location": "FinderAppSteps.read_the_test_data_from_Excel_file_for_Finder(String)"
});
formatter.result({
  "duration": 150192600,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Email_Finder_module()"
});
formatter.result({
  "duration": 419742000,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.enter_FN_LN_and_DN_for_Emailfinder()"
});
formatter.result({
  "duration": 1770827200,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Find()"
});
formatter.result({
  "duration": 6365408300,
  "status": "passed"
});
formatter.after({
  "duration": 622400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "Verify that user is able to verify email id",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-verify-email-id",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Read the test data  \"\u003cFinderTestData\u003e\" from Excel file for Finder",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "click on Email_Verify module",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "enter the email address for Emailverify",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "click on find Button",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-verify-email-id;",
  "rows": [
    {
      "cells": [
        "FinderTestData"
      ],
      "line": 35,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-verify-email-id;;1"
    },
    {
      "cells": [
        "FinderTestData1"
      ],
      "line": 36,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-verify-email-id;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1870100,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify that user is able to verify email id",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-verify-email-id;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Read the test data  \"FinderTestData1\" from Excel file for Finder",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "click on Email_Verify module",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "enter the email address for Emailverify",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "click on find Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FinderTestData1",
      "offset": 21
    }
  ],
  "location": "FinderAppSteps.read_the_test_data_from_Excel_file_for_Finder(String)"
});
formatter.result({
  "duration": 145387600,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Email_Verify_module()"
});
formatter.result({
  "duration": 268117900,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.enter_the_email_address_for_Emailverify()"
});
formatter.result({
  "duration": 1282421500,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_find_Button()"
});
formatter.result({
  "duration": 1251152200,
  "status": "passed"
});
formatter.after({
  "duration": 768100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 38,
  "name": "Verify that user is able to upload CSV file for Bulk EmailVerify",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailverify",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "Read the test data  \"\u003cFinderTestData\u003e\" from Excel file for Finder",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "click on Bulk module",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "click on upload csv file button for bulk emailverify",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "click on up arrow button to upload the file for bulk emailverify",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "select the fields in mapping screen window for bulk emailverify",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "click on import from csv for bulk emailverify",
  "keyword": "Then "
});
formatter.examples({
  "line": 48,
  "name": "",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailverify;",
  "rows": [
    {
      "cells": [
        "FinderTestData"
      ],
      "line": 49,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailverify;;1"
    },
    {
      "cells": [
        "FinderTestData1"
      ],
      "line": 50,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailverify;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2300700,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Verify that user is able to upload CSV file for Bulk EmailVerify",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailverify;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "Read the test data  \"FinderTestData1\" from Excel file for Finder",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "click on Bulk module",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "click on upload csv file button for bulk emailverify",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "click on up arrow button to upload the file for bulk emailverify",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "select the fields in mapping screen window for bulk emailverify",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "click on import from csv for bulk emailverify",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FinderTestData1",
      "offset": 21
    }
  ],
  "location": "FinderAppSteps.read_the_test_data_from_Excel_file_for_Finder(String)"
});
formatter.result({
  "duration": 128790500,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Bulk_module()"
});
formatter.result({
  "duration": 560379200,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_upload_csv_file_button_for_bulk_emailverify()"
});
formatter.result({
  "duration": 4510251500,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_up_arrow_button_to_upload_the_file_for_bulk_emailverify()"
});
formatter.result({
  "duration": 7809090300,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.select_the_fields_in_mapping_screen_window_for_bulk_emailverify()"
});
formatter.result({
  "duration": 50408051400,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_import_from_csv_for_bulk_emailverify()"
});
formatter.result({
  "duration": 21489755000,
  "error_message": "java.lang.AssertionError: Expected condition failed: waiting for visibility of element located by By.xpath: //h3[contains(text(),\u0027Email Verify\u0027)]/following::main (tried for 10 second(s) with 500 MILLISECONDS interval)\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat com.finder.stepdefinitions.FinderAppSteps.click_on_import_from_csv_for_bulk_emailverify(FinderAppSteps.java:265)\r\n\tat ✽.Then click on import from csv for bulk emailverify(features/FinderApp.feature:46)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 279285100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 52,
  "name": "Verify that user is able to upload CSV file for Bulk EmailFinder",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailfinder",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 51,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "Read the test data  \"\u003cFinderTestData\u003e\" from Excel file for Finder",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "click on Bulk module",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "click on email finder for bulk emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "click on upload csv file button for bulk emailfinder",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "click on up arrow button to upload the file for bulk emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "select the fields in mapping screen window in bulk emailfinder",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "click on import from csv in bulk emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "verify list of valid emails will display or not in a grid view or tabular form",
  "keyword": "Then "
});
formatter.examples({
  "line": 63,
  "name": "",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailfinder;",
  "rows": [
    {
      "cells": [
        "FinderTestData"
      ],
      "line": 64,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailfinder;;1"
    },
    {
      "cells": [
        "FinderTestData1"
      ],
      "line": 65,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailfinder;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2628800,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "Verify that user is able to upload CSV file for Bulk EmailFinder",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-emailfinder;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 51,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "Read the test data  \"FinderTestData1\" from Excel file for Finder",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "click on Bulk module",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "click on email finder for bulk emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "click on upload csv file button for bulk emailfinder",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "click on up arrow button to upload the file for bulk emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "select the fields in mapping screen window in bulk emailfinder",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "click on import from csv in bulk emailfinder",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "verify list of valid emails will display or not in a grid view or tabular form",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FinderTestData1",
      "offset": 21
    }
  ],
  "location": "FinderAppSteps.read_the_test_data_from_Excel_file_for_Finder(String)"
});
formatter.result({
  "duration": 106319800,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Bulk_module()"
});
