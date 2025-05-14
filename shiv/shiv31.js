const person = {
  name: "Alice",
  details: {
    age: 25,
  },
};

const copy = { ...person };
copy.details.age = 30;
console.log(person.details.age);
