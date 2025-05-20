let x = 10;
let y = x;
x = 20;

let obj1 = { value: 10 };
let obj2 = obj1;

obj1.value = 20;

console.log(y);
console.log(obj2.value);

/*
Explanation 

Primitive types (like numbers) are copied by value.
Objects are copied by reference, so changes to one reflect in the other if they share the same reference

1)10 because different memory allocations 
2)20 because same memory or same reference point 


-y gets a copy of the value of x, which is 10.
-when you do obj2.value = 20, you're modifying that shared object.
*/

/*
Primitive types (like numbers) are copied by value.
x = 10; -> x is a primitive (number). It holds the value 10.
y = x; -> now y gets a copy of the value of x, which is 10. So y = 10.
x = 20 -> only changes x, not y. Since they are primitive types, they are passed by value.

console.log(y); // 10

Objects are copied by reference, so changes to one reflect in the other if they share the same reference

obj1 is assigned an object { value: 10 }.
obj2 = obj1; -> This copies the reference, not the object. So both obj1 and obj2 point to the same object in memory.

 Modifying the value property of the object. obj2 refers to the same object, obj2.value is also affected.

obj1 = { value: 20 }
obj2 = { value: 20 } (same object)

console.log(obj2.value); // 20
*/
