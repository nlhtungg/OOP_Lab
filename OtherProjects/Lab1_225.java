import javax.swing.*;

public class Lab1_225 {
    public static void main(String[] args){
        double num1, num2, num3, num4, num5, num6;

        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Input first number:", "First number: ",
                JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        
        strNum2 = JOptionPane.showInputDialog(null,
                "Input second number:", "Second number: ",
                JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        num3 = num1 + num2;
        num4 = Math.abs(num1 - num2);
        num5 = num1 * num2;
        num6 = num1 / num2;

        JOptionPane.showMessageDialog(null, num1 + "+" + num2+ "="+ num3+"\n"
                                    +num1 + "-" + num2 + "="+ num4 +"\n"
                                    +num1 + "*" + num2 + "="+ num5+"\n"
                                    +num1 + "/" + num2 + "="+ num6+"\n",
                "Show two numbers sum, difference, product, quotient: ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}