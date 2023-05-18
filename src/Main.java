import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
        System.out.println(toCamelCase("java_programming_language"));
        System.out.println(toCamelCase("openAI_is_awesome"));

    }

    static String toCamelCase(String s) {
        StringBuilder convertedWord = new StringBuilder();
        String []parts  = s.split("[-_ ]");;

        for (int i = 0; i < parts .length; i++) {
            String part = parts [i];
            if (i == 0 ){
                convertedWord.append(part);
            }else {
                convertedWord.append(Character.toUpperCase(part.charAt(0)));
                if (part.length()>1){
                    convertedWord.append(part.substring(1));
                }
            }
        }

  return  convertedWord.toString();
    }
}


