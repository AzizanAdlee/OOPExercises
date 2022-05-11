import java.util.Vector;  
public class Anything {    
    public static void main(String arg[]) {  
               
          Vector<String> obj1 = new Vector<>();  
          obj1.add("Eva");
          obj1.add("19");
          obj1.add("Accounting");
          obj1.addElement("Poland");  
               
          
          System.out.println("--Details for Eva--");             
          for (String str : obj1) {           
             System.out.println("Element= " +str);  
          }  
           
          Vector<String> obj2 = new Vector<>();  
          obj2.add("Mahboubeh");
          obj2.add("24");
          obj2.add("Cryptography");
          obj2.addElement("Iran");  
                   
          System.out.println("\n--Details of Mahboubeh --");             
          for (String str : obj2) {           
             System.out.println("Element= " +str);  
          }  
          
          Vector<String> obj3 = new Vector<>();  
          obj3.add("Melvin");
          obj3.add("23");
          obj3.add("Vision");
          obj3.addElement("Tasmania");  
                   
          System.out.println("\n--Details of Melvin --");             
          for (String str : obj3) {           
             System.out.println("Element= " +str);  
          }  
          
          Vector<String> obj4 = new Vector<>();  
          obj4.add("Abdullah");
          obj4.add("21");
          obj4.add("Usuludin");
          obj4.addElement("Malaysia");  
                   
          System.out.println("\n--Details of Abdullah --");             
          for (String str : obj4) {           
             System.out.println("Element= " +str);  
          }
          
          Vector<String> obj5 = new Vector<>();  
          obj5.add("Bella");
          obj5.add("22");
          obj5.add("Business");
          obj5.addElement("Ireland");  
                   
          System.out.println("\n--Details of Bella --");             
          for (String str : obj5) {           
             System.out.println("Element= " +str);  
          }  
          
          System.out.println("\n--Contains Method --");
          
          Vector<String> obj6 = new Vector<>();  
          obj6.add("Bella");
          obj6.add("22");
          obj6.add("Business");
          obj6.addElement("Ireland");  
                             
          for (String str : obj6) {           
              System.out.println("Element= " +str);  
           }  
             if(obj6.contains("Bella"))  
             {  
                  System.out.println("Bella is present at the index " +obj6.indexOf("Bella"));  
             }  
             else  
             {  
                System.out.println("Bella is not present in the list");  
             }  
             
             
             System.out.println("\n--Empty Method --");
             System.out.println("Vector:  " + obj6);  
             
             System.out.println("Is the Vector empty? = " +obj6.isEmpty());  
              
             obj6.clear();   
             
             System.out.println("Vector after clear(): " +obj6);   
             
             System.out.println("Is the Vector empty? = " +obj6.isEmpty()); 
             
             
             System.out.println("\n--Set Method --");
             System.out.println("Vector:  " + obj5);  
             System.out.println("Current capacity of Vector is: "+obj5.capacity());   
             
             System.out.println("\n--Remove Method --");
             System.out.println("Vector:  " + obj5);  
             System.out.println("Remove first occourence of element 200: "+obj5.remove((String)"Ireland"));  
             System.out.println("Values in vector: " +obj5);  
       }              
           
      }  
  