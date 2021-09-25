package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if(arr==null || arr.length==0)
            return;
        int start=0;
        while(start!=arr.length)
        {
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int i=start;i<arr.length;i++)
            {
                if(min>arr[i])
                {
                    min=arr[i];
                    index=i;
                }
            }
            arr[index]=arr[start];
            arr[start]=min;
            start++;
        }
    }

}