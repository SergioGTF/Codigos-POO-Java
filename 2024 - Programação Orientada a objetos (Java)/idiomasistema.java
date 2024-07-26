import java.util.*;

public class idiomasistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
}