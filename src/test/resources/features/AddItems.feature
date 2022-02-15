Feature: Add Items to Cart

Scenario: Login
Given User Login into App


Scenario: Add Items to Cart
Given User adding Items
 #Examples:
 #|Items|
 #|Samsung Galaxy S7|
 #|Iphone 6 32gb|
 #|Sony xperia z5| 

Scenario: Deleting items from cart
When user delets "IPhone 6 32gb"
 #Examples:
 #|DelItems|
 #|Samsung Galaxy S7|
 #|Iphone 6 32gb|
# |Sony xperia z5|
Then cart should be updated