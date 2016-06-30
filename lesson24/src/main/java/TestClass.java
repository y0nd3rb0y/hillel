public class TestClass {
    public static void main(String[] args) {
        User user = new User();
        ATM atm = new ATM(user);
        atm.showUser();
    }
}
