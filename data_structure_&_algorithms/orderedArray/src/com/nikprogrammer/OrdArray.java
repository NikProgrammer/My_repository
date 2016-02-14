package com.nikprogrammer;

/**
 * orderedArray.java
 * Работа с классом упорядоченного массива
 */
public class OrdArray {

    private long[] a;
    private int nElems;

    public OrdArray(int max){
        a = new long[max];
        nElems = 0;
    }
    //----------------------------------------------------------------------------------------------------
    public int size(){
        return nElems;
    }
    //Поиск
    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true){
            curIn = (lowerBound + upperBound)/2;

            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else
            {
                if (a[curIn] < searchKey)
                    lowerBound= curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }
    //Вставка
    public void insert(long value) {
        int i;
        for (i = 0; i < nElems; i++)
            if (value < a[i])
                break;
        for (int k = nElems; k > i; k--)
            a[k] = a[k - 1];
        a[i] = value;
        nElems++;
    }
    //Удаление
    public boolean delete(long value){
        int i = find(value);
        if (i == nElems)
            return false;
        else
        for (int k = i; k < nElems; k++ )
            a[k] = a[k+1];
        nElems--;
        return true;
    }
    //Вывод
    public void display(){
        for (int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
