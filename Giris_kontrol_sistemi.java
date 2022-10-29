// GİRİŞ KONTROL SİSTEMİ 
package giris_kontrol_sistemi;
import java.util.Scanner;

public class Giris_kontrol_sistemi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String ad ="bilalkilic";
        String parola ="00002022";
        
        int giris_sayisi = 4;
        
        while (true)
        {
            System.out.println("Lütfen Adınızı Türkçe Karekter Kullanmadan Küçük Harflerle Ve Bitişik Giriniz :");
            String girilen_ad = input.nextLine();
            
            System.out.println("Lütfen Parolanızı Giriniz :");
            String girilen_parola = input.nextLine();
            
            if (ad.equals(girilen_ad) && parola.equals(girilen_parola))
            {
                System.out.println("Sisteme Hoş Geldiniz "+ad+" Bey.");
                break;
            }
            else if (!ad.equals(girilen_ad) && parola.equals(girilen_parola))
            {
                giris_sayisi -=1;
                System.out.println("Adınızı Yanlış Girdiniz. Tekrar Deneyiniz. Giriş Yapabilmek İçin Kalan Hakkınız :" +giris_sayisi);
            }
            else if (ad.equals(girilen_ad) && !parola.equals(girilen_parola)) 
            {
                giris_sayisi -=1;
                System.out.println("Parolanızı Yanlış Girdiniz. Tekrar Deneyiniz. Giriş Yapabilmek İçin Kalan Hakkınız :" +giris_sayisi);
            }
            else 
            {
                giris_sayisi -=1;
                System.out.println("Adınızı Ve Parolanızı Yanlış Girdiniz. Giriş Yapabilmek İçin Kalan Hakkınız :" +giris_sayisi);
            }
            if (giris_sayisi == 0)
            {
                System.out.println("Çok Fazla Yanlış Giriş Gerçekleştirdiniz. Lütfen Daha Sonra Tekrar Deneyiniz. Kalan Giriş Hakkınız :" +giris_sayisi);
                break;
            }   
        }   
    } 
}
