abstract class Animal {

    abstract void sound();

    abstract void eat();
    void sleep() {
        System.out.println("Animals sleep");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    void eat() {
        System.out.println("Dog eats bones");
    }



    public static void main(String[] args) {


        Dog d = new Dog();

        d.sleep();
        d.sound();
        d.eat();
    }
}

