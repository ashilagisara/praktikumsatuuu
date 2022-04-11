import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double saldo = sc.nextInt();
    int setor = sc.nextInt();
    double total = saldo+setor;
    double sisa = potongan(total);
    System.out.println(sisa);
    }
    public static double potongan(double a){
        double b = a-7000.00;
        double bonus = b *0.0005;
        double c = b+bonus;
        return c;
    }
}


import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       int pilihan  = scan.nextInt();
       if (pilihan == 1){
            int sisi = scan.nextInt();
            System.out.println(persegi(sisi));
        }
        else if (pilihan == 2){
            double alassegitiga   = scan.nextDouble();
            double tinggisegitiga = scan.nextDouble();
            System.out.println(segitiga(alassegitiga, tinggisegitiga));
        }
        else if (pilihan== 3){
            double jari = scan.nextDouble();
            if (jari%7 == 0){
                System.out.println(lingkaran(jari));
            }
            else 
             System.out.println(lingkaran2(jari));
        }
        else System.out.println("Input yang anda masukan tidak sesuai");
    }
    
    public static int persegi(int sisi){
        int hasil = sisi*sisi;
        return hasil;
    }
    public static int segitiga(Double a, Double t){
        int hasil = (int) (a*t/2);
        return hasil;
    }
    
    public static double lingkaran2(double r){
        double hasil = 3.14 * r* r;
        int result = (int)hasil; 
        return result;
    }
    
    public static double lingkaran(double r){
        double hasil = 22 / 7 * r * r;
        return hasil;
    }
    
    }
