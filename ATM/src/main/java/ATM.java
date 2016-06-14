import java.util.logging.Logger;

public class ATM {
    private Logger log = Logger.getLogger("logger");
    private static ATM instance=null;
    private static boolean isPowerOn = true;
    private static boolean isGSMNetworkAvailable = true;
    private static boolean isCardInserted = false;
    private static final String ATM_ADDRESS = "Ukraine Odessa Shevchenka prosp. 10/1";
    private static final int ATM_ID = 12345667;
    private Session session;
    private Security security;
    private Printer printer;

    public int getVaultAmount() {
        return vaultAmount;
    }

    public void setVaultAmount(int vaultAmount) {
        this.vaultAmount = vaultAmount;
    }

    public static boolean isPowerOn() {
        return isPowerOn;
    }

    public static void setIsPowerOn(boolean isPowerOn) {
        ATM.isPowerOn = isPowerOn;
    }

    public static boolean isGSMNetworkAvailable() {
        return isGSMNetworkAvailable;
    }

    public static void setIsGSMNetworkAvailable(boolean isGSMNetworkAvailable) {
        ATM.isGSMNetworkAvailable = isGSMNetworkAvailable;
    }

    public static boolean isCardInserted() {
        return isCardInserted;
    }

    public static void setIsCardInserted(boolean isCardInserted) {
        ATM.isCardInserted = isCardInserted;
    }

    public static boolean isSessionOpen() {
        return isSessionOpen;
    }

    public static void setIsSessionOpen(boolean isSessionOpen) {
        ATM.isSessionOpen = isSessionOpen;
    }

    private static boolean isSessionOpen = false;
    private int vaultAmount = 100000;
    private ATM() {
    };
    public static ATM getInstance() {
        if(ATM.instance ==null) ATM.instance = new ATM();
        return ATM.instance;
    }

    public void start(){
        try{
        if(ATM.isCardInserted()){
            throw new CardInsertedException("Card is inserted during ATM start. Card is stored in vault. Bank informed");
        }
        if(!ATM.isPowerOn()){
            throw new PowerOffException("Power is OFF. Switching to UPS. UPS Status is");
        }
        if(ATM.isSessionOpen()){
            throw new SessionOpenBeforeStartException("Previous session was not closed properly. Informing the Bank.");
        }
        if(!ATM.isGSMNetworkAvailable()){
            throw new NetworkUnavailableException("GSM Network is unavailable.");
        }
            ATM.security = Security.getInstance();
            ATM.printer = Printer.getInstance();

        } catch (CardInsertedException e){
            log.error(e.getMessage());
            storeInsertedCard();
            informBank(e.getMessage());
        } catch (PowerOffException e){
            log.error(e.getMessage());
            informTechService();
        } catch (SessionOpenBeforeStartException e){
            log.error("Session "+this.session.id+" has not closed properly. Informing bank.");
            informBank(e.getMessage());
        } catch (NetworkUnavailableException e){
            log.error(e.getMessage());
            if(this.session != null){
                this.session.initiateStop();
            }
        }
    }


    private class CardInsertedException extends Exception {
        public CardInsertedException(String message){
            super(message);
        }
    }

    private class PowerOffException extends Exception {
        public PowerOffException(String message){
            super(message);
        }
    }


    private class SessionOpenBeforeStartException extends Exception {
        public SessionOpenBeforeStartException(String message){
            super(message);
        }
    }

    private class NetworkUnavailableException extends Exception {
        public NetworkUnavailableException(String message){
            super(message);
        }
    }

    private static class Security {
        private static Security instance;
        private Security(){}

        public static Security getInstance() {
            if(instance == null) instance = new Security();
            return instance;
        }

        public boolean validate(Card card){
            if(ATM.isGSMNetworkAvailable()){
                ATM.establishGSMConnection()
            }
        }

    }

    private static class Printer {
        private static Printer instance;
        private Printer(){}

        public static Printer getInstance() {
            if(instance == null) instance = new Printer();
            return instance;
        }
    }
}
