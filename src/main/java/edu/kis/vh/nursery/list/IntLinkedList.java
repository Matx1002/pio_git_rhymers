package edu.kis.vh.nursery.list;

/**
 * The IntLinkedList class represents a linked list of integers.
 * It provides methods for adding and removing integers, and accessing
 * the top integer in the list, as well as check if the list is empty or full.
 * It uses a Node class to represent each element in the list.
 * */
public class IntLinkedList {

    private static final int DEFAULT_VALUE = -1;
    private Node last;
    private int i;

    /**
     * Pushes the given integer to the end of the list.
     * @param i the integer to be added to the list
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the list is full.
     * @return false, because the list is never full.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value of the top element of the list without removing it.
     * @return the value of the top element of the list, or -1 if the list is empty
     */
    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();
    }

    /**
     * Returns the value of the last element of the list and removes it.
     * @return value of the top element of the list, or -1 if the list is empty.
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * A private inner class representing a node in the linked list.
     * Each node contains an integer value, and pointers to the previous and next nodes in the list.
     */
    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Constructs a new Node object with the given integer value.
         * @param i the integer value of the new node
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Returns the value of the node.
         * @return value of the node.
         */
        public int getValue() {
            return value;
        }

        /**
         * Returns the previous node.
         * @return previous node.
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node.
         * @param prev previous node.
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Returns the next node.
         * @return next node.
         */
        public Node getNext() {
            return next;
        }

        /**
         * Sets the next node.
         * @param next next node.
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}