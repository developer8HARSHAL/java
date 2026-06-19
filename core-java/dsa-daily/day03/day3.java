public class day3 {

    public static String reportMessage(String reporttype){

        if(reporttype.equals("SALES")){
           return ("reporttype is SALES: ");
        }
        else if(reporttype.equals("CUSTOMER_SUPPORT")){
            return ("reporttype is CUSTOMER_SUPPORT: ");
            
        }
        else{
           return "Reporttype is not supported: ";
        }

    }


    public static void dataPrint(int data){
        for(int i=0;i<=data;i++){
            System.out.println("data:" + i);
        }
    }

    public static void main(String[] args){
        System.out.println(reportMessage("SALES"));
        System.out.println(reportMessage("CUSTOM"));
        System.out.println(reportMessage("sales"));

        dataPrint(5);
        dataPrint(10);


    }
    
}
