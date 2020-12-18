package chapter8;

public class TextProcessor {

    public static void main (String[] args){
        //countWords("Lord Jesus, Please help me!");
        //reverseString("hello world");
        //addSpaces("HelloWhatsUP");
        passwordStrength("password", "password", "test");
    }

    /**
     * Splits the String into an array by tokenizing it
     * Counts and Prints them
     * @param test Full String to be Split
     */
    public static void countWords(String test){
        String[] splitString = test.split(" ");

        int numberOfWOrds = splitString.length;
        String message = String.format("Your Text contains %d words:", numberOfWOrds);
        System.out.println(message);
        for(String a : splitString){
            System.out.println(a);
        }

        for(int a = 0; a<numberOfWOrds; a++)
            System.out.println(splitString[a]);
    }

    /**
     * Prints a string in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i= text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Add space before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        StringBuilder newText = new StringBuilder(text);
        for(int i=0; i<newText.length(); i++){
            if(Character.isUpperCase(newText.charAt(i)) && i !=0){
                newText.insert(i, " ");
                i++;
            }
        }
        System.out.println(newText);
        newText.reverse();
        System.out.println(newText);
    }

    /**
     *
     * @param newPassword
     * @param userName
     * @param currentPassword
     */
    public static void passwordStrength(String newPassword, String userName, String currentPassword){
        if(newPassword.equalsIgnoreCase(userName) || newPassword.equalsIgnoreCase(currentPassword) ){
            System.out.println("New Password same as username or current password");
        }
        else if(newPassword.length() < 8){
            System.out.println("Minimum length is 8 characters");
        }
        else if(!hasUpperCaseLetter(newPassword)){
            System.out.println("Password must contain least one uppercase letter");
        }
        else if(!hasSpecialCharacter(newPassword)){
            System.out.println("Password must contain least one uppercase letter");
        }
        else{
            System.out.println("Password is Valid!");
        }
    }

    public static boolean hasUpperCaseLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
