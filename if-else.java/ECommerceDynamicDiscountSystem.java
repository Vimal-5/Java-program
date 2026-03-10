import java.util.Scanner;

public class ECommerceDynamicDiscountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loyaltyTier = sc.next();
        double cartValue = sc.nextDouble();
        String productCategory = sc.next();
        String membershipStatus = sc.next();

        double baseDiscount = 0.0;
        double additionalDiscount = 0.0;

        // Step 1: Base discount
        if (loyaltyTier.equalsIgnoreCase("bronze")) {
            baseDiscount = 5;
        } else if (loyaltyTier.equalsIgnoreCase("silver")) {
            baseDiscount = 8;
        } else if (loyaltyTier.equalsIgnoreCase("gold")) {
            baseDiscount = 12;
        } else if (loyaltyTier.equalsIgnoreCase("platinum")) {
            baseDiscount = 15;
        }

        // Step 2: Cart value discount
        if (cartValue >= 500 && cartValue <= 999) {
            additionalDiscount += 3;
        } else if (cartValue >= 1000 && cartValue <= 1999) {
            additionalDiscount += 5;
        } else if (cartValue >= 2000) {
            additionalDiscount += 7;
        }

        // Step 3: Category-specific bonuses
        if (productCategory.equalsIgnoreCase("electronics")) {
            if (membershipStatus.equalsIgnoreCase("prime")) {
                additionalDiscount += 5;
            }
        } else if (productCategory.equalsIgnoreCase("fashion")) {
            additionalDiscount += 3;
        } else if (productCategory.equalsIgnoreCase("books")) {
            if (membershipStatus.equalsIgnoreCase("prime")) {
                additionalDiscount += 5;
            }
        } else if (productCategory.equalsIgnoreCase("groceries")) {
            if (cartValue > 300) {
                additionalDiscount += 2;
            }
        }

        // Step 4: Final calculation
        double totalDiscount = baseDiscount + additionalDiscount;
        double finalPrice = cartValue * (1 - totalDiscount / 100);
        double savings = cartValue - finalPrice;

        // Output format
        System.out.println("Loyalty Tier: " + capitalize(loyaltyTier));
        System.out.println("Cart Value: $" + cartValue);
        System.out.println("Product Category: " + capitalize(productCategory));
        System.out.println("Membership: " + capitalize(membershipStatus));
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Additional Discount: " + additionalDiscount + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);

        sc.close();
    }

    // Helper method to capitalize first letter
    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}