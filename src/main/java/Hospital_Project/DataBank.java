package Hospital_Project;

import java.util.Arrays;
import java.util.List;

public class DataBank {
    static String[] doctorIsimleri = {"Nilson", "John", "Robert", "Marry", "Alan", "Mahesh"};
    static String[] doctorSoyIsimleri = {"Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen"};
    static String[] unvanlar = {"Allergist", "Norolog", "Genel cerrah", "Cocuk doktoru",
            "Dahiliye", "Kardiolog"};
    static String[] hastaIsimleri = {"Warren", "Petanow", "Sophia", "Emma", "Darian",
            "Peter"};
    static String[] hastaSoyIsimleri = {"Traven", "William", "George", "Tristan", "Luis",
            "Cole"};
    String[] durumlar = {"Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren",
            "Kalp hastaliklari"};
    Integer[] hastaIDleri = {111, 222, 333, 444, 555, 666};

    List<String > doktorName = Arrays.asList(doctorIsimleri);
    List<String > doktorFamily = Arrays.asList(doctorSoyIsimleri);
    List<String > unvanName = Arrays.asList(unvanlar);
    List<String > hastaName = Arrays.asList(hastaIsimleri);
    List<String > durumName = Arrays.asList(durumlar);
    List<Integer> hastaIDs = Arrays.asList(hastaIDleri);

}
