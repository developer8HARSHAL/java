import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;;

public class Filter {

    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        hash.put("jobid", "abc");
        hash.put("jobdec", "MBA");

        for (Map.Entry<String, String> entry : hash.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        System.out.println("key: ," + key + "value: ," + value); 
            
        }

        System.out.println("status: " + hash.get("jobid"));
        System.out.println("status: " + hash.get("jobi"));
        System.out.println("status: " + hash.size());
        System.out.println("status: " + hash.containsKey("jobid"));

    }

}
