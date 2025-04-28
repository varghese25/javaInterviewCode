const user = {
  name: "John",
  age: 30,
};

const admin = user;
admin.name = "Doe ";

console.log(user.name); // Doe
