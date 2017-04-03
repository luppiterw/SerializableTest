package utils;

import com.sun.media.jfxmedia.logging.Logger;

import java.io.*;

/**
 * Created by hughie on 2017/4/3.
 * Serial
 */
public class SerialUtil {
//        try {
//        File file = new File(filePath);
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(object);
//    } catch (IOException | SecurityException e) {
//        e.printStackTrace();
//    }
    public static void saveObject(Object object, String filePath) {
        try {
            File file = new File(filePath);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[utils.SerialUtil+saveObject] IOException = " + e.toString());
        }

    }
}
