package RateLimiter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        RateLimiter limiter =  new UserRateLimiter(5,2);

        String user = "user1";

        for(int i = 0 ; i < 10 ; i++){
            if(limiter.allowRequest(user)){
                System.out.println("Request Allowed");
            }else{
                System.out.println("Rate Limit Exceeded");
            }
            Thread.sleep(300);
        }
    }
}
