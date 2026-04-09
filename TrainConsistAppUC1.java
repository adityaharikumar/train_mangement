import java.util.ArrayList;
import java.util.List;

// 🔷 Main Class
public class TrainConsistAppUC1 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize Train Consist (Dynamic List)
        List<String> consist = new ArrayList<>();

        // 🔹 Display Initial State
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + consist.size());

        // 🔹 Program continues...
        System.out.println("System ready for further operations.");
    }
}