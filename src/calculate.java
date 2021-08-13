
import java.io.File;
import java.io.FileWriter;


public class calculate {
   static long money;
    calculate(long money){
    calculate.money+=money;
     try{
            File f4=new File("total.txt");
            FileWriter fw4=new FileWriter(f4);
          
            fw4.write(String.valueOf(calculate.money));
            fw4.write("\r\n");
           
            fw4.close();
                  }
        catch(Exception e){
            System.out.println("Not found");
        }
    }
    long payment(long p){
        // hello github
    }
    
}

       
//class refresh {
//    void ab(){
//       
//    }
//}

