import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        int a = 4;
        int b = 21;
        int c = a + b;
        double d =  (double) b / c;
        System.out.println(c);
        System.out.println(d);

        for (int i = 0; i < 20; i++)
        {
            System.out.println("Ovo je jedna linija");
        }


        Student marko = new Student();
        marko.ime = "Marko";
        marko.godiste = 145;
        marko.prosek = 4.1;

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Molimo unesite prvi clan:");
        double prviClan = ulaz.nextDouble();
        System.out.println("Molimo unesite drugi clan:");
        double drugiClan = ulaz.nextDouble();
        System.out.println("Molimo unesite operaciju:");
        ulaz.nextLine();
        String operacija = ulaz.nextLine();

        double rezultat = 0;

        switch (operacija) {
            case "+":
                System.out.println("Sabiranje");
                rezultat = prviClan + drugiClan;
                System.out.println("Rezultat sabiranja je: " + rezultat);
                break;
            case "*":
                rezultat = prviClan * drugiClan;
                System.out.println("Rezultat mnozenja je: " + rezultat);
                System.out.println("Mnozenje");
                break;

            default:
                System.out.println("Grska");
                break;
        }

        System.out.println(prviClan + operacija + drugiClan);


    }
}
