import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class WsppPosition {
    public static void main(String[] args) {
        try {
            MyScanner reader = new MyScanner(args[0], StandardCharsets.UTF_8);
            try {
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8));
                try {
                    int cnt = 0;
                    Map<String, List<String>> m = new LinkedHashMap<>();
                    while (reader.hasNextLine()) {
                        MyScanner sc = new MyScanner(reader.nextLine());
                        cnt++;
                        List<String> words = new ArrayList<>(sc.getWords());
                        int p = 0;
                        for (String word : words) {
                            System.err.println(word + p);
                            List<String> vls = m.getOrDefault(word.toLowerCase(), new ArrayList<>());
                            vls.add(cnt + ":" + (words.size() - p));
                            m.put(word.toLowerCase(), vls);
                            p++;
                        }
                        words.clear();
                        sc.close();
                    }
                    for (Map.Entry<String, List<String>> entry : m.entrySet()) {
                        List<String> values = new ArrayList<>(entry.getValue());
                        writer.write(entry.getKey() + " " + values.size());
                        for (int i = 0; i < values.size(); i++) {
                            writer.write(" " + values.get(i));
                        }
                        writer.write(System.lineSeparator());
                    }
                } catch (FileNotFoundException e) {
                    System.err.println("Output file error: " + e.getMessage());
                } finally {
                    writer.close();
                }
            } catch (FileNotFoundException e) {
                System.err.println("Input file error: " + e.getMessage());
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}




