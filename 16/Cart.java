/*An e-commerce store calculates the total price of items in a shopping cart.  
Create a method calculateTotalPrice(int[] prices, boolean isPremiumMember). Use a loop to iterate through the prices of items in the cart. If the user is a premium member, apply a 5% discount. If the total price exceeds ₹5000, apply an extra 10% discount.
*/

public class Cart {
    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price; 
        }
        if (isPremiumMember) {
            totalPrice *= 0.95;
        }
        if (totalPrice > 5000) {
            totalPrice *= 0.90; 
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        int[] prices = {1200, 2500, 1800}; 
        boolean isPremiumMember = true;
        double finalPrice = calculateTotalPrice(prices, isPremiumMember);
        System.out.println("The total price after discounts is: Rs " + finalPrice);
    }
}