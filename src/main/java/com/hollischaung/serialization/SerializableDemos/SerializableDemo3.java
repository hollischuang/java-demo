package com.hollischaung.serialization.SerializableDemos;

import java.io.*;

/**
 * Created by hollis on 16/2/17.
 * SerializableDemo3 和SerializableDemo4说明如果要序列化的类有父类，要想同时将在父类中定义过的变量持久化下来，那么父类也应该集成Serializable接口。
 */
public class SerializableDemo3 {

    //为了便于理解和节省篇幅，忽略关闭流操作及删除文件操作。真正编码时千万不要忘记
    //IOException直接抛出
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        VipUser3 vipUser3 = new VipUser3();
        vipUser3.setUsername("hollis");
        vipUser3.setPassword("123321");
        vipUser3.setNickName("hollischuang");
        //System.out.println(vipUser3);
        //OutPut :
        //VipUser{userName='hollis'password='123321'nickName='hollischuang'}
        //==========================//
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(vipUser3);
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        VipUser3 newInstance = (VipUser3) ois.readObject();
        //output
        System.out.println(newInstance);
    }
}
//OutPut:
//VipUser{userName='null'password='null'nickName='hollischuang'}