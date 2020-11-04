import java.util.Random;

public class Word {

    public void shuffleLetters(String word) {
        Log log = new Log();
        Random random = new Random();

        for ( String w : word.split("(?<!^)\\b") ) {
            char[] letters = w.toCharArray();
            for ( int i = 1; i < letters.length - 1; ++i ) {
                
                int j = random.nextInt(letters.length - 2) + 1;

                char t = letters[i];
                letters[i] = letters[j];
                letters[j] = t;
            }
            log.out(new String(letters) + " ");
        }
    }
}
