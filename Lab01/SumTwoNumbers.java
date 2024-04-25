import javax.swing.JOptionPane;

public class SumTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You're just attained";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double str1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double str2 = Double.parseDouble(strNum2);
        double sum = str1 + str2;
        double diff = Math.abs(str1 - str2);
        double product = str1 * str2;
        double quotient = str1 / str2;
        strNotification += "\nSum: " + String.valueOf(sum) + "\nDifference: " + String.valueOf(diff) + "\nProduct: " + String.valueOf(product) + "\nQuotient: " + String.valueOf(quotient) ;
        JOptionPane.showMessageDialog(null, strNotification, "Show two number;", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}