package Hospital_Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HospitalIslem {


    public static void hastaneMenusu() throws InterruptedException {

        Scanner input=new Scanner(System.in);
        System.out.println("=============== QA-11 Hastanesine Hosgeldiniz ===============");
        System.out.println("Yapmak istediginiz islemi seciniz: "+
                "\n ===>Doktor menusu icin 1'e "+
                "\n ===>Hasta menusu icin 2'e "+
                "\n ===>Cikis icin 0'a basin");
        int secim=0;
        try{
            secim=input.nextInt();
        }catch(Exception e){
            System.out.println("Lütfen gecerli bir sayı giriniz");
        }


        if (secim > -1 || secim < 3) {
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
        } else
            throw new InputMismatchException();
            hastaneMenusu();

    }


    private static void cikis(){
        System.out.println("Sistemden cikis yapildi");
    }

}
