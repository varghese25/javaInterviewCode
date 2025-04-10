let software = { name: "FrontEnd" };
let developer = software;
developer.name = "BackEnd";
console.log(software.name);

// Output: BackEnd
// Explanation: In JavaScript, objects are reference types. When you assign an object to another variable, both variables point to the same object in memory. Therefore, changing the property of one variable affects the other.
// In this case, both `software` and `developer` point to the same object, so changing `developer.name` also changes `software.name`.
// To avoid this, you can create a copy of the object using `Object.assign()` or the spread operator (`...`), like this:
// let software = { name: "FrontEnd" };
// let developer = { ...software }; // or let developer = Object.assign({}, software);
// developer.name = "BackEnd";
// console.log(software.name); // Output: FrontEnd
// This way, `software` and `developer` are two separate objects, and changing one does not affect the other.
