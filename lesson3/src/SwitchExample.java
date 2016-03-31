/**
 * Created by User on 28.03.2016.
 */
public class SwitchExample {
    public static void main(String[] args) {
        String cond = "3";
        switch (cond){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            default:
                System.out.println(cond);
                break;
        }


    }
}
