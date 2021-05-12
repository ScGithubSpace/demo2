package org.example;

import org.example.utils.ZipUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class App 
{
    public static void main( String[] args ) {
        try {
            File targetFile = new File("E:\\course\\test01\\mytest01.zip");
            OutputStream out = new FileOutputStream(targetFile);
            ZipUtils.toZip("E:\\course\\test", out, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
