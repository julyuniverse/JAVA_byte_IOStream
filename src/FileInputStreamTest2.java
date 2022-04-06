import java.io.*;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")))) { // 한글 깨짐 출력 방지를 위해서 InputStreamReader, BufferedReader 클래스 사용
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) { // FileNotFoundException으로 예외 처리를 하게 되면 FileInputStream의 예외 처리를 또 해야 하기 때문에 상위 클래스인 IOException으로 모두 잡아 준다.
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("end");

        // 결과
        // ABC hello 123 안녕하세요
        // end
    }
}
