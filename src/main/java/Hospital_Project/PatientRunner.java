package Hospital_Project;

import javax.xml.crypto.Data;
import java.util.*;

public class PatientRunner {

    static Scanner input = new Scanner(System.in);
    static Map<String, String> hastaListesiMap = new HashMap<>();
    static int hastaIdNo = 100;
    static Map<String, String> hasta = new HashMap<>();



    public static void hastaListesi() {
        hastaListesiMap.put("111", "Nurevsan , Ozturan , Allerji");
        hastaListesiMap.put("222", "Sibel , Bilen , Bas Agrisi");
        hastaListesiMap.put("333", "Gulten , Dogan , Diabet");
        hastaListesiMap.put("444", "Furkan , Kesimoglu , Soguk Alginligi");
        hastaListesiMap.put("555", "Seda , Celikors , Migren");
        hastaListesiMap.put("666", "Mustafa , Yildirim , Kalp Hastaliklari ");

        Set set = hastaListesiMap.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }


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
                hastaListesiYazdir();
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

        boolean aciliyet = true;
        System.out.println("*************** HASTA DURUMU ***************\n" +
                "\n " +
                "\t 1-Allerji\t\n" +
                "\t 2-Bas Agrisi\n" +
                "\t 3-Cocuk Hastaliklari\n" +
                "\t 4-Migren\n" +
                "\t 5-Kalp Hastaliklari\n" +
                "\t 6-HastaMenusu\n" +
                "\t 7-Cikis");

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen durumuzu giriniz: ");
        String tercih = input.nextLine();


        switch (tercih) {

            case "1":
                aciliyet = false;
                System.out.println("Durumunuz acil degil");
                break;
            case "2":
                aciliyet = false;
                System.out.println("Durumunuz acil degil");
                break;
            case "3":
                aciliyet = false;
                System.out.println("Durumunuz acil degil");
                break;
            case "4":
                aciliyet = true;
                System.out.println("Durumunuz acil ");
                break;
            case "5":
                aciliyet = true;
                System.out.println("Durumunuz acil ");
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
        hastaListesi();

    }

    private static void hastaEkle() {
        Scanner input = new Scanner(System.in);
        System.out.println("`````````````HASTA EKLEME ```````````````");
        System.out.println("eklemek istediginin hastanin  isim ve soyismini yaziniz:");
        String isimSoyisim = input.nextLine();
        System.out.println("eklemek istediginin hastanin  Id sini yaziniz:");
        String hastaId = input.next();

        hastaListesiMap.put(hastaId, isimSoyisim);

        System.out.println("hasta eklendi.");


    }

    private static void hastaBulma() throws InterruptedException {
       // Map<String, String > hastaBul = new HashMap<>();

        System.out.println("*************** HASTA BULMA ***************\n");
        Set<String> keySet = hastaListesiMap.keySet();

        Scanner input = new Scanner(System.in);
        System.out.println("Aranak isteginiz hastanin ID'si giriniz: ");
        String hastaID = input.next();
        Set<String> hastaBul=hastaListesiMap.keySet();

        for (int i=0;i< DataBank.hastaIDleri.length;i++) {
            if (hastaID.equals(DataBank.hastaIDleri[i])){
                System.out.println("Aradiginiz hastanin isim ve soyismini: "+ DataBank.hastaIsimleri[i]+" "+DataBank.hastaSoyIsimleri[i]);
            }
        }

    }


    private static void anaMenu() throws InterruptedException {
        hastaMenusu();
    }

    private static void hastaSilme() {




    }

    private static void cikis() {
        System.out.println("Sistemden cikis yapildi");
    }


}
