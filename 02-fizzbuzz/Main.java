class Main {
  public static void main(String[] args) {
  int a = 1;
   while ( a < 100 ) {
  
   if ( a%3 == 0) {
     if ( a%5 == 0) {
       System.out.println("FizzBuzz");
     } // end div by 5 
     else {
       System.out.println("Fizz");
      } // end else
   } // end div 3
     
   else if ( a%5 == 0) {
     System.out.println("Buzz");
   }
   else {
     System.out.println(a);
   }   
   a++;

     
    } // end of while loop
   } // end of main method
  } // end of Main class
