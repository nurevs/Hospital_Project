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

        System.out.println("Aranak isteginiz doktorun unvanini giriniz: ");
        String doktorunvan = input.next().toLowerCase();


        for (int i = 0; i < DataBank.unvanlar.length; i++) {
            if (doktorunvan.equalsIgnoreCase(DataBank.unvanlar[i])) {
                System.out.println("Aradiginiz doktorun isim ve soyismi: " + DataBank.doctorIsimleri[i] + " " + DataBank.doctorSoyIsimleri[i]);
            }else if(doktorunvan!=DataBank.unvanlar[i]){
                System.out.println("Girdiginiz unvandaki doktor liste icerisinde yok...");
                break;
            }
        }

    }

    private static void doktorSil() throws InterruptedException {
        System.out.println("silmek istediginiz doktorun unvanini giriniz");
        String arananunvan = input.nextLine();
        Set<String> keySet = doktorListesiMap.keySet();

        if(doktorListesiMap.containsKey(arananunvan)){
            doktorListesiMap.remove(arananunvan);
            System.out.println("doktor silindi.");
        }else {
            System.out.println("Doktor yok");
        }

       // System.out.println("Guncel doktor listesi"+ doktorListesiMap);
        System.out.println("Guncel doktor listesi");

        }

        public static void anaMenu () throws InterruptedException {
            hastaneMenusu();
        }

        private static void cikis () {
            System.out.println("Sistemden cikis yapildi");
        }


    }
