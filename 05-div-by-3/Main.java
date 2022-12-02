class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(3012));
  }
  
  public static boolean divBy3(int num) {
    int sum = 0;
    String numS = num + "";
    
     for ( int i = 0; i <= numS.length() - 1; i++ ) {
       sum += Integer.parseInt(numS.substring(i,i+1));  
     }
    
    return sum % 3 == 0;
  }
  
}
