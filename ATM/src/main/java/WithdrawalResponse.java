public class WithdrawalResponse implements GSMResponse {
    private int withdrawalAmount;
    private Card card;

    public WithdrawalResponse(WithdrawalRequest request) {
        this.withdrawalAmount = request.getWithdrawal();
        this.card = request.getCard();
    }

    @Override
    public boolean getResult() {
        return false;
    }
}
