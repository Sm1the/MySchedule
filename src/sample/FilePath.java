package sample;

import java.io.File;

public class FilePath {
    protected static String getAbsolutePath() {
        return new File("").getAbsolutePath();
    }
}
