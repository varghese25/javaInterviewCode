let myFunction = (a, b) => a * b;
console.log(2 * 2);
//With Arrow Function:
hello = () => {
  return "Hello World!";
};
console.log(hello());

//Before Arrow:
hello = function () {
  return "Hello World!";
};
console.log(hello());

//Arrow Functions Return Value by Default:
hello = () => "Hello World!";
console.log(hello());

//Arrow Function With Parameters:
hello = (name) => "Hello " + name;
console.log(hello("Tiju"));

//Arrow Function Without Parentheses:
hello = varghese => "hello " + varghese;
console.log(hello(12));