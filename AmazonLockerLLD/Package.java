package AmazonLockerLLD;

public class Package {
    private String packageId;
    private LockerSize size;
    private String customerId;
    private String otp; 

     public Package(String packageId, LockerSize size, String customerId) {
        this.packageId = packageId;
        this.size = size;
        this.customerId = customerId;
    }

    public LockerSize getSize(){
        return this.size;
    }

    public String getCustomerId(){
        return customerId;
    }

    public void setOtp(String otp){
        this.otp = otp;
    }

    public String getOtp(){
        return this.otp;
    }
}
