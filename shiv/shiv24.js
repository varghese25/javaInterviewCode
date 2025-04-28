// Acutal code
var x = 5;
(function () {
  console.log(x);
  var x = 10;
})();

/* JavaScript:  After hoisting, it looks like this internally: 
Inside the JavaScript engine, the code is transformed to this:


(function () {
  var x;         // Declaration hoisted at the top inside the function
  console.log(x); // x is declared but not initialized yet, so it's undefined
  x = 10;
})();*/

// Output: undefined
