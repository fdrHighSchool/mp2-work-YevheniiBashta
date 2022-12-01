public class Main {
 public static void main(String[] args) {
  System.out.println(countQuarters(64));
}


  
public static int countQuarters(int cents) {
  
    String str = "";
    str += cents;
  String value = str.substring(Math.abs(str.length()-2));
  if (str.lenght() == 1) {
    return 0;
  }
  return Integer.parseInt(value)/25;

  }
}
