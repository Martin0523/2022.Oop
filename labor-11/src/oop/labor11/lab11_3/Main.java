package oop.labor11.lab11_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileUtil.encode("labor-11/src/oop/labor11/lab11_3/FileUtil.java", "temp1.java");
            FileUtil.decode("temp1.java", "temp2.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
