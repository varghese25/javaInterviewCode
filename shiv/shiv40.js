const people = [
  { name: "Alice", age: 25 },
  { name: "Bob", age: 30 },
  { name: "Charlie", age: 25 },
];
const grouped = people.groupBy((person) => person.age); // This line will throw an error in most environments grouopBy is not a standard method on Array.prototype
console.log(Object.keys(grouped));

// The error in your code is that Array.prototype.groupBy() is not yet widely supported in all JavaScript environments, and it's not available in Node.js by default as of now (unless using experimental features).
