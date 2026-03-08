package AmazonLockerLLD;

import java.util.ArrayList;
import java.util.List;


public class LockerSystem {
    List<LockerSlot> slots = new ArrayList<>();
     private OTPService otpService = new OTPService();
    private NotificationService notificationService = new NotificationService();

    public LockerSystem(List<LockerSlot> slots) {
        this.slots = slots;
    }

    public boolean deliverPackage(Package pkg){

        for(LockerSlot slot : slots) {
            if(slot.isAvailiable() && slot.getSize() == pkg.getSize()){
                slot.assignPackage(pkg);

                String otp = otpService.generateOtp();

                pkg.setOtp(otp);
                notificationService.sendOTP(pkg.getCustomerId(), otp);
                 System.out.println("Package stored in locker slot: " + slot);

                return true;
            }
        }
        System.out.println("No locker available");
        return false;
    }
    

      public boolean pickupPackage(String otp) {

        for (LockerSlot slot : slots) {
             if (!slot.isAvailiable()) {
                  Package pkg = slot.getPackage();

                if (otpService.validateOTP(otp, pkg.getOtp())) {

                    slot.releaseSlot();

                    System.out.println("Locker opened. Package picked up.");

                    return true;
                }
             }
        }

        System.out.println("Invalid OTP");
        return false;
    }
}
