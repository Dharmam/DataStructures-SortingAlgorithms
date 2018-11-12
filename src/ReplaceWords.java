import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReplaceWords {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("cat");
		list.add("bat");
		list.add("rat");

		System.out.println(replaceWords(list, "the cattle was rattled by the battery"));
		
		list.clear();
		
		list.add("a");
		list.add("b");
		list.add("c");

		System.out.println(replaceWords(list,  "aadsfasf absbs bbab cadsfafs"));
		
		list.clear();
		
		list.add("a");
		list.add("aa");
		list.add("aaa");
		list.add("aaaa");

		System.out.println(replaceWords(list, "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"));

	}
	
	static String replaceWords(List<String> dict, String sentence) {
        for(String word : sentence.split(" ")) {
        	for(String dictWord : dict) {
        		if(word.indexOf(dictWord)==0 ) {
        			sentence = sentence.replaceFirst(word, dictWord);
        			break;
        		}
        	}
        }
        return sentence;
    }

}
