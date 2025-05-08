//What gets logged?
function test() {
  function sayHi() {
    console.log("Hi from inner 1");
  }

//   sayHi();
  return;
  function sayHi() {
    console.log("Hi from inner 2");
  }
}
// test();