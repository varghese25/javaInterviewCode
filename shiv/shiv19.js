const result = false ? "Yes" : false ? "Maybe" : "No";

console.log(result);

//Output: No

/*
You are using a ternary operator — it's like a small if-else inside a single line.

First check fails (false ➔ not "Yes")

Second check fails (false ➔ not "Maybe")

So it goes to the final option → "No"*/