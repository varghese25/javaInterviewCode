const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
};
// Destructuring
//let { firstName: name, lastName, country = "India " } = person; // firstName i used Alias as name. console,log(name) will print firstName value
// console.log(firstName);
// console.log(age);
// console.log(country);
// console.log(name);

// String Destructuring
// Create a String
let tiju = "W3Schools"; // a1 = W, a2 = 3, a3 = S, a4 = c, a5 = h;
// Destructuring
let [a1, a2, a3, a4, a5] = tiju;
console.log(a5);

//Array Destructuring
const fruits = ["Bananas", "Oranges", "Apples", "Mangos"];
// Destructuring
let [fruit1, fruit2] = fruits;
console.log(fruit2);

// Skipping Array Values
// Create an Array
// const fruito = ["Bananas", "Oranges", "Apples", "Mangos"];
// // Destructuring
// let [fruito1, , , fruito2] = fruito;

//Array Position Values
// We can pick up values from specific index locations of an array:

const fruito = ["Bananas", "Oranges", "Apples", "Mangos"];
// Destructuring
let { [0]: fruito1, [1]: fruito2 } = fruito;
console.log("Array Postion Values One is:" + fruito2);

// The Rest Property
// You can end a destructuring syntax with a rest property.
// This syntax will store all remaining values into a new array:
// Create an Array
const numbers = [10, 20, 30, 40, 50, 60, 70];
// Destructuring
const [a, b, ...rest] = numbers;
console.log(a, b, rest);

//Destructuring Maps
// Create a Map
const fruitss = new Map([
  ["Bananas", 100],
  ["Oranges", 200],
  ["Apples", 300],
  ["Mangos", 400],
]);

// Destructuring
let text = " ";
for (let [key, value] of fruitss) {
  text += key + " = " + value + " ";
}
console.log(text);
// Destructuring with forEach

//Swapping JavaScript Variables
//You can swap the values of two variables using a destructuring assignment:
let firstName = "Varghese ";
let lastName = "Baby ";
[firstName, lastName] = [lastName, firstName];
console.log(firstName, lastName);
