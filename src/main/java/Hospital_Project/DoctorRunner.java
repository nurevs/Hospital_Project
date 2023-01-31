package Hospital_Project;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.InputMismatchException;

public class DoctorRunner  {

    static Scanner input = new Scanner(System.in);
   static Map<String, String> doktorListesiMap = new HashMap<>();
    static List <String >doktorListesi = new ArrayList<>();

    public static void doktorListesiMap() {


//        doktorListesi.add("Allergist: Nilson Avery\n");
//        doktorListesi.add("Norolog");
//        doktorListesi.add("Genel cerrah");
//        doktorListesi.add("Cocuk doktoru");
//        doktorListesi.add("Dahiliye");
//        doktorListesi.add("Kardiolog");




        doktorListesiMap.put("Allergist", "Nilson, Avery");
        doktorListesiMap.put("Norolog", "John, Abel");
        doktorListesiMap.put("Genel cerrah", "Robert, Erik");
        doktorListesiMap.put("Cocuk doktoru", "Marry, Jacob");
        doktorListesiMap.put("Dahiliye", "Alan, Pedro");
        doktorListesiMap.put("Kardiolog", "Mahesh, Tristen");
        Set set=doktorListesiMap.entrySet();

        Iterator i=set.iterator();
        while(i.hasNext()){
            Map.Entry me=(Map.Entry) i.next();
            System.out.println(me.getKey()+ " : "+ me.getValue());
        }


        //System.out.println(doktorListesiMap);



    }

    public static void doktorMenu() throws InputMismatchException {

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

    private static void doktorEkle() throws InputMismatchException{
        Scanner input = new Scanner(System.in);
        Doctor doktor = new Doctor();

        String unvan = null;
        try {
            System.out.println("Doktor unvani giriniz: ");
            unvan = input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Lutfen gecerli bir islem giriniz."+e.getMessage());
            e.printStackTrace();
        }
        String isim = null;
        try {
            System.out.println("Doktor adı ve soyadi giriniz: ");
            isim = input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Lutfen gecerli bir islem giriniz.");
        }


        doktorListesiMap.put(unvan, isim);

    }
    private static void doktorListesiYazdirma() {

        doktorListesiMap();

    }

    private static void doktorBul() {
        Doctor doktor =new Doctor();
        System.out.println("Aramak istediginiz doktorun unvanini giriniz: ");
        String unvan = input.nextLine();
        Set<String > doktorKey=doktorListesiMap.keySet();

        for (String key : doktorListesiMap.keySet()) {
           String value = doktorListesiMap.get(key);
           if (value==doktorListesiMap.get(key)) {
               System.out.println(DataBank.doctorIsimleri);
           }
        }
//        for (int i = 0; i <doktorListesiMap.size() ; i++)
//        {
//            if ( doktorListesiMap.containsValue(unvan)){
//                System.out.println("Var");
//            }else
//                System.out.println("Lutfen gecerli bir islem giriniz.");
////            doktor.setIsim(DataBank.doctorIsimleri[i]);
////            doktor.setSoyIsim(DataBank.doctorSoyIsimleri[i]);
////            doktor.setUnvan(DataBank.unvanlar[i]);
//
//        }
       // System.out.println(DataBank.doctorIsimleri);
    }
    private static void doktorSil() {
    }
    private static void anaMenu() {
    }
    private static void cikis() {
        System.out.println("Sistemden cikis yapildi");
    }


}
