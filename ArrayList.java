/*
An ArrayList is a resizable array implementation of the List
interface in the Java Collections Framework. 
It provides a dynamic way to store collections of objects, allowing you to add or remove elements as needed.
 */

public class ArrayList {
    ArrayList<String> names = new ArrayList<String>(); // Creates an empty ArrayList to hold Strings

    /*
    add(element): Appends the specified element to the end of the list.
    add(index, element): Inserts an element at a specific index, shifting existing elements if necessary.
     */
    names.add("Alice"); // Adds "Alice" to the end
    names.add(1, "Bob"); // Inserts "Bob" at index 0

System.out.println(names);
}