import java.io.FileInputStream;
import java.io.FileNotFoundException; // FileNotFoundException으로 예외 처리를 하게 되면 FileInputStream의 예외 처리를 또 해야 하기 때문에 상위 클래스인 IOException으로 모두 잡아 준다.
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
        } catch (IOException e) { // FileNotFoundException으로 예외 처리를 하게 되면 FileInputStream의 예외 처리를 또 해야 하기 때문에 상위 클래스인 IOException으로 모두 잡아 준다.
            e.printStackTrace();
        } finally {
            try {
                fis.close(); // FileInputStream을 닫을 때에도 input.txt 파일이 없다면 error가 나기 때문에 예외 처리를 해야 한다.
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e1) {
                System.out.println(e1);
            }
        }

        System.out.println("end");

        // 결과
        // A
        // B
        // C
        // end
    }
}
