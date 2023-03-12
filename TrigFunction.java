package com.example.laba6;
public class TrigFunction {
    public static double sin(double angle, boolean isRadian) {
        if (!isRadian) {
            angle = Math.toRadians(angle);
        }
        return Math.sin(angle);
    }

    public static double cos(double angle, boolean isRadian) {
        if (!isRadian) {
            angle = Math.toRadians(angle);
        }
        return Math.cos(angle);
    }

    public static double tan(double angle, boolean isRadian) {
        if (!isRadian) {
            angle = Math.toRadians(angle);
        }
        return Math.tan(angle);
    }
}
