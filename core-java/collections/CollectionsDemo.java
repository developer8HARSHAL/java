import java.util.ArrayList;

class CollectionsDemo{
    public static void main(String[] args){
        ArrayList<String> status=new ArrayList<>();
        status.add("QUEUED");
        status.add("PROCESSING");
        status.add("DONE");

        for(String st:status){
        System.out.println("status: " + st);
        }
        System.out.println("status: " + status.size());
        System.out.println("status: " + status.get(1));



    }
}