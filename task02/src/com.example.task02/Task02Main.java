package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(11));

    }

    static String getSeason(int monthNumber) {
       //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        String str="";
        switch(monthNumber) {
            case 1:
            case 2:
            case 12: str="зима";
            break;
            case 3:
            case 4:
            case 5: str="весна";
            break;
            case 6:
            case 7:
            case 8: str="лето";
            break;
            case 9:
            case 10:
            case 11: str="осень";
            break;
            default: break;
        }
        return str;
    }
}