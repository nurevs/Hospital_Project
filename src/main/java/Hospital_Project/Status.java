package Hospital_Project;

public class Status {
    private String aktuelDurum;
    private boolean aciliyet;


//    public Status(String aktuelDurum, boolean aciliyet) {
//        this.aktuelDurum = aktuelDurum;
//        this.aciliyet = aciliyet;
//    }

    public String getAktuelDurum() {
        return aktuelDurum;
    }

    public void setAktuelDurum(String aktuelDurum) {
        this.aktuelDurum = aktuelDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }

    @Override
    public String toString() {
        return "Status{" +
                "aktuelDurum='" + aktuelDurum + '\'' +
                ", aciliyet=" + aciliyet +
                '}';
    }
}
