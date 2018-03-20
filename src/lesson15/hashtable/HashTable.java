package lesson15.hashtable;

public interface HashTable {
    void push(String key, Book book);

    boolean delete(String key);

    Book get(String key);
}
