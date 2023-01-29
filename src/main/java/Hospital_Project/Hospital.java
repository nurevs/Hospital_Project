package Hospital_Project;

import javax.print.Doc;

public class Hospital extends DataBank{

    private Doctor doktor;
    private String hasta;

    public Hospital(Doctor doktor, String hasta) {
        this.doktor = doktor;
        this.hasta = hasta;
    }

    public Hospital(){

    }

    public Doctor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doctor doktor) {
        this.doktor = doktor;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }
}
