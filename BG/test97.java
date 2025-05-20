import java.util.*;

public class test97 { // linkedList
    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();
        players.add("Dhoni");
        players.add("Virat");
        players.addFirst("Rohit");
        players.addLast("Gill");
        players.remove("Virat");
        players.push("Surya");
        players.add(1, "Ishan");
        players.pop();
        System.out.println(players);
    }
}

/*
 * 🔁 Summary of Method Usage:
 * Method Description
 * add() Adds at the end
 * addFirst() Adds to the beginning
 * addLast() Adds to the end (same as add())
 * remove(obj) Removes the first occurrence of an object
 * push() Adds to the front (like stack push)
 * add(index, obj) Inserts at a specific index
 * pop() Removes and returns the first element
 */

/*
 * Add "Dhoni" to the end of the list: players: [Dhoni]
 * Add "Virat" to the end: players: [Dhoni, Virat]
 * Add "Rohit" to the beginning: players: [Rohit, Dhoni, Virat]
 * Add "Gill" to the end: players: [Rohit, Dhoni, Virat, Gill]
 * Remove "Virat" from the list: players: [Rohit, Dhoni, Gill]
 * push("Surya") adds to the front (same as addFirst): players: [Surya, Rohit,
 * Dhoni, Gill]
 * add(1, "Ishan") adds "Ishan" at index 1: players: players: [Surya, Ishan,
 * Rohit, Dhoni, Gill]
 * pop() removes the first element (like removeFirst()):
 * removed: "Surya"
 * players: [Ishan, Rohit, Dhoni, Gill]
 * System.out.println(players); [Ishan, Rohit, Dhoni, Gill]
 */