package BaekJoonAlgorithm.우선순위큐;

import java.util.*;

public class 접두사찾기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Trie trie = new Trie();

        for (int i = 0; i < n; i++) {
            trie.insert(sc.next());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (trie.startsWith(sc.next())) count++;
        }
        System.out.println(count);

    }

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;

        public TrieNode() {
            isEndOfWord = false;
        }
    }

    static class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;

            for (char c : word.toCharArray()) {
                int index = c - 'a';

                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }

                node = node.children[index];
            }
            node.isEndOfWord = true;
        }

        public boolean startsWith(String prefix) {
            TrieNode node = root;

            for (char c : prefix.toCharArray()) {
                int index = c - 'a';

                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }

            return true;
        }
    }
}
