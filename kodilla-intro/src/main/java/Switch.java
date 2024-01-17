import java.util.Scanner;
public class Switch {
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select letter to show colour (R,G,B): ");
            String colourPallet = scanner.nextLine().trim().toUpperCase();
            switch (colourPallet) {
                case "R" -> System.out.println("RED");
                case "G" -> System.out.println("GREEN");
                case "B" -> System.out.println("BLUE");
                default  -> System.out.println("Wrong letter. Try again.");
            }
        }
    }
    public static void main(String[] args) {
        String pickColour = getColour();
    }
}