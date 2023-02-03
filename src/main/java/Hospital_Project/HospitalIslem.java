package Hospital_Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HospitalIslem {


    public static void hastaneMenusu() throws InterruptedException {

        Scanner input=new Scanner(System.in);
        System.out.println("*************** QA-11 HASTANESINE HOSGELDINIZ ***************");
        System.out.println("\tYapmak istediginiz islemi seciniz: "+
                "\t\n 1) Doktor menusu "+
                "\t\n 2) Hasta menusu "+
                "\t\n 0) Cikis ");


         int   secim=input.nextInt();



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
