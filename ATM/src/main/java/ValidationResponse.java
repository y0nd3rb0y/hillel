public class ValidationResponse implements GSMResponse {

    private boolean result;
    private Card card;

    public ValidationResponse(ValidationRequest request) {
        this.result = true;
        this.card = request.getCard();
    }

    @Override
    public boolean getResult() {
        return result;
    }

}
