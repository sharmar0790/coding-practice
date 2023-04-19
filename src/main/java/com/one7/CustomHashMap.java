package com.one7;

public class CustomHashMap {

    public static void main(String[] args) {
        CHashMap<String, Integer> map = new CHashMap<>();
        map.put("a", 1);

        Integer r = map.get("a");
        System.out.println(r);

        r = map.get("a1");
        System.out.println(r);
    }
}

class CHashMap<K, V> {

    private final Entry<K, V>[] entries;
    private int capacity = 10;
    private int size;

    public CHashMap() {
        this.size = 0;
        this.entries = new Entry[capacity];
    }

    public CHashMap(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.entries = new Entry[capacity];
    }

    public V get(K key) {
        if (size <= 0) return null;

        for (Entry<K, V> entry : entries) {
            if (entry != null && entry.getKey().equals(key)) {
                return entry.getVal();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        if (size == capacity) {
            throw new ArrayIndexOutOfBoundsException(size);
        }
        Entry<K, V> entry = new Entry<>(key, value);
        entries[size++] = entry;
    }

    static class Entry<K, V> {
        private final K key;
        private final V val;

        public Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }

        public K getKey() {
            return key;
        }

        public V getVal() {
            return val;
        }
    }
}

