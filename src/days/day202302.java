package days;

import java.util.Scanner;

public class day202302 {
    public static int partOne(String input) {
        Scanner scan = new Scanner(input);

        int sum = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String firstChar = "";
            String lastChar = "";
            for (int i = 0; i < line.length(); i++) {
                if (Character.isDigit(line.charAt(i))) {
                    if (firstChar == "")
                        firstChar = "" + line.charAt(i);
                    lastChar = "" + line.charAt(i);
                }
            }
            sum += Integer.parseInt(firstChar + lastChar);
        }
        scan.close();
        return sum;
    }
}
