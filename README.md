
# TJ-Tasks-2022-Devesh

### I did this Task in order to be eligible for Offline Interview of TechnoJam


# Easy Level Questions:

## Problem1 -> [Power Of 2](https://leetcode.com/problems/power-of-two/description/):

I did this Problem using the Following Approach

## Approach: 
We know that 2^x = n 

So x = log(n) / log(2)

I did this using Math Library in Java

And then I checked if 2^x = n using Math.pow(2, x)

if It is True return true else false

## Submitted Solution's Screenshot

![App Screenshot](https://github.com/devesh1011/TJ-Tasks-2022-Devesh/blob/master/Images/Screenshot%202022-11-14%20171208.png?raw=true)

## Problem2 -> [Negative-Positive Existential Crisis](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/):

I did this Problem using the Following Approach

## Approach: 

First I declared 2 variables i = 0  and j = length of array - 1

Then using a while loop I checked if arr[i] + arr[j] == 0 if it is return arr[j]
if sum < 0 then i++;
else j++;

The Time Complexity of this Algorithm is O(n).

## Submitted Solution's Screenshot

![App Screenshot](https://github.com/devesh1011/TJ-Tasks-2022-Devesh/blob/master/Images/Screenshot%202022-11-14%20175140.png?raw=true)

## Problem3 -> [Number of Common Factors](https://leetcode.com/problems/number-of-common-factors/):

I did this Problem using the Following Approach

## Approach: 

For this I declared a count variable to get count of factors. Then by using a For loop from i = 1 to a I first checked if a % i == 0 then with nested if I checked the same for b and If conditions satisfied then I increase the count by 1.


## Submitted Solution's Screenshot

![App Screenshot](https://github.com/devesh1011/TJ-Tasks-2022-Devesh/blob/master/Images/Screenshot%202022-11-14%20175456.png?raw=true)

## Problem4 -> [Maximum 69 Number](https://leetcode.com/problems/maximum-69-number/):

I did this Problem using the Following Approach

## Approach: 

For this I created an array of integer in which i filled 0 then I ran while loop in which I calculated the reminder of that number dividing by 10 and adding that reminder to the array until number becomes equal to zero.
Then I ran a loop on the array and checked if number == 6 if it is I replaced that number with 9 and then using break I came out of the loop.
Then I created a variable ans = 0 and mul = 1 i did just the reverse what i did using while loop.

## Submitted Solution's Screenshot

![App Screenshot](https://github.com/devesh1011/TJ-Tasks-2022-Devesh/blob/master/Images/Screenshot%202022-11-14%20180023.png?raw=true)
