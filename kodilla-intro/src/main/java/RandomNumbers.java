import java.util.Random;

public class RandomNumbers {
    private int minRandomValue;
    private int maxRandomValue;

    public RandomNumbers() {
        this.minRandomValue = Integer.MAX_VALUE;
        this.maxRandomValue = Integer.MIN_VALUE;
    }

    public void generateRandomNumbersUntilSumExceedsTarget(int maxSum) {
        Random random = new Random();
        int sum = 0;

        while (sum < maxSum) {
            int randomNumber = random.nextInt(31);
            sum += randomNumber;
            updateMinMaxValues(randomNumber);
        }
    }

    private void updateMinMaxValues(int randomNumber) {
        if (randomNumber < minRandomValue) {
            minRandomValue = randomNumber;
        }
        if (randomNumber > maxRandomValue) {
            maxRandomValue = randomNumber;
        }
    }

    public int getMinRandomValue() {
        return minRandomValue;
    }

    public int getMaxRandomValue() {
        return maxRandomValue;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateRandomNumbersUntilSumExceedsTarget(5000);

        System.out.println("Min Random Value: " + randomNumbers.getMinRandomValue());
        System.out.println("Max Random Value: " + randomNumbers.getMaxRandomValue());
    }
}