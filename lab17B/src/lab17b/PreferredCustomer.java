/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17b;

/**
 *
 * @author hp
 */
public class PreferredCustomer extends Customer {
    private double purchasesAmount;
    private int discountLevel;

    public PreferredCustomer(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        purchasesAmount = 0;
        discountLevel = 0;
    }

    public double getPurchasesAmount() {
        return purchasesAmount;
    }

    public void setPurchasesAmount(double purchasesAmount) {
        this.purchasesAmount = purchasesAmount;
        updateDiscountLevel();
    }

    public int getDiscountLevel() {
        return discountLevel;
    }

    private void updateDiscountLevel() {
        if (purchasesAmount >= 2000)
            discountLevel = 10;
        else if (purchasesAmount >= 1500)
            discountLevel = 7;
        else if (purchasesAmount >= 1000)
            discountLevel = 6;
        else if (purchasesAmount >= 500)
            discountLevel = 5;
        else
            discountLevel = 0;
    }
    
}
