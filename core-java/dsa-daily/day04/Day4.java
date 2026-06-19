public class Day4 {


    private String status;

    public Day4(String status){
        this.status=status;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }


    public static void main(String[] args){
        Day4 job=new Day4("QUEUED");
        System.out.println(job.getStatus());

        job.setStatus("DONE");
        System.out.println(job.status);
    }



  
}