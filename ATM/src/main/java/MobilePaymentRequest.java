public class MobilePaymentRequest implements GSMRequest {

    private int payment;
    private Card card;

    public MobilePaymentRequest(int payment, Card card){
        this.payment = payment;
        this.card = card;
    }

    public int getPayment() {
        return payment;
    }

    @Override
    public MobilePaymentResponse getResponse() {
        return new MobilePaymentResponse(this);
    }
}
