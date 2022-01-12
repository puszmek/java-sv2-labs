package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> word = readFromFile(path);
        StringBuilder sb = new StringBuilder(word.get(0)).append(word.get(word.size() - 1));
        return sb.toString();
    }
}
