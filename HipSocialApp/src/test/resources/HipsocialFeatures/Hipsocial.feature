Feature: Test feature of Hipsocial in 500apps Portal 
	Description: Test Hipsocial App functionality

#Background: 
	
@Hipsocial
Scenario Outline: To create the category 
	Given Read Login Data from Excel "<TestData>" 
	 
	When User click on Streams Option 
	When  Click on Horizantal bars 
	Then  Click on CATEGORIES 
	And   Enter the Categorie Name 
	Then  Click on Save 
	
	Examples: 
		| TestData  |
		| TestData1 |
		
@Hipsocial 
Scenario Outline: To Edit the category 
		Given Read Login Data from Excel "<TestData>" 
		Then  Mousehover on existing category and click on ellipsis 
		And   Click on Edit option 
		Then 	Clear and enter the name 
		And Click on Update 
		Then Veriy the Message 
		Examples: 
			| TestData  |
			| TestData1 |
			
			
@Hipsocial 
Scenario Outline: To Delete the category 
			Given Read Login Data from Excel "<TestData>" 
			Then  Mousehover on existing category and click on ellipsis 
			And   Click on Delete option 
			And Click on Delete Button 
			Then Verify the Mesaage 
			
			Examples: 
				| TestData  |
				| TestData1 |

					
@Hipsocial			
Scenario Outline: To Add the Twitter Network 
				Given Read Login Data from Excel "<TestData>" 
				When User click on Streams Option 
				And Click on Twitter from Add Networks 
				And Switch to the next tab for Twitter site 
				Then Enter UserName Password and click on Authorise App
				Then Select the added network from the dropdown to verify
			Examples: 
					| TestData  |
					| TestData1 |
#@Hipsocial			 
Scenario Outline: To Add the Facebook LinkedIn and WordPress Networks
				Given Read Login Data from Excel "<TestData>" 
				When User click on Streams Option 
				And Click on Facebook from Add Networks 
				And Switch to the next tab for Facebook site 
				Then Enter UserName Password and click on Login
				Then Select the added Facebook network from the dropdown to verify
				When Click on LinkedIn from Add Networks 
				Then Switch to the next tab for LinkedIn site 
				And Enter UserName Password and click on Sign In
				Then Select the added LinkedIn network from the dropdown to verify
				When Click on WordPress from Add Networks 
				Then Switch to the next tab for Wordpress site 
				And Enter UserName Password and click on Sign In and aprove
				Then Select the added WordPress network from the dropdown to verify
				
				Examples: 
					| TestData  |
					| TestData1 |	
						
#@Hipsocial			
Scenario Outline: Add streams to the Twitter Network 
				Given Read Login Data from Excel "<TestData>" 
				When User click on Streams Option
				 Then Select the category from categories	
				And Select the twitter network from the add streams dropdown
				Then Click on Home and catch the Popup Message	
				And Click on Mentions and catch the Popup Message
				And Click on My Tweets and catch the Popup Message
				Then Click on likes and catch the Popup Message
				And Click on Retweets and catch the Popup Message
				And Click on Followers and catch the Popup Message
				And Click on Search and catch the Popup Message
				Then Click on Trends and catch the Popup Message
				
				
			Examples: 
					| TestData  |
					| TestData1 |
						
#@Hipsocial			
Scenario: Add streams to the FaceBook Network 
				 And Select the FaceBook network from the add streams dropdown
				And Click on Timeline and catch up the toaste message
				Then Click on Events and catch up the toaste message
				
#@Hipsocial			
Scenario:     Add streams to the LinkedIn and WordPress Network 
				When Select the LinkedIn network from the add streams dropdown
				And Click on MyPosts and catch up the toaste message
				When Select the WordPress network from the add streams dropdown
				And Click on Myposts and catch up the toaste message
				Then Click on Followers and catch up the toaste message
				
				
				
#@AddPost		
Scenario Outline: Add Post to a Network from Media Library
				Given Read Login Data from Excel "<TestData>" 
				When User click on Posts options
				And Click on Add Post and user should enter into Add Post page	
				Then Select the Network from dropdown	
				And enter the text in text field and choose the image from media library
				And click on post now radio button and click on post now button
				Then Verify the posts page under list view
				And Click on Add Post and user should enter into Add Post page	
				Then Select the Network from dropdown	
				And enter the text in text field and choose the image from media library
				And click on Save as Draft radio button and click on Save as Draft button
				Then Verify the posts page under list view
				And Click on Add Post and user should enter into Add Post page	
				Then Select the Network from dropdown	
				And enter the text in text field and choose the image from media library
				And click on Schedule radio button and enter the time and click on Schedule
				Then Verify the posts page under list view
				
				
			Examples: 
			| TestData  |
			| TestData1 |	
		
