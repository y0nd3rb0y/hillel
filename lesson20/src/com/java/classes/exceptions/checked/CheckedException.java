package com.java.classes.exceptions.checked;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
CheckedException checkedException = new CheckedException();
        checkedException.readFile();
    }
    public void readFile() {
        File file = new File("e:\\globdata.ini");
        FileReader reader =  null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFileWithResources() {
        File file = new File("d:\\globdata.ini");
        try (FileReader reader = new FileReader(file)){

        }
        /*catch (FileNotFoundException fe | IOException e){
            e.printStackTrace();
        }*/
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
