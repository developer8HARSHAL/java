
class dataType{
    private String name;
    private int age;

    public dataType(){
        this.name="name";
        this.age=0;
    }

    public void displayInfo(){
        System.out.println("this is a displayinfo");
    }

        public static void Main(){
            dataType d=new dataType();
            d.displayInfo();

    }



}