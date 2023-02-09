import java.util.*;

public class 抢地主优化2 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int x = r.nextInt(3) + 1;
        int b1 = 0, c1 = 0;
        String player1, player2, player3;
        if (x == 1) {
            player1 = "一";
            player2 = "二";
            player3 = "三";
        } else if (x == 2) {
            player1 = "二";
            player2 = "三";
            player3 = "一";
        } else {
            player1 = "三";
            player2 = "一";
            player3 = "二";
        }
        print1(player1);
        print();
        String a = sc.nextLine();
        if (a.equals("Y")) {
            print1(player2);
            print();
            String b = sc.nextLine();
            if (b.equals("Y")) b1++;
            print1(player3);
            print();
            String c = sc.nextLine();
            if (c.equals("Y")) c1++;
            if (c1 == 1) {
                print1(player1);
                print();
                String aa = sc.nextLine();
                if (aa.equals("Y")) print2(player1);
                else print2(player3);
            }
            if (b1 == 1 && c1 == 0) {
                print1(player1);
                print();
                String aa = sc.nextLine();
                if (aa.equals("Y")) print2(player1);
                else print2(player2);
            }
            if (b1 == 0 && c1 == 0) print2(player1);
        }
    }

    public static void print() {
        System.out.println("是(Y)   否(N)");
    }

    public static void print1(String s) {
        System.out.println("玩家" + s + "是否抢地主");
    }

    public static void print2(String s) {
        System.out.println("玩家" + s + "成为地主");
    }
}