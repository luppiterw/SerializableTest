package main.java.utils;

import javafx.util.Pair;

import java.util.*;

/**
 * Created by hughie on 2017/4/3.
 * Container util
 */
public final class ContainerUtil {
    /**
     * For HashTable
     * */
    public final static class SpaceHashTable {
        /**
         * HashTable - 01. Get list by enumeration-keys mode
         * Attention: Can be replaced by Iterator functions
         */
        @SuppressWarnings("unchecked")
        public static <K, V> List<Pair<K, V>> getHashTableListByEnumerationMode(Hashtable<K, V> hashTable) {
            List<Pair<K, V>> resultList = new ArrayList<>();
            Enumeration enumeration = hashTable.keys();
            while(enumeration.hasMoreElements()) {
                K key = (K)enumeration.nextElement();
                resultList.add(new Pair<>(key, hashTable.get(key)));
            }
            return resultList;
        }
        /**
         * HashTable - 02. Get list by iterator-keys mode
         */
        @SuppressWarnings("unchecked")
        public static <K, V> List<Pair<K, V>> getHashTableListByIteratorMode(Hashtable<K, V> hashTable) {
            List<Pair<K, V>> resultList = new ArrayList<>();
            for (Object key : hashTable.keySet()) {
                resultList.add(new Pair<>((K)key, hashTable.get(key)));
            }
            return resultList;
        }
        /**
         * HashTable - 03. Get list by map.entry-keys mode
         * Most efficient, especially when dealing with masses of data!
         */
        @SuppressWarnings("unchecked")
        public static <K, V> List<Pair<K, V>> getHashTableListByMapEntryMode(Hashtable<K, V> hashTable) {
            List<Pair<K, V>> resultList = new ArrayList<>();
            Set<Map.Entry<K, V>> entrySet = hashTable.entrySet();
            for(Map.Entry entry : entrySet) {
                resultList.add(new Pair<>((K)entry.getKey(), (V)entry.getValue()));
            }
            return resultList;
        }
    }

}
