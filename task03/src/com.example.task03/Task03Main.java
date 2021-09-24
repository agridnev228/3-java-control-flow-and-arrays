package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getNameOfWeekDays(7));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        String str="";
        switch(weekDaysNumber)
        {
            case 1:str="понедельник";
            break;
            case 2:str="вторник";
                break;
            case 3:str="среда";
                break;
            case 4:str="четверг";
                break;
            case 5:str="пятница";
                break;
            case 6:str="суббота";
                break;
            case 7:str="воскресенье";
                break;
            default:str="такого дня недели не существует";
        }
        return str;
    }
}