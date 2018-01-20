
package javaapp13;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class JavaApp13 {
    
    public static void main(String[] args) throws Exception
    {
        String details="Rahul : Nithesh Dupukku : Poi Thoongu ";
        ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
        File f=new File("F:\\QR\\Myqr.jpg");
        FileOutputStream fos=new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush();
        
    }
} 
