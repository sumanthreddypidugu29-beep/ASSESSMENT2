public class Abstract {


        void start() {
            System.out.println("Vehicle is starting...");
        }

        void stop() {
            System.out.println("Vehicle is stopping...");
        }
    }


    class Car extends Vehicle {

        void carInfo() {
            System.out.println("This is a Car.");
        }
    }

    public class AbstractDemo2 {
        public static void main(String[] args) {


            Car c = new Car();
            c.start();
            c.carInfo();
            c.stop();
        }
    }
