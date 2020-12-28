//public class Question2 {
//    public static void main(String[] args) {
//
//        System.out.println("Please Enter a Number:");
//
//        Scanner num = new Scanner(System.in);
//
//        int num1 = num.nextInt();
//
////        System.out.println(num1);
//
//        for (int i=0 ; i<num1; i++){
//
//            System.out.println(i);
//
//        }


    public class SimpleLocation {
        private double latitude;
        private double longitude;


        public SimpleLocation(){
            this.latitude = 32.9;
            this.longitude = -117.2;
        }

        public SimpleLocation(double latIn, double lonIn) {

            this.latitude = latIn;
            this.longitude = lonIn;
        }

        public double distance  (SimpleLocation other) {


           return getDist (this.latitude, this.longitude);



        }



//        public double distance (double otherlat, double otherlon) {
//
//        }


        private double getDist(double lat, double lon) {

            return(lat * lon);
        }


        public double getLatitude() {
            return this.latitude;
        }

        public void setLatitude(double lat) {
            if (lat < -180 || lat > 180) {
                System.out.println("Hey, you tried to set your latitude variable to an illegal value!");
            } else {
                this.latitude = lat;
            }
        }

        public double getLongitude() {
            return this.longitude;
        }

        public void setLongitude(double lon) {
            this.longitude = lon;
        }
    }




//    }