package hashSet;g
import java.util.*;

public class simple {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(7);
        set.add(1);

        if (set.contains(1)) {
            System.out.println("Set contains 1");
        } else {
            System.out.println("Set doesn't contain 1");
        }
    }
}