import java.io.InputStream;
import java.net.URL;

public class Main{
  public static void main(String[] args) throws Exception{
    URL u = new URL("https://docs.oracle.com/javase/jp/8/docs/api/");
    InputStream is = u.openStream();
    int i = is.read();
    while (i != -1){
      char c = (char)i;
      System.out.print(c);
      i = is.read();
    }
  }
}