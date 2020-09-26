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
  "duration": 17664400,
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
  "duration": 4269296700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.enter_the_DomainName_for_Domainsearch()"
});
formatter.result({
  "duration": 8971314500,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Find_Email_Address()"
});
formatter.result({
  "duration": 13440199900,
  "status": "passed"
});
formatter.after({
  "duration": 3810700,
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
  "duration": 2435600,
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
  "duration": 116917500,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Email_Finder_module()"
});
formatter.result({
  "duration": 357322100,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.enter_FN_LN_and_DN_for_Emailfinder()"
});
formatter.result({
  "duration": 1776991400,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Find()"
});
formatter.result({
  "duration": 6640892000,
  "status": "passed"
});
formatter.after({
  "duration": 731200,
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
  "duration": 1983500,
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
  "duration": 621198300,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Email_Verify_module()"
});
formatter.result({
  "duration": 740917700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.enter_the_email_address_for_Emailverify()"
});
formatter.result({
  "duration": 3387022800,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_find_Button()"
});
formatter.result({
  "duration": 862126000,
  "status": "passed"
});
formatter.after({
  "duration": 735900,
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
  "duration": 1776900,
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
  "duration": 135807200,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Bulk_module()"
});
formatter.result({
  "duration": 337890300,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_upload_csv_file_button_for_bulk_emailverify()"
});
formatter.result({
  "duration": 4053331700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_up_arrow_button_to_upload_the_file_for_bulk_emailverify()"
});
formatter.result({
  "duration": 7117802300,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.select_the_fields_in_mapping_screen_window_for_bulk_emailverify()"
});
formatter.result({
  "duration": 226394200,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_import_from_csv_for_bulk_emailverify()"
});
formatter.result({
  "duration": 16546427900,
  "status": "passed"
});
formatter.after({
  "duration": 1654500,
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
  "duration": 1545700,
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
  "duration": 145894000,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Bulk_module()"
});
formatter.result({
  "duration": 250597800,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_email_finder_for_bulk_emailfinder()"
});
formatter.result({
  "duration": 233393700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_upload_csv_file_button_for_bulk_emailfinder()"
});
formatter.result({
  "duration": 218604000,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_up_arrow_button_to_upload_the_file_for_bulk_emailfinder()"
});
formatter.result({
  "duration": 5773375100,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.select_the_fields_in_mapping_screen_window_in_bulk_emailfinder()"
});
formatter.result({
  "duration": 409652700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_import_from_csv_in_bulk_emailfinder()"
});
formatter.result({
  "duration": 66256800,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.verify_list_of_valid_emails_will_display_or_not_in_a_grid_view_or_tabular_form()"
});
formatter.result({
  "duration": 11786818100,
  "status": "passed"
});
formatter.after({
  "duration": 689100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 67,
  "name": "Verify that user is able to upload CSV file for Bulk DomainSearch",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-domainsearch",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 66,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 68,
  "name": "Read the test data  \"\u003cFinderTestData\u003e\" from Excel file for Finder",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "click on Bulk module",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "click on domain search for bulk domain search",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "click on upload csv file button for bulk domain search",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "click on up arrow button to upload the file for bulk domain search",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "select the fields in mapping screen window for bulk domain search",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "click on import from csv for bulk domain search",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "verify user should get a download option after uploading a file for bulk domain search",
  "keyword": "Then "
});
formatter.examples({
  "line": 78,
  "name": "",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-domainsearch;",
  "rows": [
    {
      "cells": [
        "FinderTestData"
      ],
      "line": 79,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-domainsearch;;1"
    },
    {
      "cells": [
        "FinderTestData1"
      ],
      "line": 80,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-domainsearch;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1468600,
  "status": "passed"
});
formatter.scenario({
  "line": 80,
  "name": "Verify that user is able to upload CSV file for Bulk DomainSearch",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-upload-csv-file-for-bulk-domainsearch;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 66,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 68,
  "name": "Read the test data  \"FinderTestData1\" from Excel file for Finder",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "click on Bulk module",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "click on domain search for bulk domain search",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "click on upload csv file button for bulk domain search",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "click on up arrow button to upload the file for bulk domain search",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "select the fields in mapping screen window for bulk domain search",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "click on import from csv for bulk domain search",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "verify user should get a download option after uploading a file for bulk domain search",
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
  "duration": 109253100,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Bulk_module()"
});
formatter.result({
  "duration": 270870700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_domain_search_for_bulk_domain_search()"
});
formatter.result({
  "duration": 267555800,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_upload_csv_file_button_for_bulk_domain_search()"
});
formatter.result({
  "duration": 221563700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_up_arrow_button_to_upload_the_file_for_bulk_domain_search()"
});
formatter.result({
  "duration": 5887498800,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.select_the_fields_in_mapping_screen_window_for_bulk_domain_search()"
});
formatter.result({
  "duration": 1754352400,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_import_from_csv_for_bulk_domain_search()"
});
formatter.result({
  "duration": 95133700,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.verify_user_should_get_a_download_option_after_uploading_a_file_for_bulk_domain_search()"
});
formatter.result({
  "duration": 18009039100,
  "status": "passed"
});
formatter.after({
  "duration": 420200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 82,
  "name": "Verify that user is able to Add Edit and Delete list",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-add-edit-and-delete-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 81,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 83,
  "name": "Read the test data  \"\u003cFinderTestData\u003e\" from Excel file for Finder",
  "keyword": "Given "
});
formatter.step({
  "line": 85,
  "name": "click on Lists module",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "click on Add List",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "enter the list name and save the list",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "Edit the List",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Delete the List",
  "keyword": "Then "
});
formatter.examples({
  "line": 91,
  "name": "",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-add-edit-and-delete-list;",
  "rows": [
    {
      "cells": [
        "FinderTestData"
      ],
      "line": 92,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-add-edit-and-delete-list;;1"
    },
    {
      "cells": [
        "FinderTestData1"
      ],
      "line": 93,
      "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-add-edit-and-delete-list;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1110400,
  "status": "passed"
});
formatter.scenario({
  "line": 93,
  "name": "Verify that user is able to Add Edit and Delete list",
  "description": "",
  "id": "test-the-functionaliy-of-the-finder-app-in-500apps-portal;verify-that-user-is-able-to-add-edit-and-delete-list;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 81,
      "name": "@Finder"
    }
  ]
});
formatter.step({
  "line": 83,
  "name": "Read the test data  \"FinderTestData1\" from Excel file for Finder",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 85,
  "name": "click on Lists module",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "click on Add List",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "enter the list name and save the list",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "Edit the List",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Delete the List",
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
  "duration": 76557300,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Lists_module()"
});
formatter.result({
  "duration": 272033100,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.click_on_Add_List()"
});
formatter.result({
  "duration": 4415612100,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.enter_the_list_name_and_save_the_list()"
});
formatter.result({
  "duration": 6185907600,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.edit_the_List()"
});
formatter.result({
  "duration": 4786377600,
  "status": "passed"
});
formatter.match({
  "location": "FinderAppSteps.delete_the_List()"
});
formatter.result({
  "duration": 5464929800,
  "status": "passed"
});
formatter.after({
  "duration": 873400,
  "status": "passed"
});
});