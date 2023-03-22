## 30 Days of Code - Day 2 - Operators

### Objective

In this challenge, you will work with arithmetic operators.

### Task

Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax
percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round
the result to the nearest integer.

### Example

<i>mealCost</i> = 100<br>
<i>tipPercent</i> = 15<br>
<i>taxPercent</i> = 8

A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value 123 and return from the function.

### Function Description

Function <b>solve</b> has the following parameters:

<ul>
<li>double mealCost: the cost of food before tip and tax </li>
<li>int tip_percent: the tip percentage</li>
<li>int tax_percent: the tax percentage</li>
</ul>

Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

<b>Note:</b> Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

### Input Format

There are 3 lines of numeric input:

1. The first line has a ```double``` <i>mealCost</i>, (the cost of the meal before tax and tip).
2. The second line has an integer, <i>tipPercent</i> (the percentage <i>mealCost</i> of being added as tip).
3. The third line has an integer, <i>taxPercent</i> (the percentage of <i>mealCost</i> being added as tax).

### Sample Input

```
12.00
20
8
```

### Sample Output

```
15
```

### Explanation

Given:<br>
<i>mealCost</i> = 12, <i>tipPercent</i> = 20, <i>taxPercent</i> = 8

Calculations:<br>
<i>tip</i> = 12 and (12 x 20) / 100 = 2.4<br>
<i>tax</i> = 8 and (8 x 12) / 100 = 0.96<br>
<i>totalCost</i> = <i>mealCost</i> + <i>tip</i> + <i>tax</i> = 12 + 2.4 + 0.96 = 15.36<br>
<i>round(totalCost)</i> = 15<br>
We round <i>totalCost</i> to the nearest integer and print the result, 15.
