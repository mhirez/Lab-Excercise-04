/**
 *  @assignment LAB EXCERCISE 04
 *
 *  @author      STUDENT'S NAME: MOHMMED R H HIREZ
 *               STUDENT'S NO:   1 2022 0519
 *
 *  @instructor  Dr. Eyad El-Masri
 *
 *  @course      BSAI2121 Data Structures and Algorithm Analysis - Lab
 *
 *  @date        24 Jan 2025
 */

import java.util.Scanner;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    private static class Node {

        int customerId;
        String customerName;
        Node next;

        Node(int customerId, String customerName) {
            this.customerId = customerId;
            this.customerName = customerName;
            this.next = null;
        }
    }



    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No customers to remove.");
            return;
        }
        System.out.println("Removed Customer: " + front.customerId + ", " + front.customerName);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void push(int customerId, String customerName) {
        Node newNode = new Node(customerId, customerName);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Added Customer: " + customerId + ", " + customerName);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No customers to display.");
            return;
        }
        System.out.println("Customer at Front: " + front.customerId + ", " + front.customerName);
    }


    public boolean isEmpty() {
        return front == null;
    }


    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.println("Customers in Queue:");
        while (current != null) {
            System.out.println("- Customer ID: " + current.customerId + ", Name: " + current.customerName);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMENU OPTIONS");
            System.out.println("1. Pop/Remove");
            System.out.println("2. Push/Insert");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    queue.pop();
                    break;
                case 2:
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    queue.push(customerId, customerName);
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4: // Exit
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
