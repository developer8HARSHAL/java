interface vehical{
    String generate();

}
class salesReport implements vehical{
    public String generate(){
        return("generating salereport......");

    }
}

class analyseReport implements vehical{
    public String generate(){
        return("generating analysisreport......");
    }
}



public class Day6{
    public static void main(String[] args){
       vehical r1=new salesReport();
       vehical r2=new analyseReport();

       System.out.println(r1.generate());
       System.out.println(r2.generate());

    }

}