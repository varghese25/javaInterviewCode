async function test() {
  return 1;
}
console.log(test());

await test().then((result) => console.log(result)); // This will log 1 after the promise resolves

// console.log([] + {}); // Logs "[object Object]" because [] is coerced to an empty string and {} is coerced to "[object Object]".
/*
async function test() { return 1; }

async makes the function always return a Promise.

return 1 becomes Promise.resolve(1).

console.log(test());

Logs the Promise object (e.g. Promise { 1 }), not 1.

To get 1, you must use await or .then().*/
