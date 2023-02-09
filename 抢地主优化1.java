import java.util.*;

public class 抢地主优化1 {
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
        System.out.println("玩家" + player1 + "是否抢地主");
        System.out.println("是(Y)   否(N)");
        String a = sc.nextLine();
        if (a.equals("Y")) {
            System.out.println("玩家" + player2 + "是否抢地主");
            System.out.println("是(Y)   否(N)");
            String b = sc.nextLine();
            if (b.equals("Y")) b1++;
            System.out.println("玩家" + player3 + "是否抢地主");
            System.out.println("是(Y)   否(N)");
            String c = sc.nextLine();
            if (c.equals("Y")) c1++;
            if (c1 == 1) {
                System.out.println("玩家" + player1 + "是否抢地主");
                System.out.println("是(Y)   否(N)");
                String aa = sc.nextLine();
                if (aa.equals("Y")) System.out.println("玩家" + player1 + "成为地主");
                else System.out.println("玩家" + player3 + "成为地主");
            }
            if (b1 == 1 && c1 == 0) {
                System.out.println("玩家" + player1 + "是否抢地主");
                System.out.println("是(Y)   否(N)");
                String aa = sc.nextLine();
                if (aa.equals("Y")) System.out.println("玩家" + player1 + "成为地主");
                else System.out.println("玩家" + player2 + "成为地主");
            }
            if (b1 == 0 && c1 == 0) System.out.println("玩家" + player1 + "成为地主");
        }
    }
}