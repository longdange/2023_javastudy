package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Team0531_ReadTextFile {
	static public String readTextFile(String filePath) {
        String result = null;

        String pathname = filePath;

        File f_source = new File(pathname);

        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream(f_source);
            bis = new BufferedInputStream(fis);

            byte[] bContents = new byte[(int) f_source.length()];
            bis.read(bContents);

            result = new String(bContents);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
            }
        }

        return result;
    }
}

