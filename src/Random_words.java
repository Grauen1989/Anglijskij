import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Что я хочу от программы в будущем?
1) вводим в консоль число, которое задаст количество слов из массива (или списка);
2) программа поочередно выдает слова (без их повторения). Мы пишем их перевод. Если не верно - программа сама выдает перевод;
3) программа выдает произношение слова.
 */

public class Random_words {

    public static void main (String [] args) {

        ArrayList <String> words  = new ArrayList<String>();
        words.add ("pain");
        words.add ("socks");
        words.add ("boots");
        words.add ("lace");
        words.add ("slippers");
        words.add ("going to");
        words.add ("inch");
        words.add ("heel");
        words.add ("tie");
        words.add ("suit");
        words.add ("wash");
        words.add ("cotton");

      /*  ArrayList <String> perevod  = new ArrayList<String>();
        words.add ("боль");
        words.add ("носки");
        words.add ("ботинки");
        words.add ("шнурок");
        words.add ("тапочки");
        words.add ("собираться");
        words.add ("дюйм");
        words.add ("каблук");
        words.add ("чай");
        words.add ("костюм");
        words.add ("мыть");
        words.add ("хлопок"); */

        int quantityWords = words.size();
        System.out.println("Эта программа выводит случайные английские слова, начиная с 14.04.20. Слов в программе: " + quantityWords);
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько слов выдать?");
        int c = in.nextInt ();
        for (int i = 1; i<=c; i++)
        {
            int randy = (int) (Math.random () * quantityWords);
            System.out.println(words.get(randy));
            String vvod = in.nextLine();
            //почему при запуске программа выдает вначале сразу два слова? Я хочу, чтобы она выдавала по одному, т.е. выдает слово - я ввожу перевод, выдает следующее слово - я ввожу перевод и т.д.
        }

    }

}
