import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите свой вес (в килограммах) ");
        double ves = sc.nextDouble();
        System.out.println(" ");
        System.out.println("Введите свой рост (в метрах) ");
        double rost = sc.nextDouble();
        System.out.println(" ");
        System.out.println("Введите свой возраст ");
        byte age = sc.nextByte();

        double imt = ves / (Math.pow(rost, 2));
        System.out.println(" ");
        System.out.println("Ваш ИМТ равен: " + imt);

        double ideal_ves = 24.9 * Math.pow(rost, 2);
        System.out.println("Ваш идеальный вес: " + ideal_ves);
        System.out.println(" ");
        double bov = 88.36 + (13.4 * ves) + (4.8 * rost) - (5.7 * age);
        if (18.5 <= imt && imt <= 24.9){
            System.out.println("ВЫ СИГМА");
            System.out.println("Ваша суточная норма калорий: " + bov);
            System.out.println(" ");
        }
        else if (24.9 <= imt ){
            double sbros = imt - 24.9;
            System.out.println("Вам необходимо сбросить " + sbros * Math.pow(rost, 2));
            System.out.println("Ваша суточная норма калорий: " + (bov - 500));
        }
        else if (imt <= 18.5){
            double uper = 18.5 - imt;
            System.out.println("Вам необходимо набрать " + uper * Math.pow(rost, 2));
            System.out.println("Ваша суточная норма калорий: " + (bov + 500));
        }
    }
}