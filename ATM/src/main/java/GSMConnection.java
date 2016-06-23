public class GSMConnection {
    String token;
    public GSMConnection(String token){
        this.token = token;
    }
    public GSMResponse sendRequest(GSMRequest request){
        GSMResponse response = request.getResponse();
        return response;
    }


}
