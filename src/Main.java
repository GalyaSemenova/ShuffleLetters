import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Word word = new Word();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your sentence only on latin:");
        Sentence sentence = new Sentence(scanner.nextLine());

        String[] words = sentence.getWordList();

        for (int i = 0; i < words.length; i++) {
            word.shuffleLetters(words[i]);
        }
    }
}
