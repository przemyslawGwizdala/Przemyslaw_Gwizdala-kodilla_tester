public class Username {
    double age;
    double height;

    public Username(double age, int height) {
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args) {

        Username adam = new Username(40.5, 178);
        System.out.println("Username: Adam");
        System.out.println("Age:" + adam.age + " " + "Height:" + adam.height);
        adam.checkInformation();
    }

    public void checkInformation() {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }


}