package Activity_1;

public class Removingwhitespacefromastring {


  public static void main(String[] args)
  
  {
  
    String str = " G O O D B Y E";
    
   
    str = str.replaceAll("\\s", ""); 


        System.out.println(str); 

  }

}
