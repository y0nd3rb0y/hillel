import java.util.Date;

public class Card {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;
    private Date validUntil;
    private User owner;

    public Card(String number) {
        this.number = number;
    }
}
