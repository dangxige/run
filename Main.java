import java.util.Scanner;

/**
 * Created by dangxige on 2017/3/23.
 */
public class Main{

    public static void main(String[] args){
        Main xm=new Main();
        Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt();
        int r=scanner.nextInt();
        xm.go2(l,r);
        xm.go1(l,r);
    }
    public void go1(int l,int r){
        double x=r*Math.cos(l*1.0/r);
        double y=r*Math.sin(l*1.0/r);
        System.out.println(String.format("%.3f",x)+" "+String.format("%.3f",y));
    }
    public void go2(int l,int r){
        double x=r*Math.cos(l*1.0/r);
        double y=-r*Math.sin(l*1.0/r);
        System.out.println(String.format("%.3f",x)+" "+String.format("%.3f",y));
    }
}