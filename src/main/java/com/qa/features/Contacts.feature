Feature: Free CRM Contact Page Test


Scenario: Add 5 Contacts
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Moveover to New Contact Page
And Verify New Contact Form
Then User Enter New Contacts and Save


Scenario: Verify Created Contacts
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Contact Page
Then Verify all contact name


Scenario Outline: Combine Form Fill Test
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Moveover to Combile form Page
Then User Enter New Company "<Company>" "<Industry>" "<AnnualRevenue>" "<Employees>" "<Identifier>" "<Website>" "<Email>" "<Phone>" "<Fax>"
And Enter Contact Detail "<Title>" "<Firstname>" "<Middlename>" "<Lastname>" "<NickName>" "<Possition>" "<Department>"

Examples: 
|  Company  |  Industry | Annual Revenue| Employees | Identifier |        Website         |          Email          |     Phone     |    Fax     | Title  | Firstname   | Middlename   |  Lastname   |  NickName | Possition  |  Department   |
| Company 1 | Industry 1|     10000000  |    20     |     C1     | www.company1.com       | company2@gmail.com      | 1111111111    |  Fax 1     |  Mr.   | First Name 1| Middle Name 1| Last Name 1 |   Nich 1  | Possition 1| Department 1  |
| Company 2 | Industry 2|      2000000  |    30     |     C2     | www.company11.com      | company3@gmail.com      | 2222222222    |  Fax 2     |  Dr.   | First Name 2| Middle Name 2| Last Name 2 |   Nich 2  | Possition 2| Department 2  |
| Company 3 | Industry 3|     30000000  |    40     |     C3     | www.company20.com      | company13gmail.com      | 3333333333    |  Fax 3     |  Ms.   | First Name 3| Middle Name 3| Last Name 3 |   Nich 3  | Possition 3| Department 3  |
| Company 4 | Industry 4|      5000000  |    50     |     C4     | www.company3.com       | company4111@gmail.com   | 4444444444    |  Fax 4     |  Dr.   | First Name 4| Middle Name 4| Last Name 4 |   Nich 4  | Possition 4| Department 4  |
| Company 5 | Industry 5|      4100000  |    60     |     C5     | www.company4.com       | company41@gmail.com     | 5555555555    |  Fax 5     |  Ms.   | First Name 5| Middle Name 5| Last Name 5 |   Nich 5  | Possition 5| Department 5  |


