let x = 10;
(function () {
  // This is an Immediately Invoked Function Expression (IIFE) (function () { ... })();.
  console.log(x);
  var x = 20;
  //   console.log(x);
  // The first console.log(x) will output 'undefined' because of hoisting.
  // The second console.log(x) will output '20' because 'x' is now defined within the IIFE.
})();
