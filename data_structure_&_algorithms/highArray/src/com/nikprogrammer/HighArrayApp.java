package com.nikprogrammer;

/**
 * Nikolay
 * 07.02.2016.
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        //создание массива
        HighArray arr = new HighArray(maxSize);
        //создание массива для отсортированных элементов
        HighArray sortArr = new HighArray(maxSize);
        //вставка в массив 10 элементов
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
        //создание отсортированного массива
        for (int i = 0; i < maxSize; i++){
            sortArr.insert(arr.getMax());
            arr.removeMax();
            if (arr.getMax() == -1)
                break;
        }
        //вставка в массив 10 элементов
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
        //вывод
        arr.display();
        sortArr.display();
        //поиск элемента по ключу
        int searchKey = 35;
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        //удаление эелемента по ключу
        arr.delete(0);
        arr.delete(66);
        arr.delete(22);
        //Вывод максимального значения ключа
        if (arr.getMax() == -1){
            System.out.println("Array is empty");
        }
        else {
            System.out.println("Max value = " + arr.getMax());
        }
        //удаление максимального значения ключа
        arr.removeMax();
        //вывод
        arr.display();
    }
}