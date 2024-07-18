# ArrayList in Java
This repository provides a comprehensive guide to using ArrayList in Java, along with examples and practice questions to enhance your understanding of sorting, swapping elements, and reversing an ArrayList.

## Table of Contents
1. Introduction
2. Basic Operations
3. Common Methods
4. Practice Questions
5. Sorting an ArrayList
6. Swapping Elements
7. Reversing an ArrayList
8. Conclusion
9. Contributing


### Introduction
An ArrayList in Java is a resizable array, which can be found in the java.util package. It provides us with dynamic arrays that can grow as needed in Java. Though it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.This makes it a versatile choice for many applications.
##### Creating an ArrayList
To create an ArrayList, we need to import the java.util.ArrayList package first. 


#### Basic Operations
Here's a quick overview of basic operations you can perform on an ArrayList:

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

### Common Methods
Here are some common methods provided by the ArrayList class:

1. add(E e): Appends the specified element to the end of the list.
2. add(int index, E element): Inserts the specified element at the specified position in the list.
3. get(int index): Returns the element at the specified position in the list.
4. remove(int index): Removes the element at the specified position in the list.
5. remove(Object o): Removes the first occurrence of the specified element from the list.
6. set(int index, E element): Replaces the element at the specified position in the list with the specified element.
7. size(): Returns the number of elements in the list.
8. contains(Object o): Returns true if the list contains the specified element.

### Practice Questions
1. Sorting an ArrayList
2. Swapping Elements
3. Reversing an ArrayList

### Conclusion
The ArrayList class in Java is a powerful and flexible way to work with dynamic arrays. With its many methods, you can easily manipulate and control your lists to fit your needs. Practice using these methods with the questions provided to solidify your understanding. Happy coding!

### Contributing
We welcome contributions to improve this repository. If you have any suggestions or improvements, feel free to open an issue or submit a pull request.









