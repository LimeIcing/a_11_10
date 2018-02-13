import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main10 {

    /*
    Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
    odd length from the set.
     */

    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        a.add("kat");
        a.add("maske");
        a.add("bord");
        a.add("fod");
        a.add("sky");
        a.add("blomst");
        a.add("banan");
        a.add("neglelak");
        System.out.println(a);
        removeOddLength(a);
        System.out.println(a);
    }

    public static void removeOddLength(Set<String> set) {
        ArrayList<String> aux = new ArrayList<>();
        for (String string:set) {
            if (string.length() % 2 != 0) {
                aux.add(string);
            }
        }
        for (String string:aux) {
            set.remove(string);
        }
    }
}
