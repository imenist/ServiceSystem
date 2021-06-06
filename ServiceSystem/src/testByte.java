import java.io.File;
import java.io.FileOutputStream;

public class testByte {
    public static void main(String[] args) throws Exception{
        byte[][][] a = new byte[1024][1024][1024];
        File file = new File("D://IDEA项目//char.txt");
        FileOutputStream fos = new FileOutputStream(file);
        for (int i=0;i<1024;i++)
            for (int j=0;j<1024;j++)
                for (int k=0;k<1024;k++)
                    fos.write(a[i][j][k]);
        fos.close();
    }
}
