#!/usr/bin/env jjs -cp out/production/NashornSandbox

var PercentageCalculator = Java.type('eu.zeigermann.nashorn.avatar.PercentageCalculator');

var amount = $ARG[0];
var percentage = $ARG[1];

if (amount && percentage) {
    var result = PercentageCalculator.calculate(amount, percentage);
    print(result);
}

