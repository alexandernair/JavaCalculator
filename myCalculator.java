import java.lang.Math;
import javax.swing.JOptionPane;
/*
Alexander Nair
my joption pane example
csce 111
uin 828002051
date-1-30-2020
*/

class myCalculator {
  public static void main(String[] args) {
    String output;
    output = "Welcome to my Calculator!";
    JOptionPane.showMessageDialog(null, output);

    String answer1 = JOptionPane.showInputDialog("Enter the first number.");
    String answer2 = JOptionPane.showInputDialog("Enter the second number.");
    output = String.format("Please input operation you would like: %n + - * / ^");
    String operation = JOptionPane.showInputDialog(output);
    double answer1D = Double.parseDouble(answer1);
    double answer2D = Double.parseDouble(answer2);
    double result;
    



    switch (operation){
      case "+":
        result = answer1D + answer2D;
        output = String.format("The sum is %f", result);
        JOptionPane.showMessageDialog(null, output);
        break;

      case "-":
        result = answer1D - answer2D;
        output = String.format("The difference is %f", result);
        JOptionPane.showMessageDialog(null, output);
        break;

      case "*":
        result = answer1D * answer2D;
        output = String.format("The product is %f", result);
        JOptionPane.showMessageDialog(null, output);
        break;

      case "/":
        result = answer1D / answer2D;
        output = String.format("The quotient is %f", result);
        JOptionPane.showMessageDialog(null, output);
        break;

      case "^":
        result = Math.pow(answer1D, answer2D);
        output = String.format("The exponent is %f", result);
        JOptionPane.showMessageDialog(null, output);
        break;

      default:
        output = String.format("I am not aware of that operator %s", (operation));
        break;

    } //end switch
  output = String.format("Thank you for using my calculator :)");
  JOptionPane.showMessageDialog(null, output);


  } //end main
} //end class
