import java.io.File;
import java.io.IOException;

public class TryCatch {
    public static void main(String args[]){
    try {
        new File("test.txt").createNewFile();

        }
        catch(IOException e){
        System.out.println("파일생성실패");
        }
    }
}