package main.java.com.epam.IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIO {
    private static int counter;
    private StringBuilder sb = new StringBuilder();
    private StringBuilder sb2 = new StringBuilder();
    private FileInputStream fis = null;
    private FileOutputStream fos = null;
    private static String[] keyWords = {
            "private", "protected", "public", "abstract", "class", "extends", "final", "implements", "interface",
            "native", "new", "static", "strictfp", "synchronized", "transient", "volatile", "break", "case",
            "continue", "default", "do", "else", "for", "if", "instanceof", "return", "switch", "while", "import",
            "package", "boolean", "byte", "char", "double", "float", "int", "long", "short", "assert", "catch",
            "finally", "throw", "throws", "try", "enum", "super", "this", "void", "const", "goto"};

    private void readWrite() {
        int savedByte;
        try {
            fis = new FileInputStream("C:\\Users\\nicol\\IdeaProjects\\EJC12\\Tasks\\src\\main\\java\\IO\\OldFile.txt");
            while ((savedByte = fis.read()) != -1) {
                sb.append((char) savedByte);
            }
            String s = new String(sb);
            System.out.println(s);
            for (String keyWord : keyWords) {
                if (s.contains(keyWord)) {
                    counter++;
                    sb2.append(keyWord).append("\r\n");
                }
            }
            sb2.append("Quantity of key words: ").append(counter);
            String s2 = new String(sb2);
            System.out.println(s2);
            fos = new FileOutputStream("C:\\Users\\nicol\\IdeaProjects\\EJC12\\Tasks\\src\\main\\java\\IO\\NewFile.txt");
            byte[] outBytes = s2.getBytes();
            fos.write(outBytes);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ByteIO byteIo = new ByteIO();
        byteIo.readWrite();
    }
}