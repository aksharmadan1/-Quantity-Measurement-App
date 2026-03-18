import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Key Concept: ArrayList (Dynamic Collection)
        // Using List interface for abstraction over ArrayList implementation
        List<String> trainConsist = new ArrayList<>();

        // Dynamic Initialization check
        int initialBogieCount = trainConsist.size();

        // Console Output
        System.out.println("Status: Train consist initialized.");
        System.out.println("Initial Bogie Count: " + initialBogieCount);
        System.out.println("------------------------------------");
    }
}