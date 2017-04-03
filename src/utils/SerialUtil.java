package utils;

import com.sun.media.jfxmedia.logging.Logger;

import java.io.*;

/**
 * Created by hughie on 2017/4/3.
 * Serial
 */
public final class SerialUtil {
    /**
     * Save object to specific file
     * */
    public static void saveObject(Object object, String filePath) {
        try {
            File file = new File(filePath);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[utils.SerialUtil+saveObject] IOException = " + e.toString());
        }
    }

    /**
     * Load object from specific file
     * */
    public static Object loadObject(String filePath) {
        Object object = null;
        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            objectInputStream.defaultReadObject();
            object = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("[utils.SerialUtil+loadObject] Exception = " + e.toString());
        }
        return object;
    }
}
