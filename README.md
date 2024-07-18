ArrayList in Java
This repository provides a comprehensive guide to using ArrayList in Java, along with examples and practice questions to enhance your understanding of sorting, swapping elements, and reversing an ArrayList.

Table of Contents
Introduction
Basic Operations
Common Methods
Practice Questions
Sorting an ArrayList
Swapping Elements
Reversing an ArrayList
Contributing
License
Introduction
ArrayList is a resizable array implementation of the List interface in Java. It provides a dynamic array that can grow as needed. This makes it a versatile choice for many applications.

Basic Operations
Here's a quick overview of basic operations you can perform on an ArrayList:

java
Copy code
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        String fruit = list.get(0); // "Apple"

        // Removing elements
        list.remove("Banana");

        // Checking size
        int size = list.size(); // 2

        // Iterating through the ArrayList
        for (String item : list) {
            System.out.println(item);
        }
    }
}
Common Methods
Here are some common methods provided by the ArrayList class:

add(E e): Appends the specified element to the end of the list.
add(int index, E element): Inserts the specified element at the specified position in the list.
get(int index): Returns the element at the specified position in the list.
remove(int index): Removes the element at the specified position in the list.
remove(Object o): Removes the first occurrence of the specified element from the list.
set(int index, E element): Replaces the element at the specified position in the list with the specified element.
size(): Returns the number of elements in the list.
contains(Object o): Returns true if the list contains the specified element.
Practice Questions
Sorting an ArrayList
Question: Write a program to sort an ArrayList of integers in ascending order.

java
Copy code
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);

        // Sorting the ArrayList
        Collections.sort(list);

        // Displaying the sorted ArrayList
        System.out.println(list);
    }
}
Swapping Elements
Question: Write a program to swap two elements in an ArrayList.

java
Copy code
import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Swapping elements at index 0 and 2
        Collections.swap(list, 0, 2);

        // Displaying the ArrayList after swapping
        System.out.println(list);
    }
}
Reversing an ArrayList
Question: Write a program to reverse an ArrayList.

java
Copy code
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Reversing the ArrayList
        Collections.reverse(list);

        // Displaying the reversed ArrayList
        System.out.println(list);
    }
}
Contributing
We welcome contributions to improve this repository. If you have any suggestions or improvements, feel free to open an issue or submit a pull request.





Sure, here's a comprehensive README for an ArrayList in Java, covering its various methods and including practice questions for sorting, swapping elements, and reversing it.

ArrayList in Java
Introduction
An ArrayList in Java is a resizable array, which can be found in the java.util package. It provides us with dynamic arrays in Java. Though it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.

Creating an ArrayList
To create an ArrayList, we need to import the java.util.ArrayList package first. Here's an example:

java
Copy code
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
    }
}
Common Methods
Here are some commonly used methods of the ArrayList class:

Adding Elements
add(element): Appends the specified element to the end of this list.
java
Copy code
ArrayList<String> cars = new ArrayList<>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
Accessing Elements
get(index): Returns the element at the specified position in this list.
java
Copy code
String car = cars.get(0); // Volvo
Modifying Elements
set(index, element): Replaces the element at the specified position in this list with the specified element.
java
Copy code
cars.set(0, "Tesla");
Removing Elements
remove(index): Removes the element at the specified position in this list.
remove(element): Removes the first occurrence of the specified element from this list.
java
Copy code
cars.remove(0);
cars.remove("BMW");
Size of ArrayList
size(): Returns the number of elements in this list.
java
Copy code
int size = cars.size();
Clearing the List
clear(): Removes all of the elements from this list.
java
Copy code
cars.clear();
Checking if Empty
isEmpty(): Returns true if this list contains no elements.
java
Copy code
boolean empty = cars.isEmpty();
Practice Questions
1. Sorting an ArrayList
Write a Java program to sort an ArrayList of strings in alphabetical order.

java
Copy code
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Tesla");

        Collections.sort(cars);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
2. Swapping Elements in an ArrayList
Write a Java program to swap two elements in an ArrayList.

java
Copy code
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Tesla");

        Collections.swap(cars, 1, 3);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
3. Reversing an ArrayList
Write a Java program to reverse an ArrayList.

java
Copy code
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Tesla");

        Collections.reverse(cars);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
Conclusion
The ArrayList class in Java is a powerful and flexible way to work with dynamic arrays. With its many methods, you can easily manipulate and control your lists to fit your needs. Practice using these methods with the questions provided to solidify your understanding. Happy coding!

