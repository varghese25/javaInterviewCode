let count = 0; // Global variable count is 0.
(function () {
  //Inside the function:
  // IIFE (Immediately Invoked Function Expression)
  if (count === 0) {
    let count = 1; // Declares a new local count inside if block.
    console.log(count); //  Logs local count -> 1)
  }
  console.log(count); // Outside the if, console.log(count); ->Refers to global count -> 0.
})();
// The output of the above code will be:
// 1 (from inside the if block) and then 0 (from outside the if block).
// So the final output will be: 1 0