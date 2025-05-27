const obj = {
  name: "Alice",
  greet: function () {
    console.log(`Hello, ${this.name}`);
  },
  delayedGreet: function () {
    setTimeout(this.greet, 1000);
  },
};
// obj.delayedGreet();
/*
Problem: this.greet is passed to setTimeout, but loses its original context (obj).

So when this.greet is called after 1 second, this is no longer referring to obj, but to the global object (window in browser or undefined in strict mode).

Therefore, inside greet, this.name becomes:

undefined in strict mode.

Or window.name, which is usually an empty string in browsers.*/
