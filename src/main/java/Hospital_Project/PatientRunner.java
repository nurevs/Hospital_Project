package Hospital_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PatientRunner {

    static Scanner input=new Scanner(System.in);
    static Map<Integer,String > hastaListesiMap= new HashMap<>();
    static int hastaIdNo=100;



    public static void hastaListesi(){
        hastaListesiMap.put(111,"Nurevsan , Ozturan , Allerji");
        hastaListesiMap.put(222,"Sibel , Bilen , Bas Agrisi");
        hastaListesiMap.put(333,"Gulten , Dogan , Diabet");
        hastaListesiMap.put(444,"Furkan , Kesimoglu , Soguk Alginligi");
        hastaListesiMap.put(555,"Seda , Celikors , Migren");
        hastaListesiMap.put(666,"Mustafa , Yildirim , Kalp Hastaliklari ");

    }

    public static void hastaMenusu()  throws InterruptedException{

    Scanner input=new Scanner(System.in);
        System.out.println("*************** HASTA MENUSU ***************\n"+
                "\n "+
                "\t 1-Hasta Ekle\t\n"+
                "\t 2-Hasta Listesi Yazidir\n"+
                "\t 3-Hasta Durumu Listele\n"+
                "\t 4-Hasta Silme \n"+
                "\t 5-Hasta Bulma \n"+
                "\t 6-AnaMenu\n"+
                "\t 7-Cikis");

        int tercih=input.nextInt();


        switch (tercih){
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

    private static void hastaDurumu() {
    }

    private static void hastaListesiYazdir() {

    }

    private static void hastaEkle() {
    }

    private static void hastaBulma() {
    }

    private static void anaMenu() {
    }

    private static void hastaSilme() {
    }
    private static void  cikis() {
        System.out.println("Sistemden cikis yapildi");
    }




}
