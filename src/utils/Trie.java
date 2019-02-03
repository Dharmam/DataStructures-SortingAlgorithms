package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Trie {

    char val;
    String prefix;
    boolean isWord = false;
    HashMap<Character,Trie> children ;


    public Trie(char val) {
        this.val = val;
        this.prefix = "";
        this.isWord = false;
        this.children = new HashMap<>();
    }

    public char getVal() {
        return val;
    }

    public void setVal(char val) {
        this.val = val;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public HashMap<Character,Trie> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character,Trie> children) {
        this.children = children;
    }
}
