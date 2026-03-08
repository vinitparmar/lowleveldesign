package AmazonLockerLLD;

import java.util.Random;

public class OTPService {
    public String generateOtp(){
        Random rand = new Random();
        int otp = 100000+rand.nextInt(900000);
        return String.valueOf(otp);
    }

    public boolean validateOTP(String entered, String actual) {
        return entered.equals(actual);
    }
}