#@AddPost		
Scenario Outline: Add Post to a Network from the System
				Given  Read Login Data from Excel "<TestData>" 
				When User click on Posts options
				And Click on Add Post and user should enter into Add Post page	
				Then Select the Network from dropdown	
				And enter the text in text field and choose the image from Device	
				And click on post now radio button and click on post now button
				Then Verify the posts page under list view	
				When Click on Add Post and user should enter into Add Post page	
				Then Select the Network from dropdown	
				And enter the text in text field and choose the image from Device
				And click on Save as Draft radio button and click on Save as Draft button
				Then Verify the posts page under list view
				When Click on Add Post and user should enter into Add Post page	
				Then Select the Network from dropdown	
				And enter the text in text field and choose the image from Device			
				And click on Schedule radio button and enter the time and click on Schedule
				Then Verify the posts page under list view for schedule
				
			
			Examples: 
			| TestData  |
			| TestData1 |	
#@CalView		
Scenario Outline: Check the Posts in Calender view	
				Given  Read Login Data from Excel "<TestData>" 
				When User click on Posts options
				Then click on calender
				And Try Monthly views in Calendar view
				And Try weekly view in calender view
				And Try day view in calender view
				
Examples: 
			| TestData  |
			| TestData1 |	
#@Filterpost	
Scenario: Filter the posts with different selections for facebook
				When User click on Posts options
				Then filter the facebook network
				And Filtered the posts based on Published
				And Filtered the posts based on Scheduled
				And Filtered the posts based on Draft
				And Filtered the posts based on Rejected
				And Filtered the posts based on To approve
				And Filtered the posts based on Schedule expired
#@Filterpost			
Scenario: Filter the posts with different selections for Twitter
				When User click on Posts options
				Then filter the Twitter network	
				And Filtered the posts based on Published for Twitter
				And Filtered the posts based on Scheduled for Twitter
				And Filtered the posts based on Draft for Twitter
				And Filtered the posts based on Rejected for Twitter
				And Filtered the posts based on To approve for Twitter
				And Filtered the posts based on Schedule expired for Twitter
#@Filterpost		
Scenario: Filter the posts with different selections for LinkedIn
				When User click on Posts options
				Then filter the LinkedIn network	
				And Filtered the posts based on Published for LinkedIn
				And Filtered the posts based on Scheduled for LinkedIn
				And Filtered the posts based on Draft for LinkedIn
				And Filtered the posts based on Rejected for LinkedIn
				And Filtered the posts based on To approve for LinkedIn
				And Filtered the posts based on Schedule expired for LinkedIn		
			
#@Hipsocial			
Scenario Outline: Perform Like and Comment actions on LinkedIn
				Given Read Login Data from Excel "<TestData>" 
				When User click on Streams Option	
				Then click on a category
				And  Select the added LinkedIn network from the dropdown to verify
				Then Click on MyPosts and catch up the toaste message
				And Like a post in LinkedIn
				And Comment a post
				Then Delete the MyPosts Stream
														
Examples: 
			| TestData  |
			| TestData1 |							
								
				
				
								
			
#@Hipsocial			
Scenario Outline: Perform Like and Comment actions on FaceBook
				Given Read Login Data from Excel "<TestData>" 
				When User click on Streams Option	
				Then click on a category				
				And Select the FaceBook network from the add streams dropdown
				And Click on Timeline
				Then click on like 
				And click on Comment and enter the comment
					
					
					
					
		Examples: 
			| TestData  |
			| TestData1 |	
#@Hipsocial			
Scenario Outline: Perform Reply Retweet Like and Follow Actions on Twitter
				Given Read Login Data from Excel "<TestData>" 
				When User click on Streams Option	
				Then click on a category for twitter
				And Select the twitter network from the add streams dropdown
				Then Click on Home and catch the Popup Message	
				And Perform Like Action and catch up the toaste message
				And Perform Retweet Action and catch up the toaste message
				And Perform Reply Action and catch up the toaste message
				And Perform Follow Action and catch up the toaste message
				Then Delete the Home Stream
		Examples: 
			| TestData  |
			| TestData1 |			

			

#@media		
Scenario: Verify the user is able to add Image to media library
				 
				When click on Settings Icon
				And click on Media Library
				Then click on Add Media
				And browse the media from the system
				And choose the category
				Then click on Save button
				And catch the toaste message
				#And Select default category
#@media		
Scenario: Verify the user is able to add Video to media library
				
				When click on Settings Icon
				And click on Media Library
				Then click on Add Media
				And browse the Video from the system
				 And choose the category for video
				Then click on Save button
				And catch the toaste message
				#And Select default category
				Then Click on Videos Option			
#@media		
Scenario: Verify the user is able to add Audio to media library
				
				When click on Settings Icon
				And click on Media Library
				Then click on Add Media
				And browse the Audio from the system
				And choose the category for audio
				Then click on Save button
				And catch the toaste message
				#And Select default category
				Then Click on Videos Option	
				Then Click on Autdios Option	
