import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String month;
        int day;
        /*Koç Burcu : 21 Mart - 20 Nisan

        Boğa Burcu : 21 Nisan - 21 Mayıs

        İkizler Burcu : 22 Mayıs - 22 Haziran

        Yengeç Burcu : 23 Haziran - 22 Temmuz

        Aslan Burcu : 23 Temmuz - 22 Ağustos

        Başak Burcu : 23 Ağustos - 22 Eylül

        Terazi Burcu : 23 Eylül - 22 Ekim

        Akrep Burcu : 23 Ekim - 21 Kasım

        Yay Burcu : 22 Kasım - 21 Aralık

        Oğlak Burcu : 22 Aralık - 21 Ocak

        Kova Burcu : 22 Ocak - 19 Şubat

        Balık Burcu : 20 Şubat - 20 Mart
         */

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ay:");
        month = keyboard.nextLine();
        System.out.println("Gün:");
        day = keyboard.nextInt();
    if(day<32 && day>0 ){
        if(month.equals("ocak")){
            if (day >= 22)
            System.out.println("Burcunuz: KOVA");
            else if (day<22)
                System.out.println("Burcunuz: OĞLAK");
        }if (month.equals("şubat")) {
            if(day>=20)
            System.out.println("Burcunuz: BALIK");
            else if((day<20)) {
                System.out.println("Burcunuz: KOVA");
            }
        }if (month.equals("mart")) {
            if ((day<=20))
            System.out.println("Burcunuz: BALIK");
            else if ((day > 20)) {
                System.out.println("Burcunuz: KOÇ");
            }
        }if (month.equals("nisan")) {
            if ((day<=20))
            System.out.println("Burcunuz: KOÇ");
            else if ((day > 20)) {
                System.out.println("Burcunuz: BOĞA");
            }
        }if (month.equals("mayıs")) {
            if(day<=21)
            System.out.println("Burcunuz: BOĞA");
            else if ((day > 21)) {
                System.out.println("Burcunuz: İKİZLER");
            }
        }if (month.equals("haziran")) {
            if ((day<=22))
            System.out.println("Burcunuz: İKİZLER");
            else if ((day > 22)) {
                System.out.println("Burcunuz: YENGEÇ");
            }
        }if (month.equals("temmuz")) {
            if(day<=22)
            System.out.println("Burcunuz: YENGEÇ");
            else if ((day > 22)) {
                System.out.println("Burcunuz: ASLAN");
            }
        }if (month.equals("ağustos")) {
            if(day<=22)
            System.out.println("Burcunuz: ASLAN");
            else if ((day > 22)) {
                System.out.println("Burcunuz: BAŞAK");
            }
        }if (month.equals("eylül")) {
            if(day<=22)
            System.out.println("Burcunuz: BAŞAK");
            else if ((day > 22)) {
                System.out.println("Burcunuz: TERAZİ ");
            }
        }if (month.equals("ekim")) {
            if(day<=22)
            System.out.println("Burcunuz: TERAZİ");
            else if ((day > 22)) {
                System.out.println("Burcunuz: AKREP");
            }
        }if (month.equals("kasım")) {
            if(day<=21)
            System.out.println("Burcunuz: AKREP");
            else if ((day > 21)) {
                System.out.println("Burcunuz: YAY");
            }
        }if (month.equals("aralık")) {
            if(day<=21)
            System.out.println("Burcunuz: YAY");
            else if ((day > 21)) {
                System.out.println("Burcunuz: OĞLAK");
            }
        }
    }
    }
}