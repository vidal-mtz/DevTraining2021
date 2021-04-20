# DevTraining2021

On this repository, I publish a Exercise of Algorithms on java, for ech one of exercises you need to use the next 
command lines:

* Clean project - mvn clean
* Test the algorithm with Test Unit - mvn test

**Notes:** 
* On te creation of projects, we use Apache maven v 3.6.1 
* This examples use JUnit Lib  v4.13.1

> **Kata**

You will be given a series of whole numbers. Take that matrix and find the index N where the sum of the integers to the left of N equals the sum of the integers to the right of N. If there is no index that does this, return - 1.

> Examples:

* **Example1:** Suppose you are given the array {1,2,3,4,3,2,1}: Your function will return the index 3, because in the third position of the array, the sum of the left side of the index ({ 1,2,3}) and the sum on the right side of the index ({3,2, 1}) both equal 6.
* **Example2:** You are given the matrix {1,100,50, -51,1,1}: Your function will return the index 1, because in the first position of the matrix, the sum of the left side of the index ({1}) and the sum of the right side of the index ({50, -51,1,1}) both are equal to 1.
* **Example3:** You are given the matrix {20,10, -80,10,10,15,35}. At index 0, the left side is {} The right side is {10, -80,10,10,15,35} Both are equal to 0 when added. (The empty arrays are equal to 0 in this problem)
Index 0 is the place where the left side and the right side are equal.

> Important

Remember that in most programming languages ​​the index of an array starts at 0.

> Tickets:

An integer array of length 0 <arr <1000. The numbers in the array can be any positive or negative integer.

> Departures

The lowest index N where the left hand side of N equals the right hand side of N. If it cannot find an index that conforms to these rules, it will return -1.