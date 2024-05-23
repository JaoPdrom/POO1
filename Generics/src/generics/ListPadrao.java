package generics;

import java.util.ArrayList;
import java.util.List;

public class ListPadrao {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        String a = "abc";
        String b = "def";
        String c = "ghi";

        lista.add(a);
        lista.add(b);
        lista.add(c);

        for (String str : lista){

        }
    }
}
