import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChickenMain {
    public static void ChickenMainStart() {
        Chicken chicken1 = new Chicken(345, 1);
        Chicken chicken2 = new Chicken(432, 1);
        Chicken chicken3 = new Chicken(543, 0);
        Chicken chicken4 = new Chicken(234, 0);
        Chicken chicken5 = new Chicken(345, 1);
        Chicken chicken6 = new Chicken(432, 0);
        Chicken chicken7 = new Chicken(893, 0);
        Chicken chicken8 = new Chicken(872, 1);
        Chicken chicken9 = new Chicken(234, 1);
        Chicken chicken10 = new Chicken(876, 0);
        Chicken chicken11 = new Chicken(234, 1);
        Chicken chicken12 = new Chicken(482, 0);
        Chicken chicken13 = new Chicken(992, 1);
        Chicken chicken14 = new Chicken(328, 1);
        Chicken chicken15 = new Chicken(492, 1);
        Chicken chicken16 = new Chicken(437, 0);
        Chicken chicken17 = new Chicken(995, 1);
        Chicken chicken18 = new Chicken(347, 1);
        Chicken chicken19 = new Chicken(872, 0);
        Chicken chicken20 = new Chicken(427, 1);
        Chicken chicken21 = new Chicken(543, 0);
        Chicken chicken22 = new Chicken(932, 1);
        Chicken chicken23 = new Chicken(764, 1);
        Chicken chicken24 = new Chicken(321, 0);
        Chicken chicken25 = new Chicken(786, 1);
        Chicken chicken26 = new Chicken(874, 1);
        Chicken chicken27 = new Chicken(874, 0);
        Chicken chicken28 = new Chicken(873, 0);
        Chicken chicken29 = new Chicken(473, 1);
        Chicken chicken30 = new Chicken(548, 0);
        List<Chicken> chickens= new ArrayList<>();
        chickens.add(chicken1);
        chickens.add(chicken2);
        chickens.add(chicken3);
        chickens.add(chicken4);
        chickens.add(chicken5);
        chickens.add(chicken6);
        chickens.add(chicken7);
        chickens.add(chicken8);
        chickens.add(chicken9);
        chickens.add(chicken10);
        chickens.add(chicken11);
        chickens.add(chicken12);
        chickens.add(chicken13);
        chickens.add(chicken14);
        chickens.add(chicken15);
        chickens.add(chicken16);
        chickens.add(chicken17);
        chickens.add(chicken18);
        chickens.add(chicken19);
        chickens.add(chicken20);
        chickens.add(chicken21);
        chickens.add(chicken22);
        chickens.add(chicken23);
        chickens.add(chicken24);
        chickens.add(chicken25);
        chickens.add(chicken26);
        chickens.add(chicken27);
        chickens.add(chicken28);
        chickens.add(chicken29);
        chickens.add(chicken30);
        System.out.println("Список все кур");
        System.out.println();
        for (Chicken c:chickens) {
            System.out.println(c);
        }

        int ss = chickens.stream().map(Chicken::getEgg).reduce((s1,s2)->s1+s2).orElse(0);
        int sum=ss*5;
        System.out.println();
        System.out.println(sum+"шт яиц в день");
        int sumAll = sum*7;
        System.out.println();
        System.out.println(sumAll+" шт яиц за 7 дней");
        Chicken chicken31 = new Chicken(234, 0);
        Chicken chicken32 = new Chicken(783, 0);
        Chicken chicken33 = new Chicken(543, 1);
        Chicken chicken34 = new Chicken(643, 1);
        Chicken chicken35 = new Chicken(243, 0);
        Chicken chicken36 = new Chicken(532, 1);
        Chicken chicken37 = new Chicken(541, 1);
        Chicken chicken38 = new Chicken(754, 0);
        Chicken chicken39 = new Chicken(573, 1);
        Chicken chicken40 = new Chicken(974, 1);
        System.out.println();
        System.out.println("Купить 10 кур номер 1 выйти номер 0");
        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();
        if (scanner==1){
            chickens.add(chicken31);
            chickens.add(chicken32);
            chickens.add(chicken33);
            chickens.add(chicken34);
            chickens.add(chicken35);
            chickens.add(chicken36);
            chickens.add(chicken37);
            chickens.add(chicken38);
            chickens.add(chicken39);
            chickens.add(chicken40);
            for (Chicken c : chickens ) {
                System.out.println(c);
            }
            int sss = chickens.stream().map(Chicken::getEgg).reduce((s1,s2)->s1+s2).orElse(0);
            int sums=ss*5;
            System.out.println();
            System.out.println(sums+"шт яиц в день");
            int sumAlls = sum*7;
            System.out.println(sumAlls+" шт яиц за 7 дней");
        } else if (scanner==0) {
            Main.main();
        }


    }
}
