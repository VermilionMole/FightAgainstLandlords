import java.util.*;

public class 斗地主1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xx, b1 = 0, c1 = 0;
        String player1, player2, player3, a;
        do {
            HashMap<Integer, String> hm = new HashMap<Integer, String>();
            ArrayList<Integer> array = new ArrayList<Integer>();
            String[] colors = {"♦", "♣", "♥", "♠"};
            String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
            int index = 0;
            hm.put(index, "小王");
            array.add(index);
            index++;
            hm.put(index, "大王");
            array.add(index);
            index++;
            for (String number : numbers) {
                for (String color : colors) {
                    hm.put(index, color + number);
                    array.add(index);
                    index++;
                }
            }
            Collections.shuffle(array);
            TreeSet<Integer> fir = new TreeSet<Integer>();
            TreeSet<Integer> sec = new TreeSet<Integer>();
            TreeSet<Integer> thi = new TreeSet<Integer>();
            TreeSet<Integer> dipai = new TreeSet<Integer>();
            for (int i = 0; i < array.size(); i++) {
                int x = array.get(i);
                if (i >= array.size() - 3) {
                    dipai.add(x);
                } else if (i % 3 == 0) {
                    fir.add(x);
                } else if (i % 3 == 1) {
                    sec.add(x);
                } else if (i % 3 == 2) {
                    thi.add(x);
                }
            }
            look("玩家一", fir, hm);
            look("玩家二", sec, hm);
            look("玩家三", thi, hm);
            look("底牌", dipai, hm);


            Random r = new Random();
            xx = r.nextInt(3) + 1;
            if (xx == 1) {
                player1 = "一";
                player2 = "二";
                player3 = "三";
            } else if (xx == 2) {
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
            a = sc.nextLine();
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
            } else if (a.equals("N")) {
                print1(player2);
                print();
                String b = sc.nextLine();
                if (b.equals("Y")) b1++;
                print1(player3);
                print();
                String c = sc.nextLine();
                if (c.equals("Y")) c1++;
                if (c1 == 1) {
                    print2(player3);
                }
                if (b1 == 1 && c1 == 0) {
                    print2(player2);
                }
            }
        } while (a.equals("N") && b1 == 0 && c1 == 0);
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

    public static void look(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌是：");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}