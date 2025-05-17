
//shallow copying in JavaScript using the spread operator (...)

const obj = {a: 1, b: {c:2}};
const copy = {...obj};
copy.b.c = 42;
console.log(obj.b.c);