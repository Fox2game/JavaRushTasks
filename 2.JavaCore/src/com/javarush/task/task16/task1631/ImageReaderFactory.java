package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type){
        if (type != null){
            switch (type){
                case PNG: return new PngReader();
                case JPG: return new JpgReader();
                case BMP: return new BmpReader();
            }
        }
        throw new IllegalArgumentException("Неизвестный тип картинкии");
    }
}
