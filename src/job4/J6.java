package job4;
public class J6 {
    public static void main(String[] args) {
        int maxn = 10000;
        int[] a = new int[maxn];
        for(int i = 1;i <= 100;++i){
            a[i] = -1;
        }
        for(int i = 1;i <= 100;++i){
            for(int j = i;j <=100;j = j + i){
                a[j] = a[j] *(-1);
            }
        }
        System.out.print("There are open cabinets£º");
        for(int i = 1;i <= 100;++i){
            if(a[i] == 1){
                System.out.print(i+" ");
            }
        }
    }
}

