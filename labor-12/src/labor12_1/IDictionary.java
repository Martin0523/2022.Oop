package labor12_1;

public interface IDictionary {

    public static final String DICTIONARY_FILE = new String();

    boolean add(String newWord);
    boolean find(String word);
    int size();
}
