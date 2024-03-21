@B32G21-156
Feature: Default

	
	@B32G21-153
	Scenario:  Verify that the user can send a message by filling in the mandatory fields.
		Feature : MESSAGE functionality 
		 Scenarios :User should be able to send the massage by clicking the tab in the Activity Stream 
		 Given user is logged in as "<userType>" user
		When User clicks message option on the page .
		And user enter a message "Test"
		And user clicks Send button 
		Then user sees the message sent 
		 Examples:
		      | userType  |
		      | hr        |
		      | helpdesk  |
		      | marketing |	

	
	@B32G21-154
	Scenario Outline: Verify that the message delivery is to 'All employees' by default.
		Given user is logged in as "<userType>" user
		When User clicks message option on the page .
		And user enter a message "Test"
		And user clicks Send button 
		Then user sees the message sent 
		Then user sees the 'All employees' option is selected by default.
		    Examples:
		      | userType  |
		      | hr        |
		      | helpdesk  |
		      | marketing |	

	
	@B32G21-155
	Scenario Outline: verify user be able to cancel send message at any time before sending 
		Given user is logged in as "<userType>" user
		When User clicks message option on the page .
		And user enter a message "Test"
		And user clicks Send button 
		Then user sees the message sent 
		Then user sees the 'All employees' option is selected by defaul.
		And user be able to cancel send message at any time before send it 
		    Examples:
		      | userType  |
		      | hr        |
		      | helpdesk  |
		      | marketing |