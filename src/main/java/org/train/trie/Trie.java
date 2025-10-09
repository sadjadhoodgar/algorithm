package org.train.trie;

/**
 * LeetCode #208 - Implement Trie (Prefix Tree)
 * Link: <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">...</a>
 */
public class Trie {

    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode tmp = root;

        for (char c : word.toCharArray()) {
            if (!tmp.children.containsKey(c)) {
                tmp.children.put(c, new TrieNode());
            }
            tmp = tmp.children.get(c);
        }
        tmp.isWord = true;
    }

    public boolean search(String word) {
        TrieNode tmp = root;

        for (char c : word.toCharArray()) {
            if (!tmp.children.containsKey(c)) {
                return false;
            }
            tmp = tmp.children.get(c);
        }

        return tmp.isWord;
    }

    public boolean startsWith(String word) {
        TrieNode tmp = root;

        for (char c : word.toCharArray()) {
            if (!tmp.children.containsKey(c)) {
                return false;
            }
            tmp = tmp.children.get(c);
        }

        return true;
    }
}
