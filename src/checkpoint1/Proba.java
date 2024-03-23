package checkpoint1;

import java.util.ArrayList;

public class Proba {
    public static void main(String[] args) {
        ArrayList<String> auto = new ArrayList<String>();
        auto.add("OPEL");
        auto.add("Mercedez Benz");
        auto.add("Toyota");
        System.out.println(auto.size());
        for (String s : auto) {
            System.out.println(s);
        }
        auto.remove(1);
        System.out.println(auto.size());
    }


}
