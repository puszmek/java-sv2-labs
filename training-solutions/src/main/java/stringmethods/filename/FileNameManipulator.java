package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        return str.trim().charAt(str.trim().length() - 1);
    }

    public String findFileExtension(String fileName) {
        int index = fileName.trim().lastIndexOf('.');
        return fileName.trim().substring(index + 1);
    }

    public boolean identifyFilesByExtension(String ext, String fileName){
        return ext.trim().equals(findFileExtension(fileName.trim()));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return actualFileName.trim().equals(searchedFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName){
        int index = fileName.trim().lastIndexOf('.');
        String partOfName = fileName.trim().substring(0, index);
        String extension = fileName.substring(index).toLowerCase();
        return partOfName + extension;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }

    public static void main(String[] args) {

        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("   barack    "));

        System.out.println(fileNameManipulator.findFileExtension("org.training"));

        System.out.println(fileNameManipulator.identifyFilesByExtension("qq", "s.szöveg.qw"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("qw", "s.szöveg.qw"));

        System.out.println(fileNameManipulator.compareFilesByName("s.szöveg", "s.szöveg"));

        System.out.println(fileNameManipulator.changeExtensionToLowerCase("sS.SZöveg"));

        System.out.println(fileNameManipulator.replaceStringPart("replace.string.part", "string", "int"));
        System.out.println(fileNameManipulator.replaceStringPart("replace.string.part", "otr", "int"));
    }
}
