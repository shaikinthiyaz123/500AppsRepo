Feature: Test the functionaliy of the finder app in 500apps portal 

@Finder
Scenario Outline: Verify user is able to Search Emails by Using DomainSearch 
Given Read the test data  "<FinderTestData>" from Excel file for Finder
	
	When Enter the DomainName for Domainsearch
	Then click on Find Email Address  
			
	Examples: 
		| FinderTestData  |
		| FinderTestData1 |
		
@Finder 
Scenario Outline: Verify that user is able to Find Email id status by giving data in First name , Last name, Domain name 
				
Given Read the test data  "<FinderTestData>" from Excel file for Finder 
	
	When click on Email_Finder module
	And Enter FN LN and DN for Emailfinder
	Then click on Find 
Examples: 
		| FinderTestData  |
		| FinderTestData1 |
	
@Finder
Scenario Outline: Verify that user is able to verify email id
Given Read the test data  "<FinderTestData>" from Excel file for Finder
    
    When click on Email_Verify module
    And enter the email address for Emailverify
    Then click on find Button 

    Examples: 
		| FinderTestData  |
		| FinderTestData1 |
@Finder     
Scenario Outline: Verify that user is able to upload CSV file for Bulk EmailVerify 

Given Read the test data  "<FinderTestData>" from Excel file for Finder
   
    When click on Bulk module
    Then click on upload csv file button for bulk emailverify
    And  click on up arrow button to upload the file for bulk emailverify
    Then select the fields in mapping screen window for bulk emailverify
    Then click on import from csv for bulk emailverify
    
    Examples: 
		| FinderTestData  |
		| FinderTestData1 |
@Finder    
Scenario Outline: Verify that user is able to upload CSV file for Bulk EmailFinder 
Given Read the test data  "<FinderTestData>" from Excel file for Finder
    
    When click on Bulk module
    And click on email finder for bulk emailfinder
    Then click on upload csv file button for bulk emailfinder
    And  click on up arrow button to upload the file for bulk emailfinder
    Then select the fields in mapping screen window in bulk emailfinder
    And click on import from csv in bulk emailfinder
    Then verify list of valid emails will display or not in a grid view or tabular form

    Examples: 
		| FinderTestData  |
		| FinderTestData1 |   
@Finder      
Scenario Outline: Verify that user is able to upload CSV file for Bulk DomainSearch 
Given Read the test data  "<FinderTestData>" from Excel file for Finder
    
    When click on Bulk module
    And click on domain search for bulk domain search
    Then click on upload csv file button for bulk domain search
    And  click on up arrow button to upload the file for bulk domain search
    Then select the fields in mapping screen window for bulk domain search
    And  click on import from csv for bulk domain search  
    Then verify user should get a download option after uploading a file for bulk domain search  
						
  Examples: 
		| FinderTestData  |
		| FinderTestData1 |
@Finder      
Scenario Outline: Verify that user is able to Add Edit and Delete list
Given Read the test data  "<FinderTestData>" from Excel file for Finder
    
    When click on Lists module
    And click on Add List
    And  enter the list name and save the list
    Then  Edit the List
    Then Delete the List
   
  Examples: 
		| FinderTestData  |
		| FinderTestData1 | 