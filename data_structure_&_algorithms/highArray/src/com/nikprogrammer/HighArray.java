package com.nikprogrammer;

/**
 * Nikolay
 * 10.02.16
 * highArray.java
 * класс массива с высокоуровневым интерфейсом
 */
 class HighArray {
     private long[] a;
     private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }
    //поиск
    public boolean find(long searchKey){
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        return j != nElems;
    }
    //вставка
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    //удаление
    public boolean delete(long value){
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j])
                break;
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }
    //поиск наибольшего ключа
    public long getMax(){
        long max = 0;
        for (int i = 0; i < a.length;i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        if (nElems == 0){
            max = -1;
        }
        return max;
    }
    //удаление из массива наибольшего ключа
    public boolean removeMax(){
        long max = 0;
        for (int i = 0; i < a.length;i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        if (nElems == 0){
            return false;
        }
        else {
        delete(max);
        return true;
        }
    }
    //вывод на экран
    public void display(){
        for (int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}
