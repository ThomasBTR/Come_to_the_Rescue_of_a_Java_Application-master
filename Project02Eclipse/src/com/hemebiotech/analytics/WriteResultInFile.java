package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class WriteResultInFile implements ISymptomWriter {

    private final String filepath;

    public WriteResultInFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Writing sorted symptoms onto a text file
     *
     * @param sortedSymptoms sorted symptoms
     * @return An arrayList of the data written. If an
     */
    public ArrayList<String> write(Map<String, Integer> sortedSymptoms) {

        ArrayList<String> lineWritten = null;
        if (this.filepath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));

                lineWritten = new ArrayList<>();

                for (Map.Entry<String, Integer> entry : sortedSymptoms.entrySet()) {
                    String line = entry.getKey() + " : " + entry.getValue().toString();
                    lineWritten.add(line);
                    writer.write(line);
                    writer.newLine();
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lineWritten;
    }
}
