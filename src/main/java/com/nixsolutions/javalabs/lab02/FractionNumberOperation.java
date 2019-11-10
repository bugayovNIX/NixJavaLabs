package com.nixsolutions.javalabs.lab02;

public interface FractionNumberOperation extends FractionNumber {
    FractionNumber add(FractionNumber var1, FractionNumber var2);

    FractionNumber sub(FractionNumber var1, FractionNumber var2);

    FractionNumber mul(FractionNumber var1, FractionNumber var2);

    FractionNumber div(FractionNumber var1, FractionNumber var2);
}
