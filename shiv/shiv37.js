const numbers = [1, 3, 5, 7, 9];
const hasEven = numbers.some((num) => num % 2 === 0);
const hasGreaterThanTen = numbers.some((num) => num > 10);
console.log(hasEven);
console.log(hasGreaterThanTen);

/*
*** All odd numbers and less than 10 ***

1) if the array has an even number.
.some() checks if at least one element in the array passes. 
Here is: num % 2 === 0 -> It means the number is even (divisible by 2).
 
 Array: [1, 3, 5, 7, 9]
None of them are even -> So the result is: hasEven = false.

console.log(hasEven); // false


2) If any number is greater than 10.
Array: [1, 3, 5, 7, 9] Largest number is 9. 
None are greater than 10 -> hasGreaterThanTen = false.

console.log(hasGreaterThanTen); // false*/
