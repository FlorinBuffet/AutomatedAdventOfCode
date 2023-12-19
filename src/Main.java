import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("AoC 2023, Day 1, Part 1: "+ days.day202301.partOne(Files.readString(Paths.get("data/day202301.txt"))));

    }
}