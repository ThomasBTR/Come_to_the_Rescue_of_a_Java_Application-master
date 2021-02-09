package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {


    public static void main(String... args) throws Exception {
        /*
         * TODO : Add Throwable in all the code that use java.lang.Exception throwables
         *
         * TODO : Comment the code to give explaination of what is done
         */


        try {
            ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

            List<String> symptoms = readSymptomDataFromFile.GetSymptoms();

            SortAndCountSymptoms sortAndCountSymptoms = new SortAndCountSymptoms();
            Map<String, Integer> sortedSymptoms = sortAndCountSymptoms.SortAndCount(symptoms);

            new WriteResultInFile("Project02Eclipse/result.txt", sortedSymptoms);

        } catch (Exception e) {
            e.getStackTrace();
        }


//// first get input
//		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
//		String line = reader.readLine();
//		int i = 0;	// set i to 0
//		int headCount = 0;	// counts headaches
//		while (line != null) {
//			i++;	// increment i
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headCount++;
//				System.out.println("number of headaches: " + headCount);
//			}
//			else if (line.equals("rush")) {
//				rashCount++;
//			}
//			else if (line.contains("pupils")) {
//				pupilCount++;
//			}
//
//			line = reader.readLine();	// get another symptom
//		}
//
//		// next generate output
//		FileWriter writer = new FileWriter ("result.out");
//		writer.write("headache: " + headacheCount + "\n");
//		writer.write("rash: " + rashCount + "\n");
//		writer.write("dialated pupils: " + pupilCount + "\n");
//		writer.close();
    }
}
