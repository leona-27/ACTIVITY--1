package Activity_1;

public class Findingthefirstnonrepeatedcharacters {

 public static void main(String[] args) {


  String inputStr = "reneleona";
  for(char i :inputStr.toCharArray()){
  if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)){
  System.out.println("First non-repeating character is; "+i);
     break;
     }
     }
  }

  }

