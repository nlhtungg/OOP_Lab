package Lab1;
import javax.swing.*;

public class Lab1_226 {
    static void first_degree() {
        double a, b, x;
        String strA, strB;

        strA = JOptionPane.showInputDialog(null,
                "Input a", "a = ",
                JOptionPane.QUESTION_MESSAGE);
        a = Double.parseDouble(strA);

        strB = JOptionPane.showInputDialog(null,
                "Input b", "b = ",
                JOptionPane.QUESTION_MESSAGE);
        b = Double.parseDouble(strB);
        
        if(a==0){
            JOptionPane.showMessageDialog(null,
                    "a must not be equal to 0! Please re-enter!\n",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            x = -b/a;
            JOptionPane.showMessageDialog(null,
                    "x = " + x,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static void second_degree(){
        double a, b, c, delta, x1, x2;
        String strA, strB, strC;

        strA = JOptionPane.showInputDialog(null,
                "Input a", "a = ",
                JOptionPane.QUESTION_MESSAGE);
        a = Double.parseDouble(strA);

        strB = JOptionPane.showInputDialog(null,
                "Input b", "b = ",
                JOptionPane.QUESTION_MESSAGE);
        b = Double.parseDouble(strB);

        strC = JOptionPane.showInputDialog(null,
                "Input c", "c = ",
                JOptionPane.QUESTION_MESSAGE);
        c = Double.parseDouble(strC);

        delta = b*b - 4*a*c;
        if(delta < 0){
            JOptionPane.showMessageDialog(null,
                    "The equation has no solution!",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if(delta == 0){
            x1 = -b/(2*a);
            JOptionPane.showMessageDialog(null,
                    "x = " + x1,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            JOptionPane.showMessageDialog(null,
                    "x1 = " + x1 + "\nx2 = " + x2,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static void linear_system(){
        double a11, a12, b1, a21, a22, b2, x1, x2, d, d1, d2;
        String strA11, strA12, strB1, strA21, strA22, strB2;

        strA11 = JOptionPane.showInputDialog(null,
                "Input a11", "a11 = ",
                JOptionPane.QUESTION_MESSAGE);
        a11 = Double.parseDouble(strA11);
        strA12 = JOptionPane.showInputDialog(null,
                "Input a12", "a12 = ",
                JOptionPane.QUESTION_MESSAGE);
        a12 = Double.parseDouble(strA12);
        strB1 = JOptionPane.showInputDialog(null,
                "Input b1", "b1 = ",
                JOptionPane.QUESTION_MESSAGE);
        b1 = Double.parseDouble(strB1);
        strA21 = JOptionPane.showInputDialog(null,
                "Input a21", "a21 = ",
                JOptionPane.QUESTION_MESSAGE);
        a21 = Double.parseDouble(strA21);
        strA22 = JOptionPane.showInputDialog(null,
                "Input a22", "a22 = ",
                JOptionPane.QUESTION_MESSAGE);
        a22 = Double.parseDouble(strA22);
        strB2 = JOptionPane.showInputDialog(null,
                "Input b2", "b2 = ",
                JOptionPane.QUESTION_MESSAGE);
        b2 = Double.parseDouble(strB2);
        
        d = a11*a22 - a12*a21;
        d1 = b1*a22 - b2*a12;
        d2 = a11*b2 - a21*b1;
        if(d == 0){
            if(d1 == 0 && d2 == 0){
                JOptionPane.showMessageDialog(null,
                        "The system has infinitely many solutions!",
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "The system has no solution!",
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            x1 = d1/d;
            x2 = d2/d;
            JOptionPane.showMessageDialog(null,
                    "x1 = " + x1 + "\nx2 = " + x2,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        String[] options = {"First degree equation", "Linear system of equations", "Second degree equation", "Exit"};
        int choice;
        do {
            choice = JOptionPane.showOptionDialog(null,
                    "Choose the type of equation you want to solve",
                    "Choose",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            switch (choice) {
                case 0:
                    first_degree();
                    break;
                case 1:
                    linear_system();
                    break;
                case 2:
                    second_degree();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}