abstract class X{
    void show(){
        System.out.println("Non Abstract Method");
    }
}
class Y extends X {
    void showAbc() {
        System.out.println("Child class");
    }
}
public class WithOutAbstract {
    public static void main(String[] args){
        Y obj = new Y();
        obj.show();
    }
}

