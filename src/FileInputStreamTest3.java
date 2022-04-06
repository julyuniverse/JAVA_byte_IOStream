import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        int i;

        try (FileInputStream fis = new FileInputStream("input2.txt")) { // try() 안에 I/O Stream을 설정하면 auto close가 되어서 catch나 finally에서 해당 스트림을 close(닫기)를 하지 않아도 된다.
            byte[] bytes = new byte[10];

            while((i = fis.read(bytes)) != -1){
                for(int j = 0; j < i; j++) {
                    System.out.print((char)bytes[j]);
                }
                System.out.println(": " + i + "바이트 읽음");
            }
        } catch (IOException e) { // FileNotFoundException으로 예외 처리를 하게 되면 FileInputStream의 예외 처리를 또 해야 하기 때문에 상위 클래스인 IOException으로 모두 잡아 준다.
            e.printStackTrace();
        }

        // 결과
        // ABCDEFGHIJ: 10바이트 읽음
        // KLMNOPQRST: 10바이트 읽음
        // UVWXYZ: 6바이트 읽음
    }
}
