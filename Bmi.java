import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1人目の身長(m)を入力してください：");
        double height1 = stdIn.nextDouble();
        System.out.print("1人目の体重(Kg)を入力してください：");
        double weight1 = stdIn.nextDouble();
        double bmi1 = weight1 / Math.pow(height1, 2);
        System.out.println("1人目のBMI値は" + (Math.floor(bmi1*100)/100) + "です。");
    
        System.out.print("2人目の身長(m)を入力してください：");
        double height2 = stdIn.nextDouble();
        System.out.print("2人目の体重(Kg)を入力してください：");
        double weight2 = stdIn.nextDouble();
        double bmi2 = weight2 / Math.pow(height2, 2);
        System.out.println("2人目のBMI値は" + (Math.floor(bmi2*100)/100) + "です。");

    }
    }

