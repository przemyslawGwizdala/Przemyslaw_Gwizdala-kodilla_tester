public class LeapYear {
    public static void main(String[] args) {
        int yearExample = 2001;
        int a = 4;
        int b = 100;
        int c = 400;

        int result1 = yearExample % a;
        int result2 = yearExample % b;
        int result3 = yearExample % c;


        if (result1 == 0) {
            System.out.println("Rok jest przestępny!");
        } else {
            System.out.println("Rok nie jest przestępny!");
        }

        if (result2 == 0) {
            System.out.println("Rok jest przestępny!");
        } else {
            System.out.println("Rok nie jest przestępny!");
        }

        if (result3 == 0) {
            System.out.println("Rok jest przestępny!");
        } else {
            System.out.println("Rok nie jest przestępny!");
        }



    }
}