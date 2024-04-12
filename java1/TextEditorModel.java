package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TextEditorModel {
    private List<String> textLines;

    public TextEditorModel() {
        textLines = new ArrayList<>();
    }

    public void addLine(String line) {
        textLines.add(line);
    }

    public void removeLine(int index) {
        textLines.remove(index);
    }

    public List<String> getTextLines() {
        return textLines;
    }

    public void saveToFile(File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            textLines.forEach(line -> {
                try {
                    writer.write(line);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public void loadFromFile(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            textLines = reader.lines().collect(Collectors.toList());
        }
    }

    public void traverseDirectory(File directory, List<File> fileList) {
        if (directory.isDirectory()) {
            fileList.addAll(
                    java.util.Arrays.stream(directory.listFiles())
                            .flatMap(file -> {
                                if (file.isDirectory()) return java.util.Arrays.stream(file.listFiles()).flatMap(subfile -> java.util.Arrays.asList(subfile).stream());
                                else return java.util.Arrays.asList(file).stream();
                            })
                            .collect(Collectors.toList()));
        }
    }

}


