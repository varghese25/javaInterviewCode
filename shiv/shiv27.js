const obj = {
  value: 42,
  getValue: function () {
    return this.value;
  },
};
const getVal = obj.getValue;
console.log(getVal()); // Outputs: undefined (Orginal OutPut if want output console.log(obj.getValue());
// Outputs: 42) //

/*Explanation 
B) undefined
getVal() is called, it no longer has a reference to obj, so this is not obj.

If you want to keep this bound to obj, you can use: 
1. Bind it:
const getVal = obj.getValue.bind(obj);
console.log(getVal()); // 42

2. call it directly:
console.log(obj.getValue()); // 42*/

/*
Options
A: 42
B: undefined
C: null
D: ReferenceError*/
