import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        ShortWordFilter filter = new ShortWordFilter();
        StringTokenizer tokenizer;
        File selectedFile;
        String rec = "";
        String word = "";
        try {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                int line = 0;
                while(reader.ready()) {
                    rec = reader.readLine();
                    line++;
                    tokenizer = new StringTokenizer(rec);
                    while(tokenizer.hasMoreTokens()) {
                        word = tokenizer.nextToken();
                        if(filter.accept(word)) {
                            System.out.println(word);
                        }
                    }
                }



            }
        } catch(FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
