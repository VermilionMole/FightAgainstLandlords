import java.util.*;

public class 排序带大小王 {
    public static void main(String[] args) {
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