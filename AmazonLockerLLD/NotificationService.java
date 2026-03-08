package AmazonLockerLLD;

public class NotificationService {
    public void sendOTP(String customerId, String otp) {
        System.out.println("OTP sent to customer " + customerId + " : " + otp);
    }
}
