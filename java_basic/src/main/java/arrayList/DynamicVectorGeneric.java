package main.arrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DynamicVectorGeneric<E> implements Iterable {
    private int elementammount = 0;
    private int capacity = 10;
    private Object[] dataArray = new Object[capacity];

    public void add(E e) {

        if (getElementAmmount() > capacity * .75) {
            this.dataArray = increaseDataArray();
        }
        dataArray[elementammount] = e;
        elementammount++;
    }

    public E get(int index) {
        return (E) dataArray[index];
    }

    public E getLast() {
        return (E) dataArray[elementammount - 1];
    }

    public Object getFirst() {
        return dataArray[0];
    }

    public void removeLast() {
        dataArray[elementammount - 1] = null;
        elementammount--;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getElementAmmount() {
        return elementammount;
    }

    private Object[] increaseDataArray() {
        capacity = capacity * 3 / 2 + 1;
        Object[] tempDataArray = new Object[capacity];
        tempDataArray = Arrays.copyOfRange(dataArray, 0, tempDataArray.length);
        return tempDataArray;
    }

    public void remove(int index) {
        Object[] tempDataArray = dataArray;
        for (int i = 0; i < tempDataArray.length - 1; i++) {
            if (i < index) {
                tempDataArray[i] = dataArray[i];
            } else {
                tempDataArray[i] = dataArray[i++];
            }
        }
        this.dataArray = tempDataArray;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
