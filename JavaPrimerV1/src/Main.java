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

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Ovo je linija sa indeksom: " + i);
        }

        Student Marko = new Student();
        Student Janko = new Student("Janko", 1999, 4.3);

        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Marko", 1997, 5.0));
        studenti.add(new Student("Janko", 1997, 4.0));
        studenti.add(new Student("Marija", 1997, 4.9));

        for (Student item : studenti)
        {
            System.out.println(item.ime);
        }



        int arr[]={2,11,45,9};
        //i pocinje sa 0 posto indeksi pocinju od 0
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }


        ArrayList<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        for(String item : items)
        {
            System.out.println(item);
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
