import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("_________________________________________Добро пожаловать на ферму______________________________________________-");
        System.out.println();
        System.out.println("Статистика Коров номер 1  "+"                                                           Статистика куриц номер 2");
        System.out.println("--------------------------"+"                                                           -------------------------");
        System.out.println("Введите ответ:");
        int up = scanner.nextInt();
        if (up==1){
            CowMain.CowMainStart();
        } else if (up==2) {
            ChickenMain.ChickenMainStart();
        }
    }
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("_________________________________________Добро пожаловать на ферму______________________________________________-");
        System.out.println();
        System.out.println("Статистика Коров номер 1  "+"                                                           Статистика куриц номер 2");
        System.out.println("Введите ответ:");
    }
}