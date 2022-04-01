package com.hw2;

public class Main
{

    public static void main(String[] args)
    {
        ////////Задача 6 доп.

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result;
        result = a * (b + (c - d * e));
        System.out.println(result +"\n "+ Math.abs(result));
        result = -result;                                   // ! можно и так изменить значение


        ////////Задача 7 доп.

        int a1 = 5;
        int b1 = 7;
        b1 = b1 - b1 % a1;
        a1 = (a1 / b1 + a1) + (a1 / b1);
        System.out.println("Значение a1 = " + a1 +"\n" + "Значение b1 = " + b1);

        ////////Задача 8 доп.

        int a2 = 920;
        int b2 = (a2 % 100) / 10;
        System.out.println(b2);

    }
}
