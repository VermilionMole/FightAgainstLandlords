import java.util.*;

public class 洗牌发牌 {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("joker");
        array.add("JOKER");
        Collections.shuffle(array);
        System.out.println(array);
        ArrayList<String> fir = new ArrayList<String>();
        ArrayList<String> sec = new ArrayList<String>();
        ArrayList<String> thi = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dipai.add(poker);
            } else if (i % 3 == 0) {
                fir.add(poker);
            } else if (i % 3 == 1) {
                sec.add(poker);
            } else if (i % 3 == 2) {
                thi.add(poker);
            }
        }
        look("玩家一", fir);
        look("玩家二", sec);
        look("玩家三", thi);
        look("底牌", dipai);
    }

    public static void look(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
