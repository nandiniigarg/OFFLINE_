package com.deskmate;

import java.text.DecimalFormat;
public class DeskmateRes {

    static double speedOfLight = 3*Math.pow(10,8); //(m/s)
    static double plancksCnst = 6.63*Math.pow(10,-34); //
    static double coulumbsCnst = 9*Math.pow(10,9); //  N m2/C2
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static final double dx = 1E-4;

    public void onPointerCaptureChanged(boolean hasCapture) {

    }


    public static void main(){

    }
    public static String superscript(String str) {
        str = str.replaceAll("0", "⁰");
        str = str.replaceAll("1", "¹");
        str = str.replaceAll("2", "²");
        str = str.replaceAll("3", "³");
        str = str.replaceAll("4", "⁴");
        str = str.replaceAll("5", "⁵");
        str = str.replaceAll("6", "⁶");
        str = str.replaceAll("7", "⁷");
        str = str.replaceAll("8", "⁸");
        str = str.replaceAll("9", "⁹");
        return str;
    }

    public static String expConverter(String res){

        String final_res = "";
        int indexOfE = res.indexOf("E");
        String power = superscript(res.substring(indexOfE+1, res.length()));
        double x = Double.parseDouble(res.substring(0, indexOfE));
        final_res += String.valueOf(df.format(x));
        final_res += " x 10";
        final_res += power;

        return final_res;

    }
//    public static double integral(double a, double b, Function fx){
//        double area = 0;
//        //double mod = 1;
//        if (a>b){
//            double tempA = a;
//            a = b;
//            b = tempA;
//            //mod = -1;
//        }
//        for (double i = a+dx; i<b ; i+=dx){
//            double distA = i - a;
//            area+=(dx/2)*(fx.f(a+distA) + fx.f(a+distA-dx)); //f takes double input
//        }
//        return area;
//    }
}
