package Hospital_Project;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.InputMismatchException;

import static Hospital_Project.HospitalIslem.hastaneMenusu;
import static Hospital_Project.PatientRunner.*;

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

    public static void doktorMenu() throws InputMismatchException, InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("*************** DOKTOR MENUSU ***************\n" +
                "\n" +
                "\t 1-Doktor Ekle\t\n" +
                "\t 2-Doktor Listesi Yazdir\n" +
                "\t 3-Unvandan Doktor Bulma\n" +
                "\t 4-Doktor Silme\n" +
                "\t 5-ANAMENU\n" +
                "\t 6-Cikis");

        int tercih = 0;
       try {
           tercih= input.nextInt();
       }catch (InputMismatchException e){
           System.out.println("Lütfen gecerli bir sayı giriniz");
       }

        if (tercih > 0 || tercih < 7) {
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
        } else
            throw new InputMismatchException();
        hastaMenusu();


    }

    private static void doktorEkle() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        Doctor doktor = new Doctor();

        String unvan = null;
//        try {
            System.out.println("Doktor unvani giriniz: ");
            unvan = input.nextLine();
//        } catch (Exception e) {
            //System.out.println("Lutfen gecerli bir islem giriniz." + e.getMessage());
       // }
        String isim = null;
//        try {
            System.out.println("Doktor adı ve soyadi giriniz: ");
            isim = input.nextLine();
//        } catch (Exception e) {
           // System.out.println("Lutfen gecerli bir islem giriniz.");
       //}


        doktorListesiMap.put(unvan, isim);

    }

    private static void doktorListesiYazdirma() {

        doktorListesiMap();

    }

    private static void doktorBul() {


        System.out.println("*************** DOKTOR BULMA ***************\n");
        Scanner input = new Scanner(System.in);
        // Set<String> keySet = doktorListesiMap.keySet();

        System.out.println("Aranak isteginiz doktorun unvanini giriniz: ");
        String doktorunvan = input.next().toLowerCase();
        // Set<String> doktorBul=doktorListesiMap.keySet();

        for (int i = 0; i < DataBank.unvanlar.length; i++) {
            if (doktorunvan.equalsIgnoreCase(DataBank.unvanlar[i])) {
                System.out.println("Aradiginiz doktorun isim ve soyismi: " + DataBank.doctorIsimleri[i] + " " + DataBank.doctorSoyIsimleri[i]);
            }else if(doktorunvan!=DataBank.unvanlar[i]){
                System.out.println("Girdiginiz unvan doktorlar icerisinde yok...");
                break;
            }
        }

    }

    private static void doktorSil() throws InterruptedException {
        System.out.println("silmek istediginiz doktorun unvanini giriniz");
        String arananunvan = input.nextLine();
        Set<String> keySet = doktorListesiMap.keySet();

//        Hospital hospitalObj = new Hospital();
//
//        for (Map.Entry<String, String> w : hastaListesiMap.entrySet()) {
//            String keyValue = w.getKey();
//            if (arananunvan.equals(w.getKey())) {
//                String silinecekValue = hastaListesiMap.get(arananunvan);
//                String sonucValue = hastaListesiMap.remove(arananunvan);
//
//                boolean kontrol = silinecekValue.equalsIgnoreCase(sonucValue);
//                if (kontrol) {
//                    System.out.println("Kayit silindi.");
//                    System.out.println("Hasta silmeye devam etmek icin 1'e \n Menuye donmek icin 2'ye basiniz");
//                    int geri = input.nextInt();
//                    if (geri == 2) {
//                        DoctorRunner.anaMenu();
//                    } else if (geri == 1) {
//                        hastaSil();
//                    }
//                }
//            } else {
//                System.out.println("Girdiginiz ID´ye sahip hasta bulunamadi.");
//                hastaSil();
//            }
//        }

//       List<Patient> hastaListe=new ArrayList<>();
//       boolean remove=false;
//
//        for(Patient w:hastaListe){
//
//            if(w.getHastaID()==hastaIdNo){
//                remove=true;
//                hastaListe.remove(w);
//
//            }
//
//        }
//        System.out.println("Islem sonucu= "+ remove);

//        System.out.println("Suanki doktor listesi: ");
//        for (int i=0;i<DataBank.doctorIsimleri.length;i++) {
//            System.out.print(DataBank.doctorIsimleri[i] + " ");
//        }
//            System.out.println();
//            for (int j = 0; j < DataBank.doctorSoyIsimleri.length; j++) {
//                System.out.print(DataBank.doctorSoyIsimleri[j]+" ");
//            }
//            for (int k=0;k< DataBank.unvanlar.length;k++) {
//                System.out.println(DataBank.unvanlar[k]+" ");
//            }


//        for (int i = 0; i < doktorListesiMap.size(); i++) {
//            if (arananunvan.equals(keySet)) {
//                keySet.remove(arananunvan);
//                System.out.println(arananunvan + " unvandaki doktor silinmistir.");
//            }
//            doktorListesiMap.put(i,arananunvan);
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

        public static void anaMenu () throws InterruptedException {
            hastaneMenusu();
        }

        private static void cikis () {
            System.out.println("Sistemden cikis yapildi");
        }


    }
