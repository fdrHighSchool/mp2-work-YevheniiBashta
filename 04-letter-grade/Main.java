class Main {
 public static void main(String[] args) {
   System.out.println(gradeOf(81));
 }
  
 public static String gradeOf(int score) {
  String scoreS = score + "";
  String grade = "";
  if ( score >= 90 && score <= 99 ) {
    grade += "A";
  }
    else if ( score >= 80 ) {
      grade += "B";
    }
    else if ( score >= 70 ) {
      grade += "C";
    }
    else if ( score >= 60 ) {
      grade += "D";
  }
    else {
      grade += "F";
      return grade;
    }
     
  if (Integer.parseInt(scoreS.substring(1)) == 7 || Integer.parseInt(scoreS.substring(1)) == 8 || Integer.parseInt(scoreS.substring(1)) == 9) {
      grade += "+";
    }
     else if (Integer.parseInt(scoreS.substring(1)) == 0 || Integer.parseInt(scoreS.substring(1)) == 1 || Integer.parseInt(scoreS.substring(1)) == 2) {
       grade += "-";
     }
     else {
       return grade;
     }
     return grade;
      
  }
}
