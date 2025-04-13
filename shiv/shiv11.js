const nums = [1, 2, 3];
const result = nums.map((num, i) => {
  if (i === 1) return;
  return num * 2;
});
console.log(result);

// Output: [ 2, undefined, 6 ]
