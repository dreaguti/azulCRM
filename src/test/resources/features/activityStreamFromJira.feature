@B32G21-166
Feature: Activity Stream Page Options Verification
		#@B32G21-170 - Pre-Condition
		Background: User is already on the login page
		    Given user is on the login page

	#AC1: Verify that the user views the following options on the Activity Stream page.
			#MESSAGE
			#TASK
			#EVENT
			#POLL
			#MORE
	@B32G21-164
	Scenario Outline: Verify that the user views the following options on the Activity Stream page
		And user is logged in as "<userType>" user
		    And user is on the Activity Stream page
		    Then user should see "<headerText>" is displayed
		
		    Examples:
		      | userType  | headerText                       |
		      | hr        | Message, Text, Event, Poll, More |
		      | helpdesk  | Message, Text, Event, Poll, More |
		      | marketing | Message, Text, Event, Poll, More |	

	#AC2: Verify that the user views the following 4 options under the MORE tab.
			#File
			#Appreciation
			#Announcement
			#Workflow
	@B32G21-165
	Scenario Outline: Verify that the user views the following 4 options under the MORE tab.
		And user is logged in as "<userType>" user
		    And user is on the Activity Stream page
		    And clicks on More dropdown
		    Then user should see "<option>" is displayed
		
		    Examples:
		      | userType  | option                                 |
		      | hr        | File, Appreciation, Announcement, Poll |
		      | helpdesk  | File, Appreciation, Announcement, Poll |
		      | marketing | File, Appreciation, Announcement, Poll |