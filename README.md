w## Short Cut Vscode for Java

- /_ shift+Alt+A_/ Multi line comment
- // ctrl+/ single line comment

## Java Data Structures

**_Data structures are ways to store and organize data so you can use it efficiently._**<br>
--An array is an example of a data structure, which allows multiple elements to be stored in a single variable.<br>

Java includes many other data structures as well, in the java.util package. Each is used to handle data in different ways.<br>
Some of the most common are:

--ArrayList
--LinkedList
--HashMap
--HashSet

## Lambda functions

--(parameters) -> expression <br>
--(parameters) -> { statements } <br>

## Example 1: Using Runnable (No parameters, no return) <br>

--Runnable r = () -> System.out.println("Hello from a lambda!");<br>
r.run();<br>

## Example 2: Using Predicate (One parameter, returns boolean)

-- import java.util.function.Predicate; <br>

--Predicate<Integer> isEven = number -> number % 2 == 0; <br>

--System.out.println(isEven.test(4)); // true <br>
--System.out.println(isEven.test(7)); // false <br>

--Lambdas work best with functional interfaces (Runnable, Callable, Comparator, Predicate, Function, Consumer, etc.).<br>

--Use lambda when you want to pass behavior as a parameter (instead of writing full class or anonymous inner class).<br>

## Example 3: Using Function (Takes input, returns result)

--import java.util.function.Function;<br>

--Function<String, Integer> stringLength = str -> str.length();<br>

--System.out.println(stringLength.apply("Java")); // 4<br>

## Example 4: Using BiFunction (Takes two inputs, returns result)

--import java.util.function.BiFunction;<br>

--BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;<br>

--System.out.println(add.apply(5, 3)); // 8 <br>

## Example 5: Sorting with Lambda

--import java.util.\*; <br>

--List<String> names = Arrays.asList("Varghese", "Benjamin", "Serah");<br>

--names.sort((a, b) -> a.compareToIgnoreCase(b));<br>
--System.out.println(names); // [Benjamin, Serah, Varghese]<br>

## Example 6: Using with Streams

import java.util.Arrays;<br>
import java.util.List;<br>

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);<br>

numbers.stream()<br>
.filter(n -> n % 2 == 0)<br>
.forEach(n -> System.out.println("Even: " + n));<br>
<<<<<<< HEAD

## Github is a platform used for hosting Repos

--Javadoc is a tool within the Java Development Kit (JDK) used to generate API documentation in HTML format from Java source code.
=======

## Github is a platform used for hosting Repos

--Javadoc is a tool within the Java Development Kit (JDK) used to generate API documentation in HTML format from Java source code.

--Callback-> console.log out put will be here which immediately gives the results 
--CallQueue -> callback function set time will be in queue which will give results when callback function is over later it displays output.
>>>>>>> 3cb89bf74ba4176ea6d5e556802033d0c400cc73


##What is the final variable, final class, and final blank variable?
--Final Variable: final variables are nothing but constants. We cannot change the value of a final variable once it is initialized.
class Demo {  

   final int MAX_VALUE = 99;
   void myMethod() {  
      MAX_VALUE = 101;
   }  
   public static void main(String args[]) {  
      Demo obj = new  Demo();  
      obj.myMethod();  
   }  
}
--Output
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final field Demo.MAX_VALUE cannot be assigned

	at beginnersbook.com.Demo.myMethod(Details.java:6)
	at beginnersbook.com.Demo.main(Details.java:10)

--Blank final variable: A final variable that is not initialized at the time of declaration is known as blank final variable. We must initialize the blank final variable in constructor of the class otherwise --it will throw a compilation error (Error: variable MAX_VALUE might not have been initialized).

class Demo {  
   //Blank final variable
   final int MAX_VALUE;
	 
   Demo() {
      //It must be initialized in constructor
      MAX_VALUE = 100;
   }
   void myMethod() {  
      System.out.println(MAX_VALUE);
   }  
   public static void main(String args[]) {  
      Demo obj = new  Demo();  
      obj.myMethod();  
   }  
}
--Output:100

--Final Method: A final method cannot be overridden. Which means even though a sub class can call the final method of parent class without any issues but it cannot override it.
class XYZ {  
   final void demo() {
      System.out.println("XYZ Class Method");
   }  
}  
	     
class ABC extends XYZ {  
   void demo() {
      System.out.println("ABC Class Method");
   }  
	     
   public static void main(String args[]) {  
      ABC obj= new ABC();  
      obj.demo();  
   }  
}



--Java Polymorphism
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}