# AdAssignment
## Technical Assignment - Shopping Basket
Write a program driven by unit tests that can price a basket of goods taking into account some special offers.
The goods that can be purchased, together with their normal prices are:

* Soup – 65p per tin
* Bread – 80p per loaf
* Milk – £1.30 per bottle
* Apples – £1.00 per bag
* Current special offers`

Apples have a 10% discount off their normal price this week
Buy 2 tins of soup and get a loaf of bread for half price
The program should accept a list of items in the basket and output the subtotal, the special offer discounts and the final price.

Input should be via the command line in the form PriceBasket item1 item2 item3 ...

* For example
PriceBasket Apples Milk Bread
Output should be to the console, for example:
Subtotal: £3.10
Apples 10% off: 10p
Total price: £3.00
If no special offers are applicable the code should output:
Subtotal: £1.30
(No offers available)
Total price: £1.3

## How to use the function

1. clone project from repository

`git clone https://github.com/wl02302677/AdAssignment/tree/dev-shopping-basket`

2. install java
3. install scala
4. install sbt
5. package jar file
6. run the jar file