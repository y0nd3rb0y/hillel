public class ATM {
    User user;

    public ATM(User user){
        this.user = user;
    }
    public void showUser(){
        user.printName();
    }
}
