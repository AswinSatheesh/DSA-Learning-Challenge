//source : Brototype DSA tutorial Part -16 
//SUffiix-Trie-Problem

package Trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    static class TrieNode{
        Map<Character, TrieNode > children = new HashMap<>(); //Key value pair format. in place of key we use "Character" and in place of value we use "TrieNode"  and created a variable "children"
    }

    TrieNode root = new TrieNode(); //created a root
    char endSymbol = '*'; // ending symbol *

    public Trie(String str){ //This is a constructor
        populateSuffixTrie(str); //calling a function
    }

    public void populateSuffixTrie(String str){ 
        for(int i = 0; i < str.length(); i++){ //This loop will give us the postion and remainig of the words of the string.
            insertSubstringStartingAt(i, str);
        }
    }

    public void insertSubstringStartingAt(int index, String str){
        TrieNode  node  = root;
        for(int i = index; i < str.length(); i++){
            char letter = str.charAt(i); //This will store the character based on the index - for that purpose we use charAt()
            if(!node.children.containsKey(letter)){ //if letter is not there then this will work
                TrieNode newNode = new TrieNode(); 
                node.children.put(letter, newNode);
            }
               node = node.children.get(letter);
        }
        node.children.put(endSymbol, null);
    }

    public boolean contains(String str){ // To check whether the word is present or not.
        TrieNode node = root;
        for(int i = 0; i < str.length(); i++){
            char letter =  str.charAt(i);
            if(!node.children.containsKey(letter)){  //it means word is not there
                return false; 
            }
            node = node.children.get(letter); //if word is there this will work.
        }
        return node.children.containsKey(endSymbol);
    }


    public static void main(String[] args) {
        Trie trie = new Trie("mannan");
        System.out.println(trie.contains("nan"));  //This is where we are checking that word is in the Trie or not.
        System.out.println(trie.contains("nnan"));
        System.out.println(trie.contains("n"));
    }
    
}
