#!/usr/bin/env jjs

// this is how we get access to class BigDecimal
var BigDecimal = Java.type('java.math.BigDecimal');

// parameters and local variables do not have a type, otherwise similar to Java
function calculatePercentage(amount, percentage) {
    var result = new BigDecimal(amount).multiply(new BigDecimal(percentage)).divide(new BigDecimal('100'),
        2, BigDecimal.ROUND_HALF_EVEN);
    return result.toPlainString();
}

var amount = $ARG[0];
var percentage = $ARG[1];

if (amount && percentage) {
    var result = calculatePercentage(amount, percentage);
    print(result);
}

