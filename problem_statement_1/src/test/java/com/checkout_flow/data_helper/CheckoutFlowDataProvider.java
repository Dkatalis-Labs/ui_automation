package com.checkout_flow.data_helper;

import org.testng.annotations.DataProvider;

public class CheckoutFlowDataProvider {
    @DataProvider(name = "cardDetails")
    public static Object[][] cardDetails() {
        Object[][] cardDetail = {
                {"Y", "Positive - Verifying with passing valid parameters", "4811111111111114", "05/22", "123", null},
                {"Y", "Negative - Verifying passing with invalid Card Number", "4911111111111114", "", "", "Invalid card number"},

        };
        return cardDetail;
    }

    @DataProvider(name = "password")
    public static Object[][] password() {
        Object[][] pswd = {
                {"Y", "Positive - Verifying with passing valid parameters", "112233"},
                {"Y", "Negative - Verifying passing with invalid password", "12345"},

        };
        return pswd;
    }
}
