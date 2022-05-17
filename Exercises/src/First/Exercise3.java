package First;

import java.io.*;

public class Exercise3 {

    private static final String path = "C:\\Users\\francisco\\Documents\\1-Backend\\Informatorio\\java_informatorio_practice\\Exercises\\DirectoryText\\alumnos.txt";

    private static String message = "Program to read students names from a text file", c = "-";

    public static void main(String[] args) throws IOException {

        System.out.println(
                title_decorator() + "\n" + message + "\n" + title_decorator()
        );

        reader_file(
                get_file(path)
        );
    }

    private static File get_file(String path) {
        return new File(path);
    }

    private static void reader_file(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            System.out.println(st);
        }
    }

    private static String title_decorator() {
        return c.repeat(message.length());
    }

}
