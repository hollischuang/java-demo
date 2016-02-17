package com.hollischaung.serialization.ExternalizableDemos;

import java.io.*;

/**
 * Created by hollis on 16/2/17.
 * 对一个不提供无参数的构造函数并实现了Externalizable接口的类进行序列化及反序列化
 */
public class ExternalizableDemo3 {

    //为了便于理解和节省篇幅，忽略关闭流操作及删除文件操作。真正编码时千万不要忘记
    //IOException直接抛出
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        User3 user = new User3("hollis",23);
        oos.writeObject(user);
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        User3 newInstance = (User3) ois.readObject();
        //output
        System.out.println(newInstance);
    }
}

//Exception in thread "main" java.io.InvalidClassException: com.hollischaung.serialization.ExternalizableDemos.User3; no valid constructor
//        at java.io.ObjectStreamClass$ExceptionInfo.newInvalidClassException(ObjectStreamClass.java:150)
//        at java.io.ObjectStreamClass.checkDeserialize(ObjectStreamClass.java:768)
//        at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1772)
//        at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1350)
//        at java.io.ObjectInputStream.readObject(ObjectInputStream.java:370)
//        at com.hollischaung.serialization.ExternalizableDemos.ExternalizableDemo3.main(ExternalizableDemo3.java:20)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:606)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)