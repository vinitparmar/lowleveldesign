package AmazonLockerLLD;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<LockerSlot> slots = new ArrayList<>();

        slots.add(new LockerSlot(1, LockerSize.SMALL));
        slots.add(new LockerSlot(2, LockerSize.MEDIUM));
        slots.add(new LockerSlot(3, LockerSize.LARGE));

        LockerSystem lockerSystem = new LockerSystem(slots);

        Package pkg = new Package("PKG123", LockerSize.SMALL, "CUST1");

        lockerSystem.deliverPackage(pkg);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter OTP:");

        String otp = sc.nextLine();

        lockerSystem.pickupPackage(otp);
    }
}