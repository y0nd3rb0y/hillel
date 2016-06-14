public class GSMRequestFactory {
    public GSMRequest createGSMRequest(String type){
        GSMRequest request;
        switch(type) {
            case "cardValidation":
                request = new CardValidationRequest();
                break;
            case "accountValidation":
                request = new AccountValidationRequest();
                break;
            case "withdrawal":
                request = new WithdrawalRequest();
                break;
            case "mobilePayment":
                request = new MobilePaymentRequest();
                break;
            case "accountStatus":
                request = new AccountStatusRequest();
                break;
            default:
                return null;
        }
        return request;
    }
}
