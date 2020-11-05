public class Sentence {
    private String sentence;

    Sentence(String str) {
        sentence = str;
    }

    public String[] getWordList() {
        String[] words;

        words = sentence.split("\\s");

        return words;
    }
}
