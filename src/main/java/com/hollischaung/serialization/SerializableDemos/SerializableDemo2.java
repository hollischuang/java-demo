package com.hollischaung.serialization.SerializableDemos;
import java.io.*;
/**
 * Created by hollis on 16/2/17.
 * 该示例试图对一个不支持序列化的类进行序列化及反序列化
 */
public class SerializableDemo2 {
    //为了便于理解和节省篇幅，忽略关闭流操作及删除文件操作。真正编码时千万不要忘记
    //IOException直接抛出
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        User2 user = new User2();
        user.setName("hollis");
        user.setAge(23);
        oos.writeObject(user);
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        User2 newInstance = (User2) ois.readObject();
        //output
        System.out.println(newInstance);
    }
}

//Exception in thread "main" java.io.NotSerializableException: com.hollischaung.SerializableDemos.serialization.User2
//at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1183)
//        at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:347)
//        at com.hollischaung.SerializableDemos.serialization.SerializableDemo2.main(SerializableDemo2.java:19)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:606)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)