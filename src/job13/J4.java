package job13;
import java.util.Scanner;
@SuppressWarnings("serial")
class BianryFormatException extends Exception{
    BianryFormatException(String msg){
        super(msg);
    }
}
public class J4 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        bin2Dec(hex);
    }

    public static void bin2Dec(String hex){
        int num = 0;
        try{
            for(int i = 0;i < hex.length(); ++i){
                char binChar = hex.charAt(i);
                if(binChar == '1' || binChar == '0'){
                    num = num * 2 + binChar - '0';
                }
                else{
                    throw new BianryFormatException("It isn't a bin number!");
                }
            }
            System.out.println("The decimal value for bin number " + hex + " is " + num);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

