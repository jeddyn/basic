import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
//        mnozenieWczytanej();
//        silnia(5);
//        parzystosc();
        wczytajLiczby();
    }

    // Zadanie 1.
    public static void mnozenieWczytanej() {
        Scanner scanner = new Scanner(System.in);
        int wczytana = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(wczytana * i);
        }
    }

    public static void silnia(int liczba) {
        int wynik = 1;
        for (int i = 1; i <= liczba; i++) {
            wynik *= i;
        }
        System.out.println(wynik);
    }

    public static void parzystosc(){
        for (int i = 0; i < 101; i++) {
            if(i % 2 == 0){
                System.out.println("Tak liczba " + i + " jest parzysta");
            }
        }
    }
    //przetworzLiczby
    public static void wczytajLiczby(){
        Scanner strumien = new Scanner(System.in);
        int ileWczytacLiczb = strumien.nextInt();
        int[] tablica = new int[ileWczytacLiczb];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = strumien.nextInt();
        }
        wyswietlNieparzyste(tablica);
    }

    public static void wyswietlNieparzyste(int[] tablica){
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] % 2 != 0){
                System.out.println("Tak liczba " + tablica[i] + " jest nieparzysta");
            }
        }
    }



}

// Zadanie 1.
//Napisz program, który prosi użytkownika o wprowadzenie
// dodatniej liczby całkowitej. Powinien wtedy wydrukować
// tabliczkę mnożenia tej liczby.

// Zadanie 2.
// Stwórz metodę, która obliczy silnie z przekazanej liczby w argumencie.

// Zadanie 3.
// Stwórz metodę, która będzie miała
// za zadanie wyświetlić wszystkie liczby parzyste z przedziału od 0 do 100

// Zadanie 4*. Stwórz metodę, która wczyta określony zbiór liczb całkowitych
// a następnie wyświetli liczby nieparzyste