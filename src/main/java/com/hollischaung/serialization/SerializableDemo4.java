package com.hollischaung.serialization;

import java.io.*;

/**
 * Created by hollis on 16/2/17.
 * 该示例试图对一个不支持序列化的类进行序列化及反序列化
 */
public class SerializableDemo4 {

    //为了便于理解和节省篇幅，忽略关闭流操作及删除文件操作。真正编码时千万不要忘记
    //IOException直接抛出
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        VipUser4 vipUser4 = new VipUser4();
        vipUser4.setUsername("hollis");
        vipUser4.setPassword("123321");
        vipUser4.setNickName("hollischuang");
        //System.out.println(vipUser3);
        //OutPut :
        //VipUser{userName='hollis'password='123321'nickName='hollischuang'}
        //==========================//
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(vipUser4);
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        VipUser4 newInstance = (VipUser4) ois.readObject();
        //output
        System.out.println(newInstance);
    }
}
//OutPut:
//VipUser4{userName='hollis'password='123321'nickName='hollischuang'}