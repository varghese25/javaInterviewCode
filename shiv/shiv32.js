console.log("A"); // 1
setTimeout(() => console.log("B"), 0); // 4 (Macrotask)

Promise.resolve().then(() => {
  // 2 (microtask)
  console.log("C"); // 5

  setTimeout(() => console.log("D"), 0); // 6 (macrotask)
});
console.log("E"); // 3

// Output: A E C B D
// Explanation:
/**
    * Execution Order

1) All synchronous code (top to bottom)

2) microtasks (e.g. .then() callbacks from Promises)

3) macrotasks (e.g. setTimeout, setInterval)
    */

/*
console.log("A");       // Synchronous
setTimeout(...);        // Synchronous setup (callback runs later)
Promise.resolve().then(...); // Scheduling, not the .then body
console.log("E");       // Synchronous




console.log("A") → prints "A" immediately

setTimeout(...) → schedules "B" to run later, doesn't print now

Promise.resolve().then(...) → schedules "C" to run after synchronous code

console.log("E") → prints "E" immediately*/
