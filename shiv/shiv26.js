let a = [1, 2, 3]; // 'a' points to an array [1, 2, 3]
let b = a; // 'b' now points to the same array as 'a'
a = [4, 5, 6] // 'a' now points to a new array [4, 5, 6]; 'b' still points to [1, 2, 3]
console.log(b); // Outputs: [1, 2, 3]