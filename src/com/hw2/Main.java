package com.hw2;

public class Main
{

    public static void main(String[] args)
    {


        ////////Задача 1.
        byte a = 10;
        short b = -1_000;
        int c = 2;
        long d = 1_565_32L;

        float e = 32.21f;
        double f = -32.5468954;

        char g = 'ȩ';
        char g1 = 553;
        // g и g1 равны;

        boolean g2 = g1 < g;
        System.out.println("Значение g2" + " = " + g2);       // g2 получит значение false;
        boolean h = true;
        boolean h1 = false;

        if (g2) // g2 - истина ?
        {
            System.out.println(h); // да , это так!
        } else
            System.out.println(h1); // нет, это не так!

        // .print(); - вывод в консоль;
        // .println(); - "последующий" вывод в консоль с новой строки;




        ////////Задача 2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float allBoxerWeight = boxerWeight1 + boxerWeight2;
        float diffBoxerWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Общая масса боксеров равна: " + allBoxerWeight + " кг\n"
                + "Разница в весе составляет: " + diffBoxerWeight + " кг");




        ////////Задача 3
        int banana = 5; // количесво бабанов;
        int eggs = 4;   // количесвто яиц;
        int iceCrime = 2; // количество брикета;
        int milk = 1; // молоко

        int masBanana = banana * 80; // масса бананов;
        int masMilk = milk * 2 * 105; // масса молока;
        int masIceCream = iceCrime * 100; // масса мороженого;
        int masEggs = eggs * 70; //  масса яиц;
        // c переменной молока недопонимание, решение верное , но как написать это правильно я "не догнал" ))

        float masSportFit = (masBanana + masEggs + masIceCream + masMilk);
        masSportFit /= 1000;

        System.out.println("Вес такого спорт-завтрака равен: " + masSportFit + " кг.");



        ///////Задача 4
        int offMass = 7 * 1000; // кг в гр;
        //float day;
        int way1 = 250; // первая методика;
        int way2 = 500; // вторая методика;
        int dayWay1 = offMass / way1;  //  сколько потребуется дней по первой методике;
        int dayWay2 = offMass / way2;  //  сколько потребуется дней по второй методике;
        int meanDay = (dayWay1 + dayWay2) / 2; //среднее количество дней;
        System.out.println("Если скидывать каждый день по " + way1 +" грамм" + " то потребуется " + dayWay1 +
                " дней.\n" + "Если скидывать каждый день по " + way2 +" грамм" + " то потребуется " + dayWay2 +
                " дней.\n" + "В среднем, чтобы добиться результата похудения необходимо " + meanDay + " дней!" );



        //////Задание 5
        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;
        //int proc = 10;

        int mashaProc = masha / 100 * 10;
        int denisProc = denis / 100 * 10;
        int krisProc = kris / 100 * 10;

        int mashaNewZp = masha + mashaProc;
        int denisNewZp = denis + denisProc;
        int krisNewZp = kris + krisProc;

        int mashaAverageOld = masha * 12;
        int denisAverageOld = denis * 12;
        int krisAverageOld = kris * 12;

        int mashaAverageNew = mashaAverageOld + (mashaProc * 12);
        int denisAverageNew = denisAverageOld + (denisProc * 12);
        int krisAverageNew = krisAverageOld + (krisProc * 12);

        int mashaDiff = mashaAverageNew - mashaAverageOld;
        int denisDiff = denisAverageNew - denisAverageOld;
        int krisDiff = krisAverageNew - krisAverageOld;

        System.out.println("Маша теперь получает " + mashaNewZp + " рублей. Годовой доход вырос на "
                + mashaDiff+ " рублей.\n" + "Денис теперь получает " + denisNewZp + " рублей. Годовой доход вырос на "
                + denisDiff+ " рублей.\n" + "Кристина теперь получает " + krisNewZp + " рублей. Годовой доход вырос на "
                + krisDiff+ " рублей.\n");

    }
}
