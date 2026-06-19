public class ReportNotFoundException extends RuntimeException{

    String name;

    public ReportNotFoundException(String name){
        super(name);
    }


    
    
}
