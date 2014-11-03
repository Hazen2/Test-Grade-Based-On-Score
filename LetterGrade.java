import javax.swing.JOptionPane;

/**
 * This program will determine the letter grade from the score that is entered.
 * It will use nested If / Else statements to determine the letter grade.
 */

public class LetterGrade
{
  public static void main(String[] args)
  {
    // Declare variables
    String inputString;
    int gradeInt;
  
    // Prompt user for grade
    inputString = JOptionPane.showInputDialog("Enter your test score.");
  
    // Convert to Integer
    gradeInt = Integer.parseInt(inputString);
  
    // Determine letter grade.
    if (gradeInt < 60)
    {
      JOptionPane.showMessageDialog(null, "You received a \"F\" grade.");
    }
    else
    {
      if (gradeInt < 70)
      {
        JOptionPane.showMessageDialog(null, "You received a \"D\" grade.");
      }  
      else
      {
        if (gradeInt < 80)
        {
          JOptionPane.showMessageDialog(null, "You received a \"C\" grade.");
        }
        else
        {
          if (gradeInt < 90)
          {
            JOptionPane.showMessageDialog(null, "You received a \"B\" grade.");
          }
          else
          {
            JOptionPane.showMessageDialog(null, "Your grade is an \"A\".");
          }
        }
      }  
      
      
    }  
    
    System.exit(0);
  }
}
