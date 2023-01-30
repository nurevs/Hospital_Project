package Hospital_Project;

public class Patient extends DataBank{
    private String isim;
    private String soyIsim;
    private int hastaID;
     private Status hastaDurumu;


    public Patient(String isim, String soyIsim, int hastaID, Status hastaDurumu) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaID = hastaID;
        this.hastaDurumu = hastaDurumu;
    }



    public Patient() {

    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Status getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Status hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", hastaID=" + hastaID +
                ", hastaDurumu=" + hastaDurumu +
                '}';
    }
}
