const obj1 = { name: "Devloper" };
const obj2 = { name: "Devloper" };
console.log(obj1 == obj2);
console.log(obj1 === obj2);

/*
Expalanation: In JavaScript, when you compare two objects using == or ===,
it checks if they refer to the same object in memory.
obj1 and obj2 have the same structure and the same content, 
they are two different objects in memory. Think of them like two different people wearing the same clothes — 
they look the same, but they're still not the same person.
*/
