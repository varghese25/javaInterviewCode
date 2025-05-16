let name = "Global";
function printName() {
  console.log(name);
}

function execute(callback) {
  let name = "local";
  callback();
}

execute(printName);


// Output: Global
// Explanation: The `printName` function is called with the global context, so it accesses the global variable `name`.