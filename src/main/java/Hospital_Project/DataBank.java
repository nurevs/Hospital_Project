package Hospital_Project;

import java.util.Arrays;
import java.util.List;

public class DataBank {
    static String[] doctorIsimleri = {"Nilson", "John", "Robert", "Marry", "Alan", "Mahesh"};
    static String[] doctorSoyIsimleri = {"Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen"};
    static String[] unvanlar = {"Allergist", "Norolog", "Genel cerrah", "Cocuk doktoru",
            "Dahiliye", "Kardiolog"};
    static String[] hastaIsimleri = {"Nurevsan", "Sibel", "Gulten", "Furkan", "Seda",
            "Mustafa"};
    static String[] hastaSoyIsimleri = {"Ozturan", "Bilen", "Dogan", "Kesimoglu", "Celikors",
            "Yildirim"};
   static String[] durumlar = {"Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren",
            "Kalp hastaliklari"};
    static String[] hastaIDleri = {"111", "222", "333", "444", "555", "666"};

    List<String > doktorName = Arrays.asList(doctorIsimleri);
    List<String > doktorFamily = Arrays.asList(doctorSoyIsimleri);
    List<String > unvanName = Arrays.asList(unvanlar);
    List<String > hastaName = Arrays.asList(hastaIsimleri);
    List<String > durumName = Arrays.asList(durumlar);
    List<String> hastaIDs = Arrays.asList(hastaIDleri);

}
