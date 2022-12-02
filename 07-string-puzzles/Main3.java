class Main {
  public static void main(String[] args) {
    System.out.println(makeSarcastic("yeah, this is very sarcastic"));
  }
  public static String makeSarcastic(String str) {
    String newString = "";
    for (int i = 0; i < str.length(); i++) {
      String character = str.substring(i, i+1);
      if ( i%2 == 1) {
        newString += character.toUpperCase();
      }
      else {
        newString += character.toLowerCase();
      }
    }
    return newString;
  }
}
