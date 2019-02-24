package com.yabushier.blogs;

import com.youbenzi.mdtool.tool.MDTool;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MDToolTest {

    @Test
    public void test01()  {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("E:/Blogs/Java中的值传递问题.md"));

            int len = 0;
            byte[] buf = new byte[1024*5];
            StringBuffer stringBuffer = new StringBuffer();
            String s=null;
            while ((len = fileInputStream.read(buf)) != -1) {
                s = MDTool.markdown2Html(new String(buf, 0, len));
            }
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(fileInputStream != null){
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
