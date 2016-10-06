---
title: Writing Functions that use Iteration and Collections
type: Lab
duration: "1:30"
creator:
    name: Yuliya Kaleda
    city: NY
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Writing Functions that use Iteration and Collections

> ***Note:*** _This should be done independently._

##Objective:
- Demonstrate understanding of arrays and Lists


## Exercise

#### Requirements
Write 9 functions that accept parameters that use combinations of control flow and multiple conditionals. Some of these functions will also require you to iterate over data collections (Arrays, ArrayLists, LinkedLists). When a function is created, please call it in the main method and test all the cases including edge ones (e.g. empty strings, null values, big and small values). It is of high importance to practice and master Java fundamentals, which are the core of Android development.

#### Functions
1. Write a function `stringLengthOrValue` that accepts one `String` parameter. This function should print the value of the `String` parameter to the command line if the length of the `String` is greater than 5. If the length of the `String` is less than 5, print the length of the `String` parameter.

2. Write a function `reversedOrder` that accepts no parameters. This function should create an `int` array of size 10 and assign values 0-9 to each index in the array by using a `for loop`. It should then print out the values in reverse order using a separate `for loop` inside the function.

3. Write a function `maxValue` that accepts one `int` array parameter. This function should loop through the array to return the max value in that array. If the array is of size 1, the max value is the only item in the array. If the array is of size 10, how do we keep a record of the current max value when looping through the array?

4. Write a function `sumOfValues` that accepts a `double` array parameter. This function should loop through the array and ADD all the values in the array. It should then return the sum of the values, and print the returned value from within the calling function.

5. Write a function `charsToString` that takes in a `char` array parameter. This function should loop through the array and concatenate each `char` value into a `String`. It should then return the `String` that was created, and print the `String` from within the calling function.

6. Create a List of type `String` with the variable name `myStringList`. Add at least 5 unique `String` values to the list, and return it. Then print the values in the List from the calling function. **(Think about how to generate these strings using a loop)**

7. Write a function `reversedStringOrder` that accepts a List parameter of type `String`. The function should loop through the List and print each `String` in reverse order to the command line. Use the List you created in problem 6 as the parameter you give to the function.

8. Write in a function `printOrAdd` that accepts a List parameter of type `String`. The function should print all values in the list if the size of the List is equal to 10. If the size of the List is less than 10, add `Strings` of your choice to the list until the size equals 10. Finally, return the List and print its values from the calling function.

10. Write a function `findMiddle` that accepts an `int` array parameter. The function should then return the value from the array located at the middle index, and print it from the calling function.

#### Deliverable

You are expected to turn in a Java program with 9 functions. Be sure to test your functions thoroughly!

#### Resources

- [Collections](https://developer.android.com/reference/java/util/Collections.html)
