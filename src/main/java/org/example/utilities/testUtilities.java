package org.example.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testUtilities {
    public static String readJsonFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
