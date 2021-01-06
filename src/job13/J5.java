package job13;


public class J5 {

    public static void main(String[] args) {
        try{
            int maxL = Integer.MAX_VALUE;
            System.out.println(maxL);
        }catch (OutOfMemoryError e){
            System.out.println("OutOfMemoryError!");
        }
    }
}
