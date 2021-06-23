package com.deskmate;

import android.text.TextUtils;

import static com.deskmate.DeskmateRes.coulumbsCnst;
import static com.deskmate.DeskmateRes.df;
import static com.deskmate.DeskmateRes.expConverter;


public class ElectroStatics{


    public static String CoulumbsLaw(String q1, String q2, String r, String f){

        if (TextUtils.isEmpty(r)) {
            double Q1 = Double.parseDouble(q1);
            double Q2 = Double.parseDouble(q2);
            double F = Double.parseDouble(f);
            String res = Double.parseDouble(df.format(Math.sqrt(coulumbsCnst * Q1 * Q2 / F))) +" m";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else if (TextUtils.isEmpty(q2)){
            double Q1 = Double.parseDouble(q1);
            double F = Double.parseDouble(f);
            double R = Double.parseDouble(r);
            String res = Double.parseDouble(df.format(F * (R * R) / (coulumbsCnst * Q1))) +" C";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else if (TextUtils.isEmpty(q1)){
            double Q2 = Double.parseDouble(q2);
            double F = Double.parseDouble(f);
            double R = Double.parseDouble(r);
            String res = Double.parseDouble(df.format(F * (R * R) / (coulumbsCnst * Q2))) +" C";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else if (TextUtils.isEmpty(f)){
            double Q1 = Double.parseDouble(q1);
            double Q2 = Double.parseDouble(q2);
            double R = Double.parseDouble(r);
            String res = Double.parseDouble(df.format((coulumbsCnst * Q1 * Q2 / (R * R)))) +" N";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else {
            return "ERROR";
        }
    }
    public static String ElectricField(String q1, String r, String ef){

        if (TextUtils.isEmpty(q1)){
            double F = Double.parseDouble(ef);
            double R = Double.parseDouble(r);
            String res = Double.parseDouble(df.format(Math.sqrt(((R * R)/(F* coulumbsCnst) )))) +" C";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }

        }else if(TextUtils.isEmpty(r)){
            double Q1 = Double.parseDouble(q1);
            double F = Double.parseDouble(ef);
            String res = Double.parseDouble(df.format(Math.sqrt(coulumbsCnst * Q1 / F))) +" m";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        }
        else if (TextUtils.isEmpty(ef)){
            double R = Double.parseDouble(r);
            double Q1 = Double.parseDouble(q1);
            String res = Double.parseDouble(df.format((coulumbsCnst * Q1 / (R * R)))) +" F / q";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else {
            return "ERROR";
        }
    }

    public static String PotentialES (String charge, String dist, String PotES) {

        if (TextUtils.isEmpty(charge)) {
            double r = Double.parseDouble(dist);
            double v = Double.parseDouble(PotES);
            String res = Double.parseDouble(df.format(r * v / coulumbsCnst)) + " C";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return res;
            }
        } else if (TextUtils.isEmpty(dist)) {
            double v = Double.parseDouble(PotES);
            double q = Double.parseDouble(charge);
            String res = Double.parseDouble(df.format(coulumbsCnst * q / v)) + " m";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return res;
            }
        } else if (TextUtils.isEmpty(PotES)) {
            double q = Double.parseDouble(charge);
            double r = Double.parseDouble(dist);
            String res = Double.parseDouble(df.format(coulumbsCnst * q / r)) + " J";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return res;
            }
        } else {
            return "ERROR";
        }
    }
    public static String DipolePotential(String ang, String dip, String rad, String dipPot) {

        if (TextUtils.isEmpty(ang)) {
            double p = Double.parseDouble(dip);
            double r = Double.parseDouble(rad);
            double ep = Double.parseDouble(dipPot);
            String res = df.format(Math.acos(ep * r * r / (coulumbsCnst * p))) + " Rad";
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else if (TextUtils.isEmpty(dip)) {
            double r = Double.parseDouble(rad);
            double theta = (Double.parseDouble(ang));
            double ep = Double.parseDouble(dipPot);
            String res = df.format(Math.acos(ep * r * r / (coulumbsCnst * Math.cos(Math.toRadians(theta))))) + " C-m";
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else if (TextUtils.isEmpty(rad)) {
            double theta = (Double.parseDouble(ang));
            double ep = Double.parseDouble(dipPot);
            double p = Double.parseDouble(dip);
            String res = df.format(coulumbsCnst * p * Math.cos(theta) / ep) + " m";
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else if (TextUtils.isEmpty(dipPot)) {
            double p = Double.parseDouble(dip);
            double r = Double.parseDouble(rad);
            double theta = (Double.parseDouble(ang));
            String res = df.format(coulumbsCnst * p * Math.cos(theta) / r * r) + " D";
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else {
            return "ERROR";
        }

    }
    public static String ElectroStaticEnergy(String charge1, String charge2, String dist, String ese){

        if (TextUtils.isEmpty(charge1)){
            double q2 = Double.parseDouble(charge2);
            double r = Double.parseDouble(dist);
            double ee = Double.parseDouble(ese);
            String res = expConverter(-1 * ( ee*(r * r)/coulumbsCnst* q2) + " C");
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        }else if (TextUtils.isEmpty(charge2)) {
            double r = Double.parseDouble(dist);
            double ee = Double.parseDouble(ese);
            double q1 = Double.parseDouble(charge1);
            String res = (expConverter((-1) * r * r * ee /  coulumbsCnst *q1 + " C"));
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        }else if (TextUtils.isEmpty(dist)) {
            double ee = Double.parseDouble(ese);
            double q1 = Double.parseDouble(charge1);
            double q2 = Double.parseDouble(charge2);
            String res = (expConverter((-1) * Math.sqrt(coulumbsCnst * q1 * q2 / (ee)) + " m"));
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        }else if (TextUtils.isEmpty(ese)) {
            double q2 = Double.parseDouble(charge2);
            double r = Double.parseDouble(dist);
            double q1 = Double.parseDouble(charge1);
            String res = (expConverter((-1) * (coulumbsCnst * q1 * q2 / (r * r)) + " J"));
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else {
            return "ERROR";
        }
    }

}
