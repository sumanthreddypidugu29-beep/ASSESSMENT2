public class Vehicle {

        public String publicVar = "This is PUBLIC";
        private String privateVar = "This is PRIVATE";
        protected String protectedVar = "This is PROTECTED";
        String defaultVar = "This is DEFAULT";

        public void publicMethod() {
            System.out.println(publicVar);
            System.out.println(privateVar);
            System.out.println(protectedVar);
            System.out.println(defaultVar);
        }
    }

    class Car extends Vehicle {

        void display() {
            System.out.println(publicVar);
            // System.out.println(privateVar);
            System.out.println(protectedVar);
            System.out.println(defaultVar);
        }
        public static void main(String[] args) {
            Vehicle v = new Vehicle();
            Car c = new Car();

            v.publicMethod();
            System.out.println(v.publicVar);
            c.display();
        }
    }


