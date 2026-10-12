package basics.accesscontroller;

import java.util.Scanner;

public class AccessController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Access Verification System ===");

        // 1. Kullanici bilgilerini al
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have an ID card? (1: Yes, 0: No): ");
        int idChoice = scanner.nextInt();
        boolean hasIdCard = (idChoice == 1);

        System.out.print("Are you a VIP member? (1: Yes, 0: No): ");
        int vipChoice = scanner.nextInt();
        boolean isVip = (vipChoice == 1);

        System.out.print("Is your account suspended? (1: Yes, 0: No): ");
        int suspendedChoice = scanner.nextInt();
        boolean isSuspended = (suspendedChoice == 1);

        // 2. Dogrulama yontemlerini al
        System.out.print("Did you use SMS authentication? (1: Yes, 0: No): ");
        int smsChoice = scanner.nextInt();
        boolean usedSmsAuth = (smsChoice == 1);

        System.out.print("Did you use App authentication? (1: Yes, 0: No): ");
        int appChoice = scanner.nextInt();
        boolean usedAppAuth = (appChoice == 1);

        // 3. Giris kosullarini kontrol et
        boolean isEligible = (age>=18) && (!isSuspended);

        boolean canEnter = isEligible && (hasIdCard || isVip);

        // 4. XOR ile dogrulama kontrolu
        boolean valid2FA = usedSmsAuth ^ usedAppAuth;

        // 5. Sonucu ekrana yazdir
        System.out.println("\n=== Verification Results ===");
        System.out.println("Eligible: " + isEligible);
        System.out.println("Basic Access: " + canEnter);
        System.out.println("Valid Authentication: " + valid2FA);

        if(canEnter && valid2FA) {
            System.out.println("Status: Access Authorized.");
        } else {
            System.out.println("Status: Access Denied.");
        }
       scanner.close();

    }
}
