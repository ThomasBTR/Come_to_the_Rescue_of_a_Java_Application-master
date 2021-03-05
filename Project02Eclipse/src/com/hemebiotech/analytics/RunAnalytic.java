package com.hemebiotech.analytics;

public class RunAnalytic {

    private static final String INPUT_FILEPATH = "Project02Eclipse/symptoms.txt";
    private static final String EXIT_FILEPATH = "Project02Eclipse/result.txt";


    public static void main(String... args) {

        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(INPUT_FILEPATH);
        WriteResultInFile writeResultInFile = new WriteResultInFile(EXIT_FILEPATH);
        AnalyticsCounter sortAndCountSymptoms = new AnalyticsCounter(writeResultInFile, readSymptomDataFromFile);

        sortAndCountSymptoms.loadSymptoms();
        sortAndCountSymptoms.sortAndCount();
        sortAndCountSymptoms.saveSymptoms();
    }
}
