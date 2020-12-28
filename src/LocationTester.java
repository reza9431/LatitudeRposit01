public class LocationTester {

    public static void main(String[] args) {

//        double d = -77.0;



        SimpleLocation  ucsd = new SimpleLocation(32.9, -117.2);
        SimpleLocation lima = new SimpleLocation(-12.0, -77.0);

//        lima.getLatitude() = -12.04;

        System.out.println(ucsd.distance(lima));
        System.out.println(lima.distance(ucsd));










    }



}
