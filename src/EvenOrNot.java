public class EvenOrNot {
    public static void main(String[] args) {
        // Generating a random number between 1 and 100
        int randomNumber = (int)(Math.random() * 100) + 1; 
        System.out.println("Random number generated between 1 and 100: " + randomNumber);

        // Checking if the number is even or odd 
        if (randomNumber % 2 == 0) {
            System.out.println("The number " + randomNumber + " is EVEN (divisible by 2).");
        } else {
            System.out.println("The number " + randomNumber + " is ODD (not divisible by 2).");
        }

    }
}
