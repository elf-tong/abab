package job4;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int maxn = 1000;
        String[] name = new String[maxn];
        int[] cj = new int[maxn];
        for(int i = 0;i < n;++ i){
            System.out.print("Enter Student grades and names£º");
            name[i] = input.next();
            cj[i] = input.nextInt();
        }
        for(int i = 0;i < n - 1; ++ i){
            for(int j = 0;j < n - i;++j){
                if(cj[j] < cj[j+1]){
                    int tool = cj[j+1];
                    cj[j+1] = cj[j];
                    cj[j] = tool;
                    String tool2 = name[j+1];
                    name[j+1] = name[j];
                    name[j] = tool2;
                }
            }
        }
        for(int i = 0;i < n; ++ i){
            System.out.println("Rank"+" "+(i+1)+" "+name[i]+" "+"Score"+" "+cj[i]);
        }
    }
}
