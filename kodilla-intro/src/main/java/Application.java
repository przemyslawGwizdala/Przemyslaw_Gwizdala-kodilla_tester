public class Application {
    double age;
    double height;

    public Application(double age, int height) {
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args) {

        Application adam = new Application(40.5, 178);
        System.out.println("Username: Adam");
        System.out.println("Age:" + adam.age + " " + "Height:" + adam.height);
    }

    public void checkInformation() {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}