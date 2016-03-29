import java.util.HashMap;
import java.util.Scanner;

public class TipsCalculator {
    public static void main(String[] args) {
        int price = 0;
        HashMap<String, Integer> qualityRate = new HashMap<>();
        qualityRate.put("terrible", 0);
        qualityRate.put("poor", 5);
        qualityRate.put("good", 10);
        qualityRate.put("great", 15);
        qualityRate.put("excellent", 20);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price: ");
        if (scanner.hasNextInt()) {
            price = scanner.nextInt();
        }
        System.out.print("Enter quality of service: ");
        if (scanner.hasNext()) {
            String quality = scanner.next();
            if (qualityRate.containsKey(quality)) {
                int tip = qualityRate.get(quality);
                price = price + ((price * tip) / 100);
                System.out.println("Your price is: " + price);
            } else {
                System.out.println("There is no such quality listed. your price is: " + price);
            }

        }
    }
}
