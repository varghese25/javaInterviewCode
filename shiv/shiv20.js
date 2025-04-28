let x = 1;
if (true) {
  let x = 2;
}
console.log(x);

/*
Step-by-Step Explanation:
let x = 1;

Creates a variable x with value 1 in the global (outer) block.

if (true) { let x = 2; }

Inside the if block:

Another new x is declared using let.

This x = 2 exists only inside the if block (local scope).

It does NOT affect the outer x.

console.log(x);

Outside the if block.

Refers to the outer x, which is still 1.


let is block-scoped.

Variables declared inside {} stay inside — they don't leak outside.

OutPut is 1
The outer x is unaffected by the inner x.
*/
