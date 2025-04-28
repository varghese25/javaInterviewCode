hoist();
function hoist() {
  console.log("Hoisted!"); // This will hoist the function declaration
} // This will hoist the function declaration

var hoist = function () {
  // This will not hoist the function expression
  // This is a function expression, not a declaration
  console.log("Not hoisted!");
};
