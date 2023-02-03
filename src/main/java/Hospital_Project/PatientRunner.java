package Hospital_Project;

import javax.xml.crypto.Data;
import java.util.*;

import static Hospital_Project.HospitalIslem.hastaneMenusu;

public class PatientRunner {

    static Scanner input = new Scanner(System.in);
    static Map<String, String> hastaListesiMap = new HashMap<>();

    static Map<String, String> hasta = new HashMap<>();
    static Set<Map.Entry<String,String>> setHastalar = hastaListesiMap.entrySet();



    public static void hastaListesi() {
        hastaListesiMap.put("111", "Nurevsan , Ozturan , Allerji");
        hastaListesiMap.put("222", "Sibel , Bilen , Bas Agrisi");
        hastaListesiMap.put("333", "Gulten , Dogan , Diabet");
        hastaListesiMap.put("444", "Furkan , Kesimoglu , Soguk Alginligi");
        hastaListesiMap.put("555", "Seda , Celikors , Migren");
        hastaListesiMap.put("666", "Mustafa , Hasyildirim , Kalp Hastaliklari ");



        Iterator i = setHastalar.iterator();

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

        int tercih = 0;
        try{
            tercih = input.nextInt();
        }catch (Exception e){
            System.out.println("Lütfen gecerli bir sayı giriniz");

        }

            if (tercih > 0 || tercih < 7) {

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
                         hastaListesi();
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
                        System.out.println("1-7 arasi deger giriniz.");
                    break;
                }
            } else
                throw new InputMismatchException();
                 hastaMenusu();






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
        int tercih = 0;
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen durumuzu giriniz: ");
            tercih=input.nextInt();
        }catch (Exception e){
            System.out.println("Lutfen gecerli bir tercih seciniz.");
        }


        //do {
            if (tercih > 0 || tercih < 7) {
                switch (tercih) {

                    case 1:
                        aciliyet = false;
                        System.out.println("Durumunuz acil degil");
                        hastaMenusu();
                        break;
                    case 2:
                        aciliyet = false;
                        System.out.println("Durumunuz acil degil");
                        hastaMenusu();
                        break;
                    case 3:
                        aciliyet = false;
                        System.out.println("Durumunuz acil degil");
                        hastaMenusu();
                        break;
                    case 4:
                        aciliyet = true;
                        System.out.println("Durumunuz acil ");
                        hastaMenusu();
                        break;
                    case 5:
                        aciliyet = true;
                        System.out.println("Durumunuz acil ");
                        hastaMenusu();
                        break;
                    case 6:
                        hastaMenusu();
                        break;
                    case 7:
                        cikis();
                        break;
                    default:
                        System.out.println("1-7 arasi deger giriniz.");


                }//}else
               // throw new InputMismatchException();


        }while (tercih<7);


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

        int hastaId =100;
        try {
             hastaId = input.nextInt();
        }catch (Exception e){
            System.out.println("Lutfen sayi giriniz");
            hastaId++;
        }


        hastaListesiMap.put(String.valueOf(hastaId), isimSoyisim);

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


    public static void anaMenu() throws InterruptedException {
        hastaneMenusu();
    }

    private static void hastaSilme() throws InterruptedException {

        System.out.println("silmek istediginiz hastanin ID'sini giriniz");
        String arananID = input.next();



        if(hastaListesiMap.containsKey(arananID)){
            hastaListesiMap.remove(arananID);
            System.out.println("hasta silindi.");
        }else {
            System.out.println("Hasta yok");
        }

        System.out.println("Guncel hasta listesi");


    }


    private static void cikis() {
        System.out.println("Sistemden cikis yapildi");

    }


}
