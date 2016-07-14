import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("first");
        set.add("second");
        set.add("first");

        for (String ele: set){
            System.out.println(ele);
        }
    }
}
