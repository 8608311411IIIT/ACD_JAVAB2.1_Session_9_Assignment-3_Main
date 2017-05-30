//A simple program which have a generic hashmap with Empcode as key and Empname as value
import java.util.*;

public class Session9c {
     
      public static void main(String []args){
             
              HashMap<Integer,String> hashmap=new HashMap<Integer,String>();

              hashmap.put(121,"sanjeev");//adding the data to hashmap
              hashmap.put(312,"shivu");//adding the data to hashmap
              hashmap.put(213,"prashu");//adding the data to hashmap
              hashmap.put(213,"prasu");//adding the data to hashmap
              for(Map.Entry m:hashmap.entrySet())//prints the value preventing duplicate value from printing       
                 System.out.println(" "+ m.getValue());
           
 
        
      }
}
 




