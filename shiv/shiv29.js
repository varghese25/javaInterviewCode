let a = 1;
function test() {
  console.log(a);
  a = 2;
}
test();

/* Explanation 
Refer the Code shiv28.js.

Since there's no let, const, or var inside the function, it refers to the global a.

So console.log(a) prints 1.

Then a = 2; changes the global a to 2.*/
