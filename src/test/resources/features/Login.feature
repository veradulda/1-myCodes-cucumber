Feature: Login feature of library app
    User Story:
    As a user, I should be able to login with correct credentials to different
    accounts. And dashboard should be displayed.

    Accounts are: librarian, student, admin

    @employee @human
    Scenario: Login as a librarian
       When user enter librarian username
       And user enter librarian password
       Then user should see the dashboard

    @human
    Scenario: Login as a student
        When user enter student username
        And user enter student password
        Then user should see the dashboard

    @employee @human @admin
    Scenario: Login as an admin
        When user enter admin username
        And user enter admin password
        Then user should see the dashboard





