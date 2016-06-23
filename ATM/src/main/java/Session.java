import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class Session {
    private Logger log = Logger.getLogger("logger");
    private static Session instance = null;
    private static boolean isCardValid = false;

    public long getId() {
        return id;
    }

    private long id;
    private Card card;
    private List<GSMConnection> connections;
    private static Security security;


    private Session(Card card) {
        Date date = new Date();
        id = date.getTime() / 1000 * ATM.getAtmId();
        security = Security.getInstance(card);
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


    private static class Security {

        private Security(Card card) {
            this.card = card;
        }
        private Card card;
        private static Security sec_instance;

        public static Security getInstance(Card card){
            if(sec_instance == null) sec_instance = new Security(card);
            return sec_instance;
        }

        public String getToken() {
            return String.valueOf(ATM.getAtmId() * 2);
        }

        public boolean validate(Card card) {
            //if (ATM.isGSMNetworkAvailable()) {
            //    Session.this.establishGSMConnection(getToken());
            //}
            return true;
        }
    }

    private GSMConnection establishGSMConnection(){
        GSMConnection gsmConnection = new GSMConnection(security.getToken());
        connections.add(gsmConnection);
        return gsmConnection;
    }
}
