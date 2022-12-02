class Main {
  public static void main(String[] args) {
    System.out.println("Shapes!");

    // TEST CASES:
    square(1);
    System.out.println();
    square(4);
    System.out.println(); 
    rectangle(2, 4);
    System.out.println();
    rectangle(4, 2);
    System.out.println();
    
    rightTriangle(3);
    System.out.println();
    rightTriangle(6);
    System.out.println();

    //triangle(3);
    //System.out.println();
    // triangle(6);
    // System.out.println();
  } // end main method

  public static void square(int s) {
    for (int row = 0; row < s; row++) {
      for (int col = 0; col < s; col++) {
        System.out.print("* ");
      } // end col for loop
      System.out.println();
    } // end row for loop
  } // end square method


  public static void rectangle(int l, int w) {

  for (int row = 0; row < l; row++) {
    for ( int col = 0; col < w; col++) {
      System.out.print("* ");
    }
    System.out.println();
  }
    
  } // end rectangle method

  public static void rightTriangle(int s) {
    int row = s;
  for (int i = 1; i <= row; i++) {
    for (int star = 1; star <= i; star++) {
      System.out.print("* ");
    }
    System.out.println();
  }
    
  } // end rightTriangle method

  public static void triangle(int s) {

  
 
    
    /*
    example: triangle(3) 
              *
             * * 
            * * * 
    */


    
  } // end triangle method
  
} // end class
