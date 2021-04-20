# DevTraining2021

On this repository, I publish a Exercise of Algorithms on java, for ech one of exercises you need to use the next 
command lines:

* Clean project - mvn clean
* Test the algorithm with Test Unit - mvn test

**Notes:** 
* On te creation of projects, we use Apache maven v 3.6.1 
* This examples use JUnit Lib  v4.13.1

> MinMax

Jhon has an idea to make a profit: he buys something and resells it. Of course, this wouldn't give you any profit if you were just going to buy and sell it at the same price. Instead, you will buy it at the lowest possible price and sell it at the highest price.

Write a function that returns the minimum and maximum number from the given list / array.

* minMax({1,2,3,4,5}) => {1,5}
* minMax({2334454,5}) => {5,2334454}
* minMax({1}) => {1,1}

> Exercise Note:
All arrays or lists will always have at least one element, so you don't need to check the length. Also, your function will always get an array or a list, you don't have to search for null, undefined or the like.