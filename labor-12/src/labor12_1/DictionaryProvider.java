package labor12_1;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType type){
        IDictionary dictionary = null;
        switch (type){
            case ARRAY_LIST -> {
                dictionary = ArrayListDictionary.newInstance();
            }
            case HASH_SET -> {
                dictionary = HashSetDictionary.newInstance();
            }
            case TREE_SET -> {
                dictionary = TreeSetDictionary.newInstance();
            }
        }
        return dictionary;
    }
}
