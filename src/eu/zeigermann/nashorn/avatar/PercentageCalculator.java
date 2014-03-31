package eu.zeigermann.nashorn.avatar;

import java.math.BigDecimal;

public class PercentageCalculator {
    public static String calculate(String amount, String percentage) {
        BigDecimal result = new BigDecimal(amount).multiply(new BigDecimal(percentage)).divide(new BigDecimal("100"),
                2, BigDecimal.ROUND_HALF_EVEN);
        return result.toPlainString();
    }
}