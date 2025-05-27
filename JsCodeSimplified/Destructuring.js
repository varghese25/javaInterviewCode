const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
};
// Destructuring
let { firstName: name, lastName, country = "India " } = person; // firstName i used Alias as name. console,log(name) will print firstName value
// console.log(firstName);
// console.log(age);
console.log(country);
console.log(name);

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
const fruito = ["Bananas", "Oranges", "Apples", "Mangos"];
// Destructuring
let [fruito1, , , fruito2] = fruito;
