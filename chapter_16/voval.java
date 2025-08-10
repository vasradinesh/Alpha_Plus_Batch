public class voval {
    public static void main(String[] args) {
        String input = "chatgpt";
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".contains(ch + ""))
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);
    }

}
