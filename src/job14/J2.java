package job14;

import java.io.*;
public class J2 {
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
        InputStream fis = new FileInputStream("src/text2/input.txt");
        OutputStream fis1 = new FileOutputStream("src/text2/output.txt");
        int i;
        while((i = fis.read()) != -1){
            System.out.print((char)i);
            fis1.write(i);
        }
    }
}
