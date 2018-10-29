import java.util.Scanner;
public class Main {

    public static Scanner sc;
    public static double d,r, lat1, lon1,lat2,lon2,ao1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,paris;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        r = 6371;
        System.out.print("What is the latitude of the first point?: ");
        double clat = sc.nextDouble();
        System.out.print("What is the Longitutde of the first point?: ");
        double clon = sc.nextDouble();
        System.out.print("What is the latitude of the second point?: ");
        double clat2 = sc.nextDouble();
        System.out.print("What is the longitude of the second point?: ");
        double clon2 = sc.nextDouble();
        paris = e(clat,clon,clat2,clon2);
        System.out.println("The Distance from SF to Paris is "+paris+".");
        ao1 = e(25, 15, 23, 20);
        a2 = e(23, 20, 21, 24);
        a3 = e(21, 24, 20, 27);
        a4 = e(20, 27, 19, 35);
        a5 = e(19, 35, 21, 46);
        a6 = e(21, 46, 23, 56);
        a7 = e(23, 56, 25, 65);
        a8 = e(25, 65, 28, 70);
        a9 = e(28, 70, 32, 73);
        a10 = e(32, 73, 34, 74);
        a11 = e(34, 74, 36, 74);
        a12 = e(36, 74, 39, 74);
        double totd = ao1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12;
        System.out.println("The distance of the cyclone on day 1 was " + ao1 + ".");
        System.out.println("The distance of the cyclone on day 2 was " + a2 + ".");
        System.out.println("The distance of the cyclone on day 3 was " + a3 + ".");
        System.out.println("The distance of the cyclone on day 4 was " + a4 + ".");
        System.out.println("The distance of the cyclone on day 5 was " + a5 + ".");
        System.out.println("The distance of the cyclone on day 6 was " + a6 + ".");
        System.out.println("The distance of the cyclone on day 7 was " + a7 + ".");
        System.out.println("The distance of the cyclone on day 8 was " + a8 + ".");
        System.out.println("The distance of the cyclone on day 9 was " + a9 + ".");
        System.out.println("The distance of the cyclone on day 10 was " + a10 + ".");
        System.out.println("The distance of the cyclone on day 11 was " + a11 + ".");
        System.out.println("The distance of the cyclone on day 12 was " + a12 + ".");
        System.out.print("The total Distance of the cyclone is ");
        System.out.printf("%.2f", totd);
        System.out.print(".");




    }
        public static double e(double lat1,double lon1, double lat2, double lon2) {
            double elat1 = Math.toRadians(lat1);
            double elon1 = Math.toRadians(lon1);
            double elat2 = Math.toRadians(lat2);
            double elon2 = Math.toRadians(lon2);
            double t1= Math.sin((elat1-elat2)/2);
            double ae1 = t1*t1;
            double e2= Math.sin((elon1-elon2)/2);
            double ae2= e2*e2;
            double ae3= Math.cos(elat1)*Math.cos(elat2);
            double ae4= ae1+ae3*ae2;
            double b2= (Math.atan2((Math.sqrt(ae4)),(Math.sqrt(1-ae4))));
            d= r*(2*b2);
            return(d);
        }

}


