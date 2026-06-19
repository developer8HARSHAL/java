public class day2{
    public static void main(String[] args){
        int a=10;
        int b=10;

        System.out.println("primitive type: " + (a==b));

        String task1=new String ("FAILED");
        String task2= new String ("FAILED");

        if( (task1==task2)){
        System.out.println("true" );
        }
        else if(task1.equals(task2)){
        System.out.println("true");
        }
        else{
        System.out.println("false: ");
            
        }

    }
}