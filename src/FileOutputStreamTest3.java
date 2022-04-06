import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("output3.txt", true); // true로 설정하면 누적해서 입력한다.

        try (fos) {
            byte[] bytes = new byte[26];
            byte data = 65;

            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = data++;
            }

            fos.write(bytes, 2, 10); // off를 2로 설정하고 len을 10으로 설정하면 bytes 배열의 3번째부터 10개를 입력하라는 의미
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
