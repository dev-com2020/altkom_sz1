import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.Objects;

public class MetString {

    private static byte[] bytesSource(){
        return new byte[]{1,2,3,4,5};
    }
    private static ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

    public static void main(java.lang.String... args) throws Exception{

        // String to byte[]
        byte[] buffer = bytesSource();
        try(ByteArrayInputStream bais = new ByteArrayInputStream(buffer)){
            int data;
            while((data = bais.read()) != -1){
                System.out.print(((char)data) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


       String file = Objects.requireNonNull(classLoader.getResource("file.txt")).getFile();
        try(FileInputStream fis = new FileInputStream(file)){
            int data;
            while ((data = fis.read()) != -1){
                System.out.print(((char)data) + " ");
            }
        } catch (Exception e) {
        }
    }
}

