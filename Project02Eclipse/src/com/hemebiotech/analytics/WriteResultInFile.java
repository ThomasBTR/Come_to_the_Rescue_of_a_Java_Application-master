package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteResultInFile {

    private String filepath;
    private Map<String, Integer> sortedSymptoms;


    /**
     * @param filepath       a full or partial path to file where the results will be written.
     * @param sortedSymptoms a sorted Map countaining the Symptoms as key sorted alphabetically and their count as value.
     */

    public WriteResultInFile(String filepath, Map<String, Integer> sortedSymptoms) {

        if (filepath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
                int mapsize = 0;

                for (Map.Entry<String, Integer> entry : sortedSymptoms.entrySet()) {
                    writer.write(entry.getKey());
                    writer.write(" : ");
                    writer.write(entry.getValue().toString());
                    writer.newLine();
                }
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
