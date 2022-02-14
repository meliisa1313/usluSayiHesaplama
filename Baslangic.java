package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        Scanner input=new Scanner(System.in);
        int sayi,us,i;
        int sonuc=1;
        System.out.println("uslu sayisinin hesaplanmasini istediginiz sayiyi giriniz");
        sayi= input.nextInt();
        System.out.println("ussu nedir");
        us= input.nextInt();
        for(i=1;i<=us;i++){
            sonuc=sayi*sonuc;

        }
        System.out.println(sonuc);



    }


    }




