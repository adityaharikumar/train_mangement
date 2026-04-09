import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 🔷 Main Class
public class TrainConsistAppUC11 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        Scanner sc = new Scanner(System.in);

        // 🔹 Input
        System.out.print("\nEnter Train ID (format TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoCode = sc.nextLine();

        // 🔹 Regex Patterns
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        // 🔹 Compile Patterns
        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        // 🔹 Match Inputs
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // 🔹 Validation
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // 🔹 Output Results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("✅ Train ID is VALID");
        } else {
            System.out.println("❌ Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("✅ Cargo Code is VALID");
        } else {
            System.out.println("❌ Cargo Code is INVALID");
        }

        // 🔹 Program continues...
        System.out.println("\nValidation completed using Regex.");
    }
}
