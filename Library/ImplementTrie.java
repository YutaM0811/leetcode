import java.util.*;

class Trie {
    private Set<String> set = new HashSet<>();
    
    public Trie() {
        set.clear();
    }
    
    public void insert(String word) {
        set.add(word);
    }
    
    public boolean search(String word) {
        return set.contains(word);
    }
    
    public boolean startsWith(String prefix) {
       List<String> list = set.stream()
            .filter(s->s.startsWith(prefix))
            .collect(Collectors.toList());
       return list.size()>0;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
