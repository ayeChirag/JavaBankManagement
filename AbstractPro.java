
abstract public class AbstractPro {

    abstract void start();

}

class car extends AbstractPro {
    void start() {
        System.out.println("Car Start... key");
    }
}

class bike extends AbstractPro {
    void start() {
        System.out.println("Bike Start......with key");
    }

    public static void main(String[] args) {
        car cr = new car();
        cr.start();

        bike bk = new bike();
        bk.start();
    }
}
