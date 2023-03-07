// К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class task003 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task003.class.getName());
        FileHandler fh = new FileHandler("logTask03.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("Использование калькулятора.");
        Scanner dataEntry = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int n1 = dataEntry.nextInt();
        System.out.print("Введите 2 число: ");
        int n2 = dataEntry.nextInt();
        System.out.print("Введите знак (+, -, /, *): ");
        String operator = dataEntry.next();
        dataEntry.close(); 

        int result = 0;
        if ("+".equals(operator)) {
            result = n1 + n2;
        }
        else if ("-".equals(operator)) {
            result = n1 - n2;
        }
        else if ("/".equals(operator)) {
            result = n1 / n2;
        }
        else if ("*".equals(operator)) {
            result = n1 * n2;
        }      
        System.out.print(n1 + " " + operator + " " + n2 + " = " + result);
        logger.info("Запись: " + n1 + " " + operator + " " + n2 + " = " + result);
    }
}