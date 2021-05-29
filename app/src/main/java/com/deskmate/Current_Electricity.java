package com.deskmate;

import static com.deskmate.DeskmateRes.df;
import static com.deskmate.DeskmateRes.expConverter;

public class Current_Electricity {

    public static String OhmsLaw(String v, String i, String r){
        double V = Double.parseDouble(v);
        double I = Double.parseDouble(i);
        double R = Double.parseDouble(r);

        if (v.equals("*")){
            String res = Double.parseDouble(df.format(I*R)) + "V";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }

        }else if(i.equals("*")){
            String res = Double.parseDouble(df.format(V/R)) +" A ";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        }
        else if (r.equals("*")){
            String res = Double.parseDouble(df.format(V/I)) +" Ohm ";
            if (res.contains("E")){
                return (expConverter(res));
            } else{
                return (res);
            }
        } else {
            return "ERROR";
        }
    }
    
    
    public static String Wbridge(String p, String q, String r, String s)
    {

        double R1 = Double.parseDouble(p);
        double R2 = Double.parseDouble(q);
        double R3 = Double.parseDouble(r);
        double R4 = Double.parseDouble(s);

        if (p.equals("*")) {
            String res = String.valueOf(Double.parseDouble(df.format(((R2 * R3) / R4) +" Ohm ")));
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }

        } else if (q.equals("*")) {
            String res = String.valueOf(Double.parseDouble(df.format(((R4 * R1)/ R3) +" Ohm ")));
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }
        } else if (r.equals("*")) {
            String res = String.valueOf(Double.parseDouble(df.format(((R1*R4) / R2) +" Ohm ")));
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }
        } else if (s.equals("*")) {
            String res = String.valueOf(Double.parseDouble(df.format(((R2*R3) / R1 ) +" Ohm ")));
            if (res.contains("E")) {
                return (expConverter(res));
            } else {
                return (res);
            }
        }
        else {
        return "ERROR";
        }
    }
}




