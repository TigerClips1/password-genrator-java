// Main code class
public class Main {
    public static void main(String[] args) {
        // call the class
        generator passWords = new generator();
        // Generate a random password with a length of 12 characters
        String randomPassword = passWords.generateRandomPassword(12);
        System.out.println("Random Password: " + randomPassword);
        }
    }