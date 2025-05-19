const original = {
  name: "Dev",
  address: {
    city: "Bangalore",
  },
};

const copied = structuredClone(original);
copied.address.city = "Mumbai";
console.log(original.address.city);

/*
1) original.address !== copied.address (they are different objects)
2) updates only the copy's address: // copied.address.city = "Mumbai";
3) original.address.city is untouched : // original.address.city = "Bangalore";
4) original and copied objects are fully separate, including their nested parts.
5) structuredClone() makes a deep copy, so nested changes don’t affect the original. Useful when we want to fully duplicate an object and safely modify the clone.*/
