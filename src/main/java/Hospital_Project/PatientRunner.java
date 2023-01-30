package Hospital_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PatientRunner {

    static Scanner input = new Scanner(System.in);
    static Map<Integer, String> hastaListesiMap = new HashMap<>();
    static int hastaIdNo = 100;




    public static void hastaListesi() {
        hastaListesiMap.put(111, "Nurevsan , Ozturan , Allerji");
        hastaListesiMap.put(222, "Sibel , Bilen , Bas Agrisi");
        hastaListesiMap.put(333, "Gulten , Dogan , Diabet");
        hastaListesiMap.put(444, "Furkan , Kesimoglu , Soguk Alginligi");
        hastaListesiMap.put(555, "Seda , Celikors , Migren");
        hastaListesiMap.put(666, "Mustafa , Yildirim , Kalp Hastaliklari ");

    }

    public static void hastaMenusu() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("*************** HASTA MENUSU ***************\n" +
                "\n " +
                "\t 1-Hasta Ekle\t\n" +
                "\t 2-Hasta Listesi Yazidir\n" +
                "\t 3-Hasta Durumu Listele\n" +
                "\t 4-Hasta Silme \n" +
                "\t 5-Hasta Bulma \n" +
                "\t 6-AnaMenu\n" +
                "\t 7-Cikis");

        int tercih = input.nextInt();


        switch (tercih) {
            case 1:
                hastaEkle();
                hastaMenusu();
                break;
            case 2:
                hastaListesiYazdir();
                hastaMenusu();
                break;
            case 3:
                hastaDurumu();
                hastaMenusu();
                break;
            case 4:
                hastaSilme();
                hastaMenusu();
                break;
            case 5:
                hastaBulma();
                hastaMenusu();
                break;
            case 6:
                anaMenu();
                hastaMenusu();
                break;
            case 7:
                cikis();
                break;
            default:
                System.out.println("Lutfen gecerli bir tercih seciniz.");
        }


    }

    private static void hastaDurumu() throws InterruptedException {

        boolean aciliyet=true;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen durumuzu giriniz: ");
        String tercih = input.nextLine();
        System.out.println("*************** HASTA DURUMU ***************\n" +
                "\n " +
                "\t 1-Allerji\t\n" +
                "\t 2-Bas Agrisi\n" +
                "\t 3-Cocuk Hastaliklari\n" +
                "\t 4-Migren\n" +
                "\t 5-Kalp Hastaliklari" +
                "\t 6-HastaMenusu\n" +
                "\t 7-Cikis");

        switch (tercih) {

            case "1":
                aciliyet = false;
                break;
            case "2":
                aciliyet = false;
                break;
            case "3":
                aciliyet = false;
                break;
            case "4":
                aciliyet = true;
                break;
            case "5":
                aciliyet = true;
                break;
            case "6":
                hastaMenusu();
                break;
            case "7":
                cikis();
                break;
            default:
                System.out.println("Lutfen gecerli bir tercih seciniz.");


        }


    }

    private static void hastaListesiYazdir() {

    }

    private static void hastaEkle() {
    }

    private static void hastaBulma() throws InterruptedException {
        Patient hasta=new Patient();
        /// Status durum=new Status();

        for (int i = 0; i <DataBank.hastaIsimleri.length ; i++) {
            hasta.setIsim(DataBank.hastaIsimleri[i]);
            hasta.setSoyIsim(DataBank.hastaSoyIsimleri[i]);
            //hasta.setHastaID(Integer.parseInt(aktuelDurum));//emin degiliz


        }

    }

    private static void anaMenu() {
    }

    private static void hastaSilme() {
    }

    private static void cikis() {
        System.out.println("Sistemden cikis yapildi");
    }


}
