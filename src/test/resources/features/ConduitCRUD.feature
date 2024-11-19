Feature: Conduit CRUD Functions

Scenario: Login into App

Given User is on Login page
When User  provide "TestUserBot@testmail.com" and "TestUserBot"
#Examples:
# | TestUserBot@testmail.com | TestUserBot |
Then User should be on home page

Scenario: Create a new Article
Given User should be on New Article Page
When User  enters Article details
| title | Desc | Content | tag |
| TestArticleDemo | New Description | TestContent | TestTag |
Then Article must be created

Scenario: View Article
Given User should be on Global Feed Page
When User select an article "TestArticleDemo"
Then Article details must be displayed

Scenario: Update an Article
Given Artilce detail page must be displayed
When User update article detail
Then Article detail must be updated

Scenario: Delete an Article
Given Article detail page must be displayed
When User delete article
Then Article must be deleted