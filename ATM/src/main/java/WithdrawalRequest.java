public class WithdrawalRequest implements GSMRequest {


    private int withdrawal;
    private Card card;

    public WithdrawalRequest(int withdrawal, Card card) {
        this.withdrawal = withdrawal;
        this.card = card;
    }

    public int getWithdrawal() {
        return withdrawal;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public WithdrawalResponse getResponse() {
        return new WithdrawalResponse(this);
    }
}
