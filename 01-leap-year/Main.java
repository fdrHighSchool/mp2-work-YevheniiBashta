class Main {
  public static void main(String[] args) {

  System.out.println(isLeapYear(2022));
    System.out.println(isLeapYear(2024));
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
    
  }

  public static boolean isLeapYear(int y) {

  if ( y%4 == 0) {
     if ( y%100 == 0) {
       if ( y%400 == 0) {
         return true;
      }
       else {
        return false;
      }
  }
       else {
         return true;
       }
    }
    else {
      return false;
    }
}
    
  
}
