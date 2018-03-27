package lesson15.hashtable;

import lesson15.singlelist.LinkedBookList;

public class MyHashTable implements HashTable {
    private final static int SIZE = 255;
    private LinkedBookList[] table;

    public MyHashTable() {
        table = new LinkedBookList[SIZE];
    }

    @Override
    public void push(String key, Book book) {
        int h = getHash(key);
        if (table[h] == null) {
            LinkedBookList list = new LinkedBookList();
            list.add(new Pair(key, book));
            table[h] = list;
            return;
        }

        table[h].add(new Pair(key, book));
    }

    @Override
    public boolean delete(String key) {
        int h = getHash(key);
        if (table[h] == null) {
            return false;
        }

        LinkedBookList list = table[h];
        list.remove(key);
        if (list.getFirst() == null) {
            table[h] = null;
        }
        return true;
    }

    @Override
    public Book get(String key) {
        int h = getHash(key);

        if (table[h] == null) {
            return null;
        }

        LinkedBookList list = table[h];

        if (list.getSize() == 1) {
            return list.getFirst().getPair().getValue();
        }

        LinkedBookList.Node result = list.find(key);

        return result == null ? null : result.getPair().getValue();
    }

    private int getHash(String key) {
        int s = key.length();
        if (s > SIZE ) {
            System.out.println("Size of hash is more than default value(255)");
            System.exit(-1);
        }
        return s;
    }

}
