// import the required java classes
import java.security.SecureRandom;

// Main file class
public class generator {
    // make this const
    private  final SecureRandom RANDOM = new SecureRandom();
    // Make a string methods
    public  String generateRandomPassword(int length) {
        StringBuilder password = new StringBuilder(length);

        // At least one uppercase letter
        String CAPITALLETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        password.append(CAPITALLETTERS.charAt(RANDOM.nextInt(CAPITALLETTERS.length())));
        // At least one lowercase letter
        String SMALLLETTERS = "abcdefghijklmnopqrstuvwxyz";
        password.append(SMALLLETTERS.charAt(RANDOM.nextInt(SMALLLETTERS.length())));
        // At least one digit
        String DIGITS = "012345678910";
        password.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        // At least one special character
        String SYMBOLES = "!@#$%^&*()_-+=`~{}[];: | <>,. ?/";
        password.append(SYMBOLES.charAt(RANDOM.nextInt(SYMBOLES.length())));

        // Remaining characters randomly selected from all characters
        for (int i = 4; i < length; i++) {
            String ALLCHARS = CAPITALLETTERS + SMALLLETTERS + DIGITS + SYMBOLES;
            password.append(ALLCHARS.charAt(RANDOM.nextInt(ALLCHARS.length())));
        }

        // Shuffle the characters in the password
        return shuffleString(password.toString());
    }
    // convert all input to an array
    private  String shuffleString(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int randomIndex = RANDOM.nextInt(charArray.length);
            char temp = charArray[i];
            charArray[i] = charArray[randomIndex];
            charArray[randomIndex] = temp;
        }
        //return array
        return new String(charArray);
    }
}
