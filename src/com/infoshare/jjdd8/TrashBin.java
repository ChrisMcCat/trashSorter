package com.infoshare.jjdd8;

public class TrashBin<T> {

    private int counter = 0;

    public void throwOut(T item) {
        System.out.println("Thrown out " + item.getClass() + ", to bin" + getClass());
        counter++;
    }

    public int howMany() {return counter;}

}