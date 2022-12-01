# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * if grade's last digit is 7 || 8 || 9 -----> add "+" to the grade
    * if grade's last digit is 0 || 1 || 2 -----> add "-" to the grade


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * Else if grade is divisible by 100, print A+


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * everyhting below 65 = F; Else statement 
