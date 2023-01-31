package Hospital_Project;


import static Hospital_Project.HospitalIslem.hastaneMenusu;

public class HospitalRunner {


    public static void main(String[] args) throws InterruptedException {

       PatientRunner pR=new PatientRunner();
       DoctorRunner dR=new DoctorRunner();
        hastaneMenusu();


    }













//    private static String doktorunvan(String hastaDurumu) {
//
//        if(hastaDurumu.equals("Allerji")){
//            return hastane1.unvanlar[0];
//        } else if (hastaDurumu.equals("Bas agrisi")) {
//            return hastane1.unvanlar[1];
//        }else if(hastaDurumu.equals("Diabet")){
//            return hastane1.unvanlar[2];
//        }
//        else if(hastaDurumu.equals("Soguk alginligi")){
//            return hastane1.unvanlar[3];
//        }
//        else if(hastaDurumu.equals("Migren")){
//            return hastane1.unvanlar[4];
//        }else if(hastaDurumu.equals("Kalp hastaliklari")){
//            return hastane1.unvanlar[5];
//        }else
//            return "Yanlis Durum";
//    }


}
