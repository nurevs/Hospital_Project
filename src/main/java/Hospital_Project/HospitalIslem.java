package Hospital_Project;

import java.util.Scanner;

public class HospitalIslem {


    public static void hastaneMenusu() throws InterruptedException {

        Scanner input=new Scanner(System.in);
        System.out.println("=============== QA-11 Hastanesine Hosgeldiniz ===============");
        System.out.println("Yapmak istediginiz islemi seciniz: "+
                "\n ===>Doktor menusu icin 1'e "+
                "\n ===>Hasta menusu icin 2'e "+
                "\n ===>Cikis icin 0'a basin");
        int secim=input.nextInt();

        switch (secim){
            case 1:
                DoctorRunner.doktorMenu();
                break;
            case 2:
                PatientRunner.hastaMenusu();
                break;
            case 0:
                cikis();
                break;
        }

    }


    private static void cikis(){
        System.out.println("Sistemden cikis yapildi");
    }

}
