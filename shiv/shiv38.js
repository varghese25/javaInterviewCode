const user = [
  { id: 1, name: "Alice" },
  { id: 2, name: "Bob" },
  { id: 3, name: "Charlie" },
];
const result = user.find((user) => user.id > 1);
console.log(result.name);

/*
B) Bob

 .find() method returns the first element in the array that satisfies the provided testing function.
 const result = user.find (user => user.id > 1);

Check the object in the array from the beginning:
{id: 1, name: "Alice"} -> id is not greater than 1 -> Skip
{id: 2, name: "Bob"} -> id is greater than 1 -> match found -> return this object.
console.log(result.name) // Bob
*/
