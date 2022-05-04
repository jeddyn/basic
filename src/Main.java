import java.io.*;
import java.util.Scanner;

public class Main {
    //psvm <- nie musicie miec tej linijki
    /*tutaj mozemy pisac*/
    // ctrl + alt + L
    // ctrl + /
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");
//        int a;
//
//        a = 5;
//        System.out.println(a);
//        a = 18;
//        System.out.println(a);
//
//        double b;
//        b = 3.8;
//        System.out.println(b);

        // +
        // -
        // / -> dzielenie
        // * -> mnozenie
        // % -> modulo (reszta z dzielenia)

//        int d = 15;
//        int e = 13;
//        int wynik = d * e;
//
//        System.out.println("Wynik to: " + (d + e));
//
//        String tekst = "Hello";
//        String drugiTekst = " World";
//
//        System.out.println(tekst + drugiTekst);
//
//        char znak = '#';
//
//        System.out.println(znak);

        // 5 % 3 = 2
        // 5 % 5 = 0
        // 3 % 5 = 3
        // 11 % 12 = 11
        // 24 % 17 = 7


//        Scanner strumien = new Scanner(System.in);
//        String wczytane = strumien.nextLine();
//        System.out.println("Wczytaj liczbe: ");
//        int wczytane = strumien.nextInt();
//
//        System.out.println("Wczytales dane od uzytkownika: " + wczytane);

        // a == b
        // a < b
        // a > b
        // a <= b
        // a >= b
        // a != b

//        boolean logiczny = 5 < 3; // true/false


        // && -> AND
        // || -> OR
        // !  -> negacja

//        int wiek = 15;
//        int wzrost = 160;
//
//        if(wiek > 17 && wzrost > 170){
//            System.out.println("Możesz wejść na kolejkę");
//        } else if(wiek > 16 && wzrost > 160){
//            System.out.println("Możesz wejść na wolniejszą kolejkę");
//        } else if(wiek == 15 || wzrost > 150){
//            System.out.println("Możesz wejść na mniejsza kolejke");
//        } else {
//            System.out.println("Jesteś za mlody/mloda na kolejkę");
//        }
//
//        int parzystosc = 14;
//        if(parzystosc % 2 != 0){
//            System.out.println("Tak liczba " + parzystosc + " jest nieparzysta");
//        }
//        if(wiek > 16 && wzrost > 160){
//            System.out.println("Możesz wejść na wolniejszą kolejkę");
//        } else if(wiek > 17 && wzrost > 170){
//            System.out.println("Możesz wejść na kolejkę");
//        }
        //operatory skrócone
        // + - / * %
//        int b = 3;
//        b = b * 5; ---> b*=5;

        // i++ --> i = i + 1;
        // i-- --> i = i - 1;

//        for (int i = 0; i < 3; i++) {
//            System.out.println("Hello");
//        }

//        int i = 0;
//        while(i < 3){
//            System.out.println("Hello!");
//            i++;
//        }


//        do{
//            System.out.println("Test");
//        }while(false);



//        File plik = new File("plik.txt");
//        Scanner scanner = new Scanner(plik);
//
//        while(scanner.hasNextLine()){
//            String wczytanaLinia = scanner.nextLine();
//            System.out.println(wczytanaLinia);
//        }


//        File plik = new File("zapis.txt");
//        String tekst = "Hello!";
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(plik));
//        bufferedWriter.write(tekst + "\n" + "inny tekst w nowej linii ");
//
//        bufferedWriter.close();


        int[] tab = new int[7];
//        System.out.println(tab[4]);

        tab[4] = 17;
        tab[1] = 172;
        tab[6] = 32;
//        System.out.println(tab[4]);
//
//        for (int i = 0; i < tab.length; i++) {
//            tab[i] = i;
//        }
//
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println(tab[i]);
//        }

        int[] tablica = new int[100];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 50;
        }

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }


        String[] tablicaTekst = new String[50];
        String[] tablicaUzupelniona = {"Tekst", "Inny tekst", "Tekstowy tekst"};




        //stwórz tablice 100 elementowa nastepnie przy pomocy petli uzupelnij ja wartosciami
        // od 50 do 150. Wyświetl efekt.


    }
}
