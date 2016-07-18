import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWords {
    public static void main (String args[]) throws Exception {

        System.out.println("Counting Words");
        FileReader fr = new FileReader("d:\\text.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;
        Map<String, Integer> result = new HashMap<String, Integer>();
        while (line != null) {
            String[] parts = line.split(" ");
            for (String w : parts) {
                if (w.length() > 3) {
                    w = w.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (result.containsKey(w)) {
                        result.put(w, result.get(w) + 1);
                    } else {
                        result.put(w, 1);
                    }
                }
            }
            line = br.readLine();
        }
        System.out.println(sortByValue(result));
    }
    public static Map sortByValue(Map unsortedMap) {
        Map sortedMap = new TreeMap(new ValueComparator(unsortedMap));
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }
}


