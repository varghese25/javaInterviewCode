const funcs = [];

for (var i = 0; i < 3; i++) {
  (function (j) {
    funcs.push(function () {
      return j;
    });
  })(i);
}

console.log(funcs.map((f) => f()));
