import java.util.HashMap;
import java.util.Map;
public class day9 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("jobid", "abc123");

        String data = map.get("jobid");

        try {
            if (data == null) {
                throw new ReportNotFoundException("Status not found");
            }
            else{
            System.out.println("found");
            }

        } catch (ReportNotFoundException e) {
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("Execution complete");
        }
      

    }
}