import java.util.Date;
import java.util.List;

public class Session {
    private static Session instance = null;
    private static boolean isCardValid = false;
    private long id;
    private Card card;
    private List<GSMConnection> connections;
    private Security security;


    private Session(Card card) {
        Date date = new Date();
        id = date.getTime() / 1000 * ATM.getAtmId();
        security = Security.getInstance();
        if (security.validate(card)) {
            this.card = card;
            setIsCardValid(true);
        }
    }

    public static Session getInstance(Card card) {
        if (instance == null) {
            instance = new Session(card);
        }
        if (isCardValid) {
            return instance;
        } else {
            return null;
        }
    }

    public void killActiveConnections() {
        if (connections.size() != 0) {
            /*for(GSMConnection connection : connections){
                connection.closeConnection();
            }*/
            connections.clear();
        }
    }

    public void stopSession(ATM atm) {
        killActiveConnections();
        if (atm.isCardInserted()) atm.ejectCard();
        atm.setIsSessionOpen(false);
    }

    public void startSession(ATM atm) {
        atm.setIsSessionOpen(true);
    }

    public void setIsCardValid(boolean isCardValid) {
        this.isCardValid = isCardValid;
    }


    private class Security {

        Security() {
        }

        public String getToken() {
            return String.valueOf(ATM.getAtmId() * 2);
        }

        public boolean validate(Card card) {
            if (ATM.isGSMNetworkAvailable()) {
                Session.this.establishGSMConnection(getToken());
            }
        }
    }

    private voind establishGSMConnection(String token) {
    }
}
