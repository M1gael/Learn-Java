package Tests.CT6_2023;

import java.util.Arrays;

public class TheTestStats {

    public static void main(String[] args) {
        String[] batchCodes = {"M1W1", "M1W2", "M1W3", "M1W4",
                "M2W1", "M2W2", "M2W3", "M2W4",
                "M3W1", "M3W2", "M3W3", "M3W4",
                "M4W1", "M4W2", "M4W3", "M4W4"};
        int[] testsDone = {467, 587, 987, 787,
                878, 888, 936, 1002,
                1005, 768, 887, 963,
                789, 1008, 888, 687};
        int[] positiveResults = {23, 87, 88, 99,
                87, 105, 222, 138,
                333, 258, 408, 444,
                259, 236, 408, 258};

        int testsInWeek = testsDoneInWeek(batchCodes, testsDone, 2, 3);

        System.out.println("The number of tests done in week 2 of month 3 is: " + testsInWeek);

        double[] percentages = percentagePositives(testsDone, positiveResults);

        String highestBatch = highestPercentage(batchCodes, percentages);

        System.out.println("The batch with the highest percentage of positive cases is: " + highestBatch);
    }

    public static int testsDoneInWeek(String[] batchCodes, int[] testsDone, int weekNumber, int monthNumber) {
        String targetBatch = "M" + monthNumber + "W" + weekNumber;

        int index = -1;
        for (int i = 0; i < batchCodes.length; i++) {
            if (batchCodes[i].equals(targetBatch)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            return testsDone[index];
        } 
    }

    public static double[] percentagePositives(int[] testsDone, int[] positiveResults) {
        double[] percentages = new double[testsDone.length];

        for (int i = 0; i < testsDone.length; i++) {
            percentages[i] = (double) positiveResults[i] / testsDone[i] * 100;
        }

        return percentages;
    }

    public static String highestPercentage(String[] batchCodes, double[] percentages) {
        double[] sortedPercentages = Arrays.copyOf(percentages, percentages.length);

        Arrays.sort(sortedPercentages);
        for (int i = 0; i < sortedPercentages.length / 2; i++) {
            double temp = sortedPercentages[i];
            sortedPercentages[i] = sortedPercentages[sortedPercentages.length - 1 - i];
            sortedPercentages[sortedPercentages.length - 1 - i] = temp;
        }

        int index = -1;
        for (int i = 0; i < percentages.length; i++) {
            if (percentages[i] == sortedPercentages[0]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            return batchCodes[index];
        } else {
            return "";
        }
    }
}
