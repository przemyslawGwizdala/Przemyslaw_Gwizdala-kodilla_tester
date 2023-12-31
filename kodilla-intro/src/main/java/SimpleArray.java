public class SimpleArray {
    public static void main(String[] args) {
        String[] example = new String[5];
        example[0] = "The Lord of the Rings: The Fellowship of the Ring";
        example[1] = "The Lord of the Rings: The Two Towers";
        example[2] = "The Lord of the Rings: The Return of the King";
        example[3] = "Hobbit";
        example[4] = "STAR WARS";

        String movie = example[3];
        System.out.println(movie);

        int numberOfElements = example.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów!");
    }
}