package com.deskmate;

import static com.deskmate.DeskmateRes.df;
import static com.deskmate.DeskmateRes.expConverter;
import static com.deskmate.DeskmateRes.nuByFourPi;
import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.toRadians;

public class Magnetics {

    public static String magneticFieldStCurrent(String d, String i, String theta1, String theta2, String field) {
        double D = Double.parseDouble(d);
        double I = Double.parseDouble(i);
        double Th1 = Double.parseDouble(theta1);
        double Th2 = Double.parseDouble(theta2);
        double F = Double.parseDouble(field);

        if (field.equals("*")) {
            String res = Double.parseDouble(df.format(nuByFourPi * I * (cos(toRadians(Th1)) - cos(toRadians(Th2))) / D)) + " T";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }
        } else if (d.equals("*")) {
            String res = Double.parseDouble(df.format(nuByFourPi * I * (cos(toRadians(Th1)) - cos(toRadians(Th2))) / F)) + " m";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }
        } else if (i.equals("*")) {
            String res = Double.parseDouble(df.format(F * D / (nuByFourPi * (cos(toRadians(Th1)) - cos(toRadians(Th2)))))) + " m";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }
        } else if (theta1.equals("*")) {
            String res = Double.parseDouble(df.format(acos(F * D / (nuByFourPi * I)+ cos(Th2)) )) + " rad";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }

        } else if (theta2.equals("*")) {
            String res = Double.parseDouble(df.format(acos(cos(Th1) - F * D / (nuByFourPi * I)))) + " rad";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }

        } else {
            return "ERROR";
        }
    }
}
