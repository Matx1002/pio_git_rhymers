package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntLinkedListJUnitTest {

    @Test
    public void push() {
        IntLinkedList intLinkedList = new IntLinkedList();

        final int EMPTY_STACK_VALUE = -1;

        for(int i = 0; i < 5; i++) {
            intLinkedList.push(i);
            assertEquals(i, intLinkedList.top());
        }

        for(int i = 4; i >= 0; i--) {
            assertEquals(i, intLinkedList.pop());
        }

        assertEquals(EMPTY_STACK_VALUE, intLinkedList.pop());

        assertTrue(intLinkedList.isEmpty());

    }

    @Test
    public void isEmpty() {
        IntLinkedList intLinkedList = new IntLinkedList();

        assertTrue(intLinkedList.isEmpty());

        intLinkedList.push(1);

        assertFalse(intLinkedList.isEmpty());

        intLinkedList.pop();

        for (int i = 0; i < 12; i++) {
            intLinkedList.push(i);
            assertFalse(intLinkedList.isEmpty());
        }

        for(int i = 0; i < 12; i++) {
            assertFalse(intLinkedList.isEmpty());
            intLinkedList.pop();
        }

        assertTrue(intLinkedList.isEmpty());

    }

    @Test
    public void isFull() {
        IntLinkedList intLinkedList = new IntLinkedList();

        assertFalse(intLinkedList.isFull());

        for (int i = 0; i < 12; i++) {
            intLinkedList.push(i);
            assertFalse(intLinkedList.isFull());
        }

        assertFalse(intLinkedList.isFull());

    }

    @Test
    public void top() {
        IntLinkedList intLinkedList = new IntLinkedList();

        final int EMPTY_STACK_VALUE = -1;

        assertEquals(EMPTY_STACK_VALUE, intLinkedList.top());

        for(int i = 0; i < 5; i++) {
            intLinkedList.push(i);
            assertEquals(i, intLinkedList.top());
        }

        for(int i = 4; i >= 0; i--) {
            assertEquals(i, intLinkedList.top());
            intLinkedList.pop();
        }

        assertEquals(EMPTY_STACK_VALUE, intLinkedList.top());

    }

    @Test
    public void pop() {
        IntLinkedList intLinkedList = new IntLinkedList();

        final int EMPTY_STACK_VALUE = -1;

        assertEquals(EMPTY_STACK_VALUE, intLinkedList.pop());

        for(int i = 0; i < 5; i++) {
            intLinkedList.push(i);
            assertEquals(i, intLinkedList.pop());
        }

        assertEquals(EMPTY_STACK_VALUE, intLinkedList.pop());

    }
}