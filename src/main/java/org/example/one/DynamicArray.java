package org.example.one;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray implements Iterable<Integer>{



    private int capacity = 0;
    private int[] numbers = new int[capacity];

    public void add(int number) {
        capacity++;
        numbers = Arrays.copyOf(numbers, capacity);
        numbers[capacity-1] = number;
    }

    public Iterator<Integer>iterator() {
        Iterator<Integer> iterator = new IntegerIterator();
        return new IntegerIterator();
    }
    private class IntegerIterator implements Iterator<Integer> {
        private int nextIndex = 0;


        @Override
        public boolean hasNext() {
            return(nextIndex<=capacity-1);
        }

        @Override
        public Integer next() {
            int number = numbers[nextIndex];
            nextIndex++;
            return number;
        }
    }


}
