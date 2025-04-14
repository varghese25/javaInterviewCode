for (var i = 0; i < 3; i++) {
  // var is function-scoped
  // This is a loop that will run 3 times
  setTimeout(() => {
    // This is a function that will run after a delay of 100 milliseconds
    console.log(i); // This will log the value of i to the console
  }, 100);
} // Output: 3, 3, 3

/*What’s Happening Internally:
var is function-scoped — so there is only one variable i, shared across all iterations of the loop.

Each time setTimeout() is called, you're registering a callback to run after 100 milliseconds.

BUT… the loop doesn’t stop and wait — it completes very fast, and by the time 100ms passes, the loop is already done, and i has become 3.

So all three callbacks see the same i — which is 3 — and log it.*/

for (let i = 0; i < 3; i++) {
  // let is block-scoped
  setTimeout(() => {
    console.log(i);
  }, 100);
}
// Output: 0, 1, 2
