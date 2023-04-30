import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CowMain {
    public static void CowMainStart() {
        int min = 8;
        int max = 12;
        List<Cow> cowList = new ArrayList<>();
        Cow cow1 = new Cow(123, " Простой", randomMilk(min, max));
        cowList.add(cow1);
        Cow cow2 = new Cow(543, " Простой", randomMilk(min, max));
        cowList.add(cow2);
        Cow cow3 = new Cow(243, " Простой", randomMilk(min, max));
        cowList.add(cow3);
        Cow cow4 = new Cow(123, " Простой", randomMilk(min, max));
        cowList.add(cow4);
        Cow cow5 = new Cow(876, " Простой", randomMilk(min, max));
        cowList.add(cow5);
        Cow cow6 = new Cow(234, " Простой", randomMilk(min, max));
        cowList.add(cow6);
        Cow cow7 = new Cow(345, " Простой", randomMilk(min, max));
        cowList.add(cow7);
        Cow cow8 = new Cow(454, " Простой", randomMilk(min, max));
        cowList.add(cow8);
        Cow cow9 = new Cow(244, " Простой", randomMilk(min, max));
        cowList.add(cow9);
        Cow cow10 = new Cow(542, " Простой", randomMilk(min, max));
        cowList.add(cow10);
        System.out.println("Тип |   id  |  литр/шт");
        System.out.println("_________________________");
        System.out.println("Cow |  " + cow1.getId() + "  | " + cow1.getMilk());
        System.out.println("Cow |  " + cow2.getId() + "  | " + cow2.getMilk());
        System.out.println("Cow |  " + cow3.getId() + "  | " + cow3.getMilk());
        System.out.println("Cow |  " + cow4.getId() + "  | " + cow4.getMilk());
        System.out.println("Cow |  " + cow5.getId() + "  | " + cow5.getMilk());
        System.out.println("Cow |  " + cow6.getId() + "  | " + cow6.getMilk());
        System.out.println("Cow |  " + cow7.getId() + "  | " + cow7.getMilk());
        System.out.println("Cow |  " + cow8.getId() + "  | " + cow8.getMilk());
        System.out.println("Cow |  " + cow9.getId() + "  | " + cow9.getMilk());
        System.out.println("Cow |  " + cow10.getId() + "  | " + cow10.getMilk());
        int sum = cow1.getMilk() + cow2.getMilk() + cow3.getMilk() + cow4.getMilk() +
                cow5.getMilk() + cow6.getMilk() + cow7.getMilk() + cow8.getMilk() +
                cow9.getMilk() + cow10.getMilk();
        System.out.println("_________________________");
        System.out.println("|" + sum + "|" + " литров молока в день");
        System.out.println("-------------------------");
        int all = sum * 7;
        int sumMilk = sum * 70;
        System.out.println("_________________________");
        System.out.println("|" + all + "|" + " литров молока за 7 дней");
        System.out.println("-------------------------");
        int sumMilks = all * 70;
        System.out.println(sumMilk + "сом прибыл в день");
        System.out.println("__________________________");
        System.out.println(sumMilks + "сом прибыли за 7 дней");
        System.out.println("__________________________");
        System.out.println("Купить корову нажмите на номер 1    " + "|     на главный меню номер 0");
        Scanner scanner = new Scanner(System.in);
        int ddd = scanner.nextInt();
        if (ddd == 1) {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);

            Cow c = new Cow();

            System.out.println("Введите id коровы:");
            int aa = scanner1.nextInt();
            System.out.println("Введите породу :");
            String string = scanner2.nextLine();
            c.setId(aa);
            c.setBreed(string);
            c.setMilk(randomMilk(min, max));
            cowList.add(c);

            for (int i = 0; i < cowList.size(); i++) {
                System.out.println(cowList.get(i));
            }
            System.out.println();
            List<Integer> sumMilkAll = new ArrayList<>();
            for (int i = 0; i < cowList.size(); i++) {

                int ss = cowList.get(i).getMilk();
                sumMilkAll.add(ss);
            }
                int qwe = sumMilkAll.stream().mapToInt(Integer::intValue).sum();
                System.out.println(qwe+" литров молока в день");
                int qwer = qwe*7;
                int get = qwe*70;
            System.out.println(get+" прибыль за 1 день");
            System.out.println();
            System.out.println(qwer+"сом литров молока за 7 дней");
            int gett = qwer*70;
            System.out.println(gett+"сом прибыль за 7 дней ");
            System.out.println();
            Scanner scanner3 = new Scanner(System.in);
            int scc= scanner3.nextInt();
            System.out.println("Вверинуться на главную страничку номер 1");
            if (scc==1){
                Main.main();
            }

        } else if (ddd == 0) {
            CowMainStart();
            System.out.println();
        }
    }

    public static int randomMilk(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
