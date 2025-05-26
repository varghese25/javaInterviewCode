// Example of destructuring an object with default values

const user = { name: "John ", age: 30 };
const { name, city = "Unknown" } = user; // city is not defined in user, so it will default to "Unknown"
console.log(name);
console.log(city);

// When destructuring an object, you can assign default values to properties that might be missing.
/**
 * Creates an object named user with: name :

 "John" age: 30

console.log(name); // John



Destructuring the user object :

name is found in user, so it gets the value "John"  

city is not found in user, so it gets the default value"Unknown"



console.log(city); // Unknown
 */
