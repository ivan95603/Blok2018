package com.ivan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  int a = 65;
        int b = 34;
        int c = a + b;
        System.out.println("Hello World" + c);*/
      /*double af = 45.78;
      double bf = 4.21;
      double cf = af + bf;
      System.out.println(cf);*/
       // ArrayList<String> items = new ArrayList<>();
        Ucenik ivan = new Ucenik();
        ivan.setNazivUcenika("Ivan");
        ivan.setGodiste(1995);
        ivan.setProsek(6);

        Ucenik marko = new Ucenik("Marko");
        Ucenik Janko = new Ucenik("Janko", 1990, 4.3);




        ArrayList<Ucenik> ucenici = new ArrayList<>();

        ucenici.add(new Ucenik("Kimi", 1999, 2.2));
        ucenici.add(new Ucenik("Kimi1", 2002, 4.2));
        ucenici.add(new Ucenik("Kimi2", 1990, 3.2));

        double prosek = 0;


        for (Ucenik item : ucenici)
        {
            if (item.getGodiste() == 2002)
            {
                System.out.println(item.getNazivUcenika());
            }
            prosek += item.getProsek();

        }

        prosek = prosek / ucenici.size();
        System.out.println(prosek);


    }
}
