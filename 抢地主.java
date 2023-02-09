import java.util.*;

public class 抢地主 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int x = r.nextInt(3) + 1;
        int a1=0,b1=0,c1=0;
        x=2;
        if(x==1){
            System.out.println("玩家一是否抢地主");
            System.out.println("是(Y)   否(N)");
            String a= sc.nextLine();
            if (a.equals("Y")){
                System.out.println("玩家二是否抢地主");
                System.out.println("是(Y)   否(N)");
                String b= sc.nextLine();
                if (b.equals("Y")) b1++;
                System.out.println("玩家三是否抢地主");
                System.out.println("是(Y)   否(N)");
                String c= sc.nextLine();
                if (c.equals("Y")) c1++;
                if(c1==1){
                    System.out.println("玩家一是否抢地主");
                    System.out.println("是(Y)   否(N)");
                    String aa= sc.nextLine();
                    if (aa.equals("Y")) System.out.println("玩家一成为地主");
                    else System.out.println("玩家三成为地主");
                }
                if(b1==1&&c1==0){
                    System.out.println("玩家一是否抢地主");
                    System.out.println("是(Y)   否(N)");
                    String aa= sc.nextLine();
                    if (aa.equals("Y")) System.out.println("玩家一成为地主");
                    else System.out.println("玩家二成为地主");
                }
                if(b1==0&&c1==0) System.out.println("玩家一成为地主");
            }
        }
        else if (x==2){
            System.out.println("玩家二是否抢地主");
            System.out.println("是(Y)   否(N)");
            String b= sc.nextLine();
            if (b.equals("Y")){
                System.out.println("玩家三是否抢地主");
                System.out.println("是(Y)   否(N)");
                String c= sc.nextLine();
                if (c.equals("Y")) c1++;
                System.out.println("玩家一是否抢地主");
                System.out.println("是(Y)   否(N)");
                String a= sc.nextLine();
                if (a.equals("Y")) a1++;
                if(a1==1){
                    System.out.println("玩家二是否抢地主");
                    System.out.println("是(Y)   否(N)");
                    String bb= sc.nextLine();
                    if (bb.equals("Y")) System.out.println("玩家二成为地主");
                    else System.out.println("玩家一成为地主");
                }
                if(c1==1&&a1==0){
                    System.out.println("玩家二是否抢地主");
                    System.out.println("是(Y)   否(N)");
                    String bb= sc.nextLine();
                    if (bb.equals("Y")) System.out.println("玩家二成为地主");
                    else System.out.println("玩家三成为地主");
                }
                if(c1==0&&a1==0) System.out.println("玩家二成为地主");
            }
        }
        else{
            System.out.println("玩家三是否抢地主");
            System.out.println("是(Y)   否(N)");
            String c= sc.nextLine();
            if (c.equals("Y")){
                System.out.println("玩家一是否抢地主");
                System.out.println("是(Y)   否(N)");
                String a= sc.nextLine();
                if (a.equals("Y")) a1++;
                System.out.println("玩家二是否抢地主");
                System.out.println("是(Y)   否(N)");
                String b= sc.nextLine();
                if (b.equals("Y")) b1++;
                if(b1==1){
                    System.out.println("玩家三是否抢地主");
                    System.out.println("是(Y)   否(N)");
                    String cc= sc.nextLine();
                    if (cc.equals("Y")) System.out.println("玩家三成为地主");
                    else System.out.println("玩家二成为地主");
                }
                if(a1==1&&b1==0){
                    System.out.println("玩家三是否抢地主");
                    System.out.println("是(Y)   否(N)");
                    String cc= sc.nextLine();
                    if (cc.equals("Y")) System.out.println("玩家三成为地主");
                    else System.out.println("玩家一成为地主");
                }
                if(a1==0&&b1==0) System.out.println("玩家三成为地主");
            }
        }
    }
}
