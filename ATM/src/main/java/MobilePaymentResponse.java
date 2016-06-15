public class MobilePaymentResponse implements GSMResponse {
    private int payment;
    private boolean result;
    public MobilePaymentResponse(MobilePaymentRequest request) {
        this.payment = request.getPayment();
        result = true;
    }

    @Override
    public boolean getResult() {
        return result;
    }


}
