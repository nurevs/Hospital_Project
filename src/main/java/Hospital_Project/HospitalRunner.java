package Hospital_Project;

import javax.print.Doc;

public class HospitalRunner {

    private static Hospital hastane1 = new Hospital ();
    Doctor doktor = new Doctor();
    Patient hasta = new Patient();

    public HospitalRunner() {
    }

    public static void main(String[] args) {

        String hastaDurumu="Allerji ";
        String unvan=doktorunvan(hastaDurumu) ;
        doktorBul(unvan);





    }

    private static Doctor doktorBul(String unvan) {
        Doctor doktor =new Doctor();
        for (int i = 0; i <hastane1.unvanlar.length ; i++) {
            doktor.setIsim(hastane1.doctorIsimleri[i]);
            doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
            doktor.setUnvan(unvan);

        }
        return doktor;
    }
    private static Patient hastaBul(String aktuelDurum) {
       Patient hasta=new Patient();
       Status durum=new Status();

        for (int i = 0; i <hastane1.hastaIsimleri.length ; i++) {
            hasta.setIsim(hastane1.hastaIsimleri[i]);
            hasta.setSoyIsim(hastane1.hastaSoyIsimleri[i]);
            hasta.setHastaID(Integer.parseInt(aktuelDurum));//emin degiliz
            hastaDurumuBul(aktuelDurum).setAktuelDurum(aktuelDurum); //Emin DEgiliz

        }

        return hasta;

    }

    private static Status hastaDurumuBul(String aktuelDurum){

        Status aktuelDurum1 = new Status();
        boolean aciliyet;

        switch (aktuelDurum) {
            case "Allerji":
                aciliyet = false;
                break;
            case "Bas Agrisi":
                aciliyet = false;
                break;
            case "Diabet":
                aciliyet = false;
                break;
            case "Soguk Alginligi":
                aciliyet = false;
                break;
            case "Migren":
                aciliyet = true;
                break;
            case "Kalp hastaliklari":
                aciliyet = true;
                break;
            default:
                System.out.println("Gecerli bir durum degil");


        }
        return aktuelDurum1;


    }

    private static String doktorunvan(String hastaDurumu) {

        if(hastaDurumu.equals("Allerji")){
            return hastane1.unvanlar[0];
        } else if (hastaDurumu.equals("Bas agrisi")) {
            return hastane1.unvanlar[1];
        }else if(hastaDurumu.equals("Diabet")){
            return hastane1.unvanlar[2];
        }
        else if(hastaDurumu.equals("Soguk alginligi")){
            return hastane1.unvanlar[3];
        }
        else if(hastaDurumu.equals("Migren")){
            return hastane1.unvanlar[4];
        }else if(hastaDurumu.equals("Kalp hastaliklari")){
            return hastane1.unvanlar[5];
        }else
            return "Yanlis Durum";
    }


}
