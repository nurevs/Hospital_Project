package Hospital_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoctorRunner {

    static Scanner input = new Scanner(System.in);
    static Map<String, String> doktorListesiMap = new HashMap<>();

    public static void doktorListesiMap() {
        doktorListesiMap.put("Allergist", "Nilson, Avery");
        doktorListesiMap.put("Norolog", "John, Abel");
        doktorListesiMap.put("Genel cerrah", "Robert, Erik");
        doktorListesiMap.put("Cocuk doktoru", "Marry, Jacob");
        doktorListesiMap.put("Dahiliye", "Alan, Pedro");
        doktorListesiMap.put("Kardiolog", "Mahesh, Tristen");

    }

    public static void doktorMenu() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("*************** DOKTOR MENUSU ***************\n" +
                "\n" +
                "\t 1-Doktor Ekle\t\n" +
                "\t 2-Doktor Listesi Yazdir\n" +
                "\t 3-Unvandan Doktor Bulma\n" +
                "\t 4-Doktor Silme\n" +
                "\t 5-ANAMENU\n" +
                "\t 6-Cikis");

        int tercih = input.nextInt();

        switch (tercih) {
            case 1:
                doktorEkle();
                doktorListesiYazdirma();
                doktorMenu();
                break;
            case 2:
                doktorListesiYazdirma();
                doktorMenu();
                break;
            case 3:
                doktorBul();
                doktorMenu();
                break;
            case 4:
                doktorSil();
                doktorListesiYazdirma();
                doktorMenu();
                break;
            case 5:
                anaMenu();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Lutfen gecerli bir islem giriniz.");


        }


    }

    private static void doktorEkle(

    ) {
    }
    private static void doktorListesiYazdirma() {
    }

    private static void doktorBul() {
    }
    private static void doktorSil() {
    }
    private static void anaMenu() {
    }
    private static void cikis() {
        System.out.println("Sistemden cikis yapildi");
    }


}
