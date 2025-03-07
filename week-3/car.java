public class car{
    private String car_color;
    private String car_brand;
    private String car_fueltype;
    private int car_milage;

    public void start() {
        System.out.println("car started");
    }

    public void stop() {
        System.out.println("car stopped");
    }

    public void service() {
        System.out.println("car service");
    }

    public static void main(String args[]) {
        car car1 = new car();
        car1.car_color = "blue";
        car1.car_brand = "SUPRA";
        car1.car_fueltype = "disel";
        car1.car_milage = 5;
        car1.start();
        car1.stop();
        car1.service();
        System.out.println("car color: " + car1.car_color + " brand: " + car1.car_brand + " fueltype: " + car1.car_fueltype + " milage: " + car1.car_milage);

       
        car car2 = new car();
        car2.car_color = "yellow";
        car2.car_brand = "BUGATTI";
        car2.car_fueltype = "petrol";
        car2.car_milage = 6;
        car2.start();
        car2.stop();
        car2.service();
        System.out.println("car color: " + car2.car_color + " brand: " + car2.car_brand + " fueltype: " + car2.car_fueltype + " milage: " + car2.car_milage);


        car car3 = new car();
        car3.car_color = "green";
        car3.car_brand = "PORSCHE";
        car3.car_fueltype = "disel";
        car3.car_milage = 13;
        car3.start();
        car3.stop();
        car3.service();
        System.out.println("car color: " + car3.car_color + " brand: " + car3.car_brand + " fueltype: " + car3.car_fueltype + " milage: " + car3.car_milage);

    }
}