#@Approve				
Scenario Outline: Manager Approval post on Facebook
				   Given Read Login Data from Excel "<TestData>" 	
				   When User is in Manage Approvals page
				   Then select network and manager form drop down to map the manger
				   And Click on save to map the manager 
				   And verify manager mapped or not for the Perticular network
				   Then go to the posts page and publish a post for required network	
				   And verify records are added on posts page or not as to approve
				   Then go to the manager account
				   And approve or reject the posts
				   Then navigate back to user account 
				   And verify published status
				   Then go to the published network streem and see the post
				   
				   
		Examples: 
			| TestData  |
			| TestData1 |	
#@Approve				
Scenario Outline: Manager Approval post on Twitter
				   Given Read Login Data from Excel "<TestData>" 	
				   When User is in Manage Approvals page
				   Then select network and manager form drop down to map the manger for twitter
				   And Click on save to map the manager 
				   And verify manager mapped or not for the twitter network
				   Then go to the posts page and publish a post for twitter network	
				   And verify records are added on posts page or not as to approve
				   Then go to the manager account
				   And approve the posts for twitter
				   Then navigate back to user account 
				   And verify published status
				   Then go to the twitter network streem and see the post
				   
				   
		Examples: 
			| TestData  |
			| TestData1 |
#@Approve				
Scenario Outline: Manager Approval post on LinkedIn
				   Given Read Login Data from Excel "<TestData>" 	
				   When User is in Manage Approvals page
				   Then select network and manager form drop down to map the manger for LinkedIn
				   And Click on save to map the manager 
				   And verify manager mapped or not for the LinkedIn network
				   Then go to the posts page and publish a post for LinkedIn network	
				   And verify records are added on posts page or not as to approve
				   Then go to the manager account
				   And approve the posts for LinkedIn
				   Then navigate back to user account 
				   And verify published status
				   Then go to the LinkedIn network streem and see the post
				   
				   
		Examples: 
			| TestData  |
			| TestData1 |									 
#@Reject				
Scenario Outline: Manager Reject post on Facebook
				   Given Read Login Data from Excel "<TestData>" 	
				   When User is in Manage Approvals page
				   Then select network and manager form drop down to map the manger
				   And Click on save to map the manager 
				   And verify manager mapped or not for the Perticular network
				   Then go to the posts page and publish a post for required network	
				   And verify records are added on posts page or not as to approve
				   Then go to the manager account
				   And reject the posts for facebook
				   Then navigate back to user account 
				   And verify Rejected status for facebook
				   Then delete the facebook manager 
				   
				   
		Examples: 
			| TestData  |
			| TestData1 |	
#@Reject		
Scenario Outline: Manager Reject post on Twitter
				   Given Read Login Data from Excel "<TestData>" 	
				   When User is in Manage Approvals page
				   Then select network and manager form drop down to map the manger for twitter
				   And Click on save to map the manager 
				   And verify manager mapped or not for the twitter network
				   Then go to the posts page and publish a post for twitter network	
				   And verify records are added on posts page or not as to approve
				   Then go to the manager account
				   And reject the posts for twitter
				   Then navigate back to user account 
				   And verify Rejected status twitter
				   Then delete the twitter manager in manage approvals
	Examples: 
			| TestData  |
			| TestData1 |	
							

#@Reject			
Scenario Outline: Manager Reject post on LinkedIn
				   Given Read Login Data from Excel "<TestData>" 	
				   When User is in Manage Approvals page
				   Then select network and manager form drop down to map the manger for LinkedIn
				   And Click on save to map the manager 
				   And verify manager mapped or not for the LinkedIn network
				   Then go to the posts page and publish a post for LinkedIn network
				   And verify records are added on posts page or not as to approve
				   Then go to the manager account
				   And reject the posts for LinkedIn
				   Then navigate back to user account 
				   And verify Rejected status LinkedIn
				   Then delete the LinkedIn manager in manage approvals
	Examples: 
			| TestData  |
			| TestData1 |										   			 				   							  				
#@DelAddNet				
Scenario Outline: Delete and add the networks in Manage Networks
				   Given Read Login Data from Excel "<TestData>" 	
				   When User clicked on Settings icon	
				   And click on Manage Networks
				   And click on twitter in Manage Network
				   And delete the Twitter Network
				   Then click on Facebook network
				   And deltete facebook network
				   Then click on LinkedIn network
				   And delete LinkedIn network
				   Then click on Wordpress network
				   And delete Wordpress network
				   Then click on Twitter to add the account
				  And verify account added or not
				  Then click on Facebook to add the account
				  And verify account added or not
				  Then click on LinkedIn to add the account
				  And verify account added or not
				  Then click on Wordpress to add the account
				  And verify account added or not
				  
	Examples: 
			| TestData  |
			| TestData1 |		

				   
				   
				   
				   
				   
				   
				   
				   							
			