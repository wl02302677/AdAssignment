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

## Project structure
1. lib: main directory
   1. discountStrategy (strategy pattern)
      1. trait: DiscountStrategy
      2. implement1: ApplesDiscountStrategy
      3. implement2: SoupBreadDealDiscountStrategy
   2. DiscountCalculator: calculate discount 
   3. PriceBasket: main logic to calculate subtotal, offerDiscounts, totalPrice

## How to use the function

1. clone project from repository

`git clone https://github.com/wl02302677/AdAssignment/tree/dev-shopping-basket`

- Jump to step 5 if no need set up environment
2. install java & set up to path

   - download java jdk
   https://www.openlogic.com/openjdk-downloads
    
   - set java Xpath 
    
     1. `windows + R`
     2. key `sysdm.cpl`
     3. click: advance - environment variable
     4. System variable - add -> variable name: JAVA_HOME, value:C:\Program Files\Java\[jdk_your_version]
     5. System variable find [path] and edit it -> add %JAVA_HOME%\bin on it
3. install scala & set up to path
    - get the scala from https://www.scala-lang.org/download/
     1. unzip or install on [path]
     2. `windows + R`
     3. key `sysdm.cpl`
     4. click: advance - environment variable
     5. System variable - add -> variable name: SCALA_HOME, value:[your_scala_path] EX: c:\Progra~1\Scala
     6. System variable find [path] and edit it -> add %SCALA_HOME%\bin on it
4. install sbt
follow the official way to install sbt by different os
   - https://www.scala-sbt.org/download.html

5. package jar file
    
    `cd [path_of_repositrory]/`
    ` sbt assembly `

6. run the jar file
    - `java -jar PriceBasketTest.jar [item1] [item2] [item3] ...`
    - ex: `java -jar PriceBasketTest.jar Apples Apples Milk Bread`