import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=0; t<T; t++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(findPoint(x1,y1,r1,x2,y2,r2));
        }
    }

    public static int findPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        int dis = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        int r_sum = (r1+r2)*(r1+r2);
        int r_mns = (r1-r2)*(r1-r2);

        if(dis == 0 && r_mns ==0) return -1;
        else if(dis < r_mns || dis > r_sum) return 0;
        else if(dis == r_sum || dis == r_mns) return 1;
        return 2;
    }
}
