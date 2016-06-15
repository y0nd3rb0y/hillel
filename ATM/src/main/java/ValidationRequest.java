public class ValidationRequest implements GSMRequest {

    private Card card;

    public ValidationRequest(Card card){
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public ValidationResponse getResponse() {
        return new ValidationResponse(this);
    }
}
