public class Session {
    private static Session instance = null;
    private Session(){}
    public static Session getInstance() {
        if(instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public void stopSession(ATM atm, Card card){

    }

    public void startSession(ATM atm, Card card){
        if(atm.security.validate(card)){

        }

    }
}
