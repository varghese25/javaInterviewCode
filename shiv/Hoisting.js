// What is Hoisting?
// JavaScript automatically moves all declarations (not assignments) to the top of their current scope (global or function) before the code actually runs.

// What gets hoisted?
// var declarations → hoisted (initialized with undefined).
// function declarations → hoisted completely (you can call them before they appear).
// let and const declarations → hoisted but not initialized (they stay in "Temporal Dead Zone" until they are defined).

// Example 1: var hoisting

console.log(a); // undefined
var a = 10;
console.log(a); // 10

//  Internally JavaScript does:
var a; // Hoisted declaration
console.log(a); // undefined
a = 10; // assignment stays in place
console.log(a); // 10

//Example 2: function hoisting

greet(); // "Hello!"

function greet() {
  console.log("Hello!");
}
// Full function gets hoisted, so you can call it before its definition.



//Example 3: let and const (not safe to use before declaration)

console.log(x); // ❌ ReferenceError
let x = 5;

//let and const are hoisted but not initialized immediately ➔ they cannot be accessed before the line where they are declared.
// This period is called the Temporal Dead Zone (TDZ).



// Quick Tip:
// var ➔ Hoisted + undefined

// function ➔ Hoisted completely

// let / const ➔ Hoisted but uninitialized (TDZ — Temporal Dead Zone)