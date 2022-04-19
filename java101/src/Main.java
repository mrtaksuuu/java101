import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        double sonuc;
        // Scanner
        Scanner kb = new Scanner(System.in);

        // Kullanıcadan Veri Alma
        System.out.print("Matemetik Notunuz : ");
        mat = kb.nextInt();


        System.out.print("Fizik Notunuz : ");
        fizik = kb.nextInt();


        System.out.print("Kimya Notunuz : ");
        kimya = kb.nextInt();


        System.out.print("Turkce Notunuz : ");
        turkce = kb.nextInt();


        System.out.print("Tarih Notunuz : ");
        tarih = kb.nextInt();


        System.out.print("Muzik Notunuz : ");
        muzik = kb.nextInt();


        toplam = (mat + fizik + kimya + turkce + tarih + muzik);
                sonuc = toplam / 6;
                System.out.println("Ortalamaniz : " + sonuc);
                boolean Gecti = sonuc >= 60;
                boolean Kaldı = sonuc < 60;
                boolean sonuc2 = Gecti || Kaldı;
                String str = sonuc2 ? "Sınıfı Gecti" : "Sınıfta Kaldi";
                System.out.println(str);

    (https://www.patika.dev)

    }

}
