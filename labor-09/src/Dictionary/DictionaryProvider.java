package Dictionary;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType type){
        IDictionary dictionary = null;
        switch (type){
            case ARRAY_LIST -> {
                dictionary = ArrayListDictionary.newInstance();
            }
        }
        return dictionary;
    }
}
