class vehicle {

    String band;

    // constructor
    public vehicle(String band){
        this.band=band;
    }

    // method start()
    public static void start() {
        System.out.println("brand is starting");
    }

}

class data extends vehicle {

    int door;

    // constructor
    public data(String brand, int door) {
        super(brand);
        this.door = door;
    }

    // method info
    public static void info(String brand, int door) {
        System.out.println("brand" + brand);
        System.out.println("door" + door);
    }

}

public class Day5 {
    public static void main(String[] args) {
        data d=new data("brand",1);
        d.start();
        d.info("brand",1);
    }

}