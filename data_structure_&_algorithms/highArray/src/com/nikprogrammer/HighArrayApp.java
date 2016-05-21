package com.nikprogrammer;

/**
 * Nikolay
 * 07.02.2016.
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;

        HighArray arr = new HighArray(maxSize);

        HighArray sortArr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);


        for (int i = 0; i < maxSize; i++){
            sortArr.insert(arr.getMax());
            arr.removeMax();
            if (arr.getMax() == -1)
                break;
        }

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        sortArr.display();

        int searchKey = 35;
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(0);
        arr.delete(66);
        arr.delete(22);

        if (arr.getMax() == -1){
            System.out.println("Array is empty");
        }
        else {
            System.out.println("Max value = " + arr.getMax());
        }

        arr.removeMax();

        arr.display();
    }
}