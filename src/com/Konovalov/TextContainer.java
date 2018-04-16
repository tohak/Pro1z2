package com.Konovalov;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Towa on 16.04.2018.
 */

@SaveTo(patch = "a.txt")
public class TextContainer{
    private String text="Pro task one";

    @Saver
    public void  save (String patch) throws FileNotFoundException {
        PrintWriter writer= new PrintWriter(patch);
        try {
            writer.print(text);
        }finally {
            writer.close();
        }


    }

}