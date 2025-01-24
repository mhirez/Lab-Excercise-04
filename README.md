# Queue Using Linked List Project

## Author Information

- **Student's Name:** Mohmmed R H Hirez  
- **Student Number:** 1 2022 0519  
- **Instructor:** Dr. Eyad El-Masri  
- **Course:** BSAI2121 Data Structures and Algorithm Analysis - Lab  
- **Assignment:** LAB EXERCISE 04  
- **Date:** 24 Jan 2025  

---

## Project Overview

This project implements a **Queue** data structure using a **Linked List** in Java. The application simulates a **customer waiting list**, where each node (item) in the queue represents a customer, storing their `customerId` and `customerName`. The program provides the following menu options for managing the queue:

1. **Pop/Remove**: Removes a customer from the front of the queue.  
2. **Push/Insert**: Adds a new customer to the rear of the queue.  
3. **Peek**: Displays the customer at the front of the queue without removing them.  
4. **Exit**: Ends the program.  

The program demonstrates normal queue operations such as enqueue (push), dequeue (pop), and peek while ensuring proper functionality through a linked list implementation.

---

## Features

1. **Push/Insert Customers**
   - Adds a new customer to the end of the queue using the `push(int customerId, String customerName)` method.

2. **Pop/Remove Customers**
   - Removes the customer at the front of the queue using the `pop()` method.

3. **Peek Front Customer**
   - Displays the `customerId` and `customerName` of the customer at the front without removing them using the `peek()` method.

4. **Display All Customers**
   - Prints all customers in the queue, showing their `customerId` and `customerName`.

5. **Check if Queue is Empty**
   - Verifies if the queue is empty using the `isEmpty()` method.

---

## How to Run the Project

1. **Compile** the Java file (assuming the file is named `QueueUsingLinkedList.java`):
   ```bash
   javac QueueUsingLinkedList.java
   ```

2. **Run** the compiled program:
   ```bash
   java QueueUsingLinkedList
   ```

3. Follow the on-screen menu options to perform queue operations:
   - Enter customer details to add them to the queue.
   - Remove customers from the queue.
   - View the customer at the front.

---

## Code Structure

The project consists of a single Java file with the following components:

1. **`Node` Class**  
   - Represents each customer in the queue with two fields: `customerId` (integer) and `customerName` (string).
   - Includes a pointer (`next`) to the next node in the queue.

2. **`QueueUsingLinkedList` Class**  
   - Implements the main functionality of the queue:
     - Enqueue (push) customers.
     - Dequeue (pop) customers.
     - Peek at the front customer.
     - Check if the queue is empty.
     - Display all customers in the queue.

3. **`main` Method**  
   - Provides a menu-driven interface for testing and demonstrating all queue operations.

---

## Sample Execution Output

Below is a sample of the program's interaction with a user:

```
MENU OPTIONS
1. Pop/Remove
2. Push/Insert
3. Peek
4. Exit
Choice: 2
Enter Customer ID: 101
Enter Customer Name: Alice
Added Customer: 101, Alice

MENU OPTIONS
1. Pop/Remove
2. Push/Insert
3. Peek
4. Exit
Choice: 2
Enter Customer ID: 102
Enter Customer Name: Bob
Added Customer: 102, Bob

MENU OPTIONS
1. Pop/Remove
2. Push/Insert
3. Peek
4. Exit
Choice: 3
Customer at Front: 101, Alice

MENU OPTIONS
1. Pop/Remove
2. Push/Insert
3. Peek
4. Exit
Choice: 1
Removed Customer: 101, Alice

MENU OPTIONS
1. Pop/Remove
2. Push/Insert
3. Peek
4. Exit
Choice: 4
Exiting program.
```

---

## Testing and Demonstration

The program is tested by performing the following steps:

1. **Add Customers**  
   - Inserts customers into the queue by entering their `customerId` and `customerName`.

2. **Remove Customers**  
   - Removes customers from the front of the queue using the `pop()` method.

3. **Peek at Front**  
   - Displays the customer at the front without removing them.

4. **Exit the Program**  
   - Ends the execution by selecting the exit option.

---

## License

This project is developed as part of an academic lab exercise and is intended for **educational purposes** only.

