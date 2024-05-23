import java.util.Scanner;

public class Main {

    // Değer Parametresi Verilerek Metod Yazma

    public static void selamlasma ( String isim) {  // değer parametresini belirtmemiz gerekiyor.

        System.out.println("Merhaba " + isim);
    }

    public static void toplama ( int a, int b , int  c) {

        System.out.println("Toplamları : " + a + b + c);
    }






    // Değer Verilmeden Fonksiyon Yazma
    public static void selamlama () {

        System.out.println("Merhaba..");
        System.out.println("Nasılsınız..?");
    }

    public static void faktoriyel () {  // icerisine değer vermedik, çünkü değeri kullanıcıdan alaxagz.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz..:");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        while ( sayi > 0) {

            faktoriyel *=sayi;
            sayi--;

        }
        System.out.println("Girilen Sayının Faktöriyeli :" + faktoriyel);


    }

    public static void main (String [] args) {

        /*

         Javada Fonksiyonlara metod deriz :) fonksiyon = metod
         Bir defa yazıp heryerde kullanırız.


         Fonksiyonu tanımla. İstediğin Kadar Kullan.
         */

        selamlama(); // yukarıda selamlara fonksiyonu tanımlandı. artık fonsiyonun ( metodun) icindekiler ismini yazınca direk geliyot.
        selamlama();

        faktoriyel();
        faktoriyel(); // kod bloklarını 2 kez yazmak yerine fonksiyon/metod ismini yazarak kod blogunu cagırabiliriz..
selamlasma("Eda");

toplama(5,6,7);






    }


}
