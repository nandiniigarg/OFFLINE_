package com.deskmate;

import static com.deskmate.Coulumbs_ES.df;
import static com.deskmate.DeskmateRes.coulumbsCnst;
import static com.deskmate.DeskmateRes.expConverter;

public class ElectroStatics {
    public static String CoulumbsLaw(String q1, String q2, String r, String f){
        double Q1 = Double.parseDouble(q1);
        double Q2 = Double.parseDouble(q2);
        double F = Double.parseDouble(f);
        double R = Double.parseDouble(r);
        if (r.equals("*")) {
            String res = Double.parseDouble(df.format(Math.sqrt(coulumbsCnst * Q1 * Q2 / F))) +" m";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else if (q1.equals("*")){
            String res = Double.parseDouble(df.format(F * (R * R) / (coulumbsCnst * Q1))) +" C";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
               return (res);
            }
        } else if (q2.equals("*")){
        String res = Double.parseDouble(df.format(F * (R * R) / (coulumbsCnst * Q2))) +" C";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else if (f.equals("*")){
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
        double Q1 = Double.parseDouble(q1);
        double F = Double.parseDouble(ef);
        double R = Double.parseDouble(r);

        if (q1.equals("*")){
            String res = Double.parseDouble(df.format(Math.sqrt((coulumbsCnst * Q1 / (R * R))))) +" C";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }

        }else if(r.equals("*")){
            String res = Double.parseDouble(df.format(Math.sqrt(coulumbsCnst * Q1 / F))) +" m";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        }
        else if (ef.equals("*")){
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
        double r = Double.parseDouble(dist);
        double v = Double.parseDouble(PotES);
        double q = Double.parseDouble(charge);
        if (charge.equals("*")) {
            String res = Double.parseDouble(df.format(r * v / coulumbsCnst)) + " C";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return res;
            }
        } else if (dist.equals("*")) {
            String res = Double.parseDouble(df.format(coulumbsCnst * q / v)) + " m";
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return res;
            }
        } else if (PotES.equals("*")) {
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
        double p = Double.parseDouble(dip);
        double r = Double.parseDouble(rad);
        double theta = (Double.parseDouble(ang));
        double ep = Double.parseDouble(dipPot);
        if (ang.equals("*")) {

            String res = df.format(Math.acos(ep * r * r / (coulumbsCnst * p))) + " Rad";
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else if (dip.equals("*")) {
            String res = df.format(Math.acos(ep * r * r / (coulumbsCnst * Math.cos(Math.toRadians(theta))))) + " C-m";
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else if (rad.equals("*")) {
            String res = df.format(coulumbsCnst * p * Math.cos(theta) / ep) + " m";
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        } else if (dipPot.equals("*")) {
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
        double q2 = Double.parseDouble(charge2);
        double r = Double.parseDouble(dist);
        double ee = Double.parseDouble(ese);
        double q1 = Double.parseDouble(charge1);
        if (charge1.equals("*")){
            String res = expConverter(-1 * ( ee*(r * r)/coulumbsCnst* q2) + " C");
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        }else if (charge2.equals("*")) {
            String res = (expConverter((-1) * r * r * ee /  coulumbsCnst *q1 + " C"));
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        }else if (dist.equals("*")) {
            String res = (expConverter((-1) * Math.sqrt(coulumbsCnst * q1 * q2 / (ee)) + " m"));
            if (res.contains("E")) {
                return expConverter(res);
            } else {
                return res;
            }
        }else if (ese.equals("*")) {
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
