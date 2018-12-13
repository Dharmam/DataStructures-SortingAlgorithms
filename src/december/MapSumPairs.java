package december;

import utils.Trie;

import javax.xml.transform.TransformerException;

public class MapSumPairs {

    static Trie root = new Trie('*');

    public static void main(String args[]){

        insert("as");
        insert("an");
        insert("and");
        insert("bad");
        insert("bat");

        System.out.println("****");
    }

    private static void insert(String string) {
        Trie parent = root;
        for(char c : string.toCharArray()){
            if(parent.getChildren().get(c)==null){
                Trie child = new Trie(c) ;
                child.setPrefix(parent.getPrefix()+c);
                parent.getChildren().put(c, child);
            }
            System.out.print(parent.getVal() + "->" );
            parent = parent.getChildren().get(c) ;
        }

        parent.setWord(true);
        System.out.println(parent.getVal() + ".");
    }
}
