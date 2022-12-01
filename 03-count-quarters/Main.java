public class Main {
 public static void main(String[] args) {
  System.out.println(countQuarters(64));
}

public static int countQuarters(int a) {
  
     String cents = "" + a;
  cents = cents.substring(Math.abs(cents.length()-2));
  return Integer.parseInt(cents)/25;
}
 
}
