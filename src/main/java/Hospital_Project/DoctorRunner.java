package Hospital_Project;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.InputMismatchException;

public class DoctorRunner {
    static Map<String, String> doktorListesi = new HashMap<>();

    static Scanner input = new Scanner(System.in);
    static Map<String, String> doktorListesiMap = new HashMap<>();
    //  static List <String >doktorListesi = new ArrayList<>();

    public static void doktorListesiMap() {

        doktorListesiMap.put("Allergist", "Nilson, Avery");
        doktorListesiMap.put("Norolog", "John, Abel");
        doktorListesiMap.put("Genel cerrah", "Robert, Erik");
        doktorListesiMap.put("Cocuk doktoru", "Marry, Jacob");
        doktorListesiMap.put("Dahiliye", "Alan, Pedro");
        doktorListesiMap.put("Kardiolog", "Mahesh, Tristen");
        Set set = doktorListesiMap.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
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

    private static void doktorEkle() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        Doctor doktor = new Doctor();

        String unvan = null;
        try {
            System.out.println("Doktor unvani giriniz: ");
            unvan = input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Lutfen gecerli bir islem giriniz." + e.getMessage());
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

        Scanner input = new Scanner(System.in);
        System.out.println("``````````````unvandan doktor bulma```````````````");
        System.out.println("aradiginiz doktorun unvanini giriniz");
        String arananUnvan = input.nextLine();

        for (Map.Entry<String,String >w:doktorListesiMap.entrySet()) {
            if (w.getKey().equals(arananUnvan)) {}
            System.out.println("hggh"+w);
        }

//        Set<String> doktor = doktorListesiMap.keySet();
//        for (int i = 0; i < doktorListesiMap.size(); i++) {
//            if (doktor.toArray()[i].equals(arananUnvan)) {
//                System.out.println("doktor"+doktor.toArray()[i]);
//
//            }
//        }

        // Set <Map.Entry<String,String>>doktor=doktorListesi.entrySet();


//        for (Map.Entry<String, String> stringStringEntry : doktor) {
//            String eachKey= stringStringEntry.getKey();
//            String eachval= stringStringEntry.getValue();
//            String valarr []=eachval.split(",");
//            if (eachKey.contains(arananUnvan)){
//                System.out.println(eachKey);
//                System.out.println(eachval);
//                System.out.println(valarr[0] + " " + valarr[1]);
//                a = true;
//                break;
//            }
//        }
//        if (!a) {
//            System.out.println("Aradiginiz unvana sahip doktor bulunamadi.");
//            System.out.println("lutfen yeniden deneyiniz");
//            doktorBul();
//        }

//        Doctor doktor =new Doctor();
//        System.out.println("Aramak istediginiz doktorun unvanini giriniz: ");
//        String unvan = input.nextLine();
//       // Set<String > doktorKey=doktorListesiMap.keySet();
//
//        for (String key : doktorListesiMap.keySet()) {
//           String value = doktorListesiMap.get(key);
//
//           if (unvan==key) {
//               System.out.println(DataBank.doctorIsimleri);
//           }
//        }
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
        System.out.println("silmek istediginiz doktorun unvanini giriniz");
        String arananunvan = input.nextLine();
        Set<String> keySet = doktorListesiMap.keySet();

        for(int i=0;i<DataBank.unvanlar.length;i++){

            if(DataBank.unvanlar[i].equals(arananunvan)){
                doktorListesiMap.remove(keySet);
                System.out.println("silindi");

            }
        }

//        for (int i = 0; i < doktorListesiMap.size(); i++) {
//            if (arananunvan.equals(keySet)) {
//                keySet.remove(arananunvan);
//                System.out.println(arananunvan + " unvandaki doktor silinmistir.");
//            }
//        }
//        boolean a=false;
//        if (doktorListesi.containsKey(arananunvan)) {
//            doktorListesi.remove(arananunvan);
//           doktorListesiMap();
//            System.out.println("istenen doktor silindi");
//            a=true;
//        } else if (a==false) {
//            System.out.println("gecerli unvan giriniz");
//            System.out.println();
//           //doktorBul();
//
//        }

    }

    private static void anaMenu() {
    }

    private static void cikis() {
        System.out.println("Sistemden cikis yapildi");
    }


}
