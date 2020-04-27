package tcpclient;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Tcpclient {

    public static void main(String[] args) throws IOException, Exception {
        Socket s = new Socket("192.168.0.107", 8888);
        OutputStream osend = s.getOutputStream();
        DataOutputStream dataWithSend = new DataOutputStream(osend);

        File file = new File("/Users/asefn/OneDrive/Desktop/car.jpg");
        FileInputStream fin = new FileInputStream(file);
        byte[] bytesArray = new byte[(int) file.length()];
        fin.read(bytesArray);
        dataWithSend.write(bytesArray);
        s.close();
    }

}
