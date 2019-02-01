package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        try {
            switch (imageType) {
                case BMP: return new BmpReader();
                case JPG: return new JpgReader();
                case PNG: return new PngReader();
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
