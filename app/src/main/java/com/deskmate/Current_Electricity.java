package com.deskmate;

import static com.deskmate.DeskmateRes.coulumbsCnst;
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
}
