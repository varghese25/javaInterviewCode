function mystery()
 {
    var a = 5;
    return function() {
        console.log(a);
        a++;
    };
 }
 const result = mystery();
 result(); // 5
result(); // 6