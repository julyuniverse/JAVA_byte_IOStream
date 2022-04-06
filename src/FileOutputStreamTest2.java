import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("output2.txt", true); // true로 설정하면 누적해서 입력한다.

        try (fos) {
            byte[] bytes = new byte[26];
            byte data = 65;

            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = data++;
            }

            fos.write(bytes);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
