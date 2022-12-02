class Main {
  public static void main(String[] args) {
    System.out.println(conCat("abc", "cat"));
  }
  public static String conCat(String str1, String str2) {
    
    if (( str2.substring(0,1).equals((str1.substring(str1.length()-1))))) {
      return str1+str2.substring(1);
      
    }
    else {
      return str1+str2;
      
    }
  }
}
