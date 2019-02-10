package february;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author dbuch
 *
 *         929. Unique Email Addresses Easy
 * 
 *         313
 * 
 *         82
 * 
 *         Favorite
 * 
 *         Share Every email consists of a local name and a domain name,
 *         separated by the @ sign.
 * 
 *         For example, in alice@leetcode.com, alice is the local name, and
 *         leetcode.com is the domain name.
 * 
 *         Besides lowercase letters, these emails may contain '.'s or '+'s.
 * 
 *         If you add periods ('.') between some characters in the local name
 *         part of an email address, mail sent there will be forwarded to the
 *         same address without dots in the local name. For example,
 *         "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same
 *         email address. (Note that this rule does not apply for domain names.)
 * 
 *         If you add a plus ('+') in the local name, everything after the first
 *         plus sign will be ignored. This allows certain emails to be filtered,
 *         for example m.y+name@email.com will be forwarded to my@email.com.
 *         (Again, this rule does not apply for domain names.)
 * 
 *         It is possible to use both of these rules at the same time.
 * 
 *         Given a list of emails, we send one email to each address in the
 *         list. How many different addresses actually receive mails?
 */
public class UniqueEmailAddresses {

	public static void main(String[] args) {
		System.out.println(numUniqueEmails(new String[] { "test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" }));
	}

	static int numUniqueEmails(String[] emails) {
		HashMap<String, Set<String>> map = new HashMap<>();

		for (String s : emails) {
			String key = s.substring(s.indexOf('@') + 1, s.length());
			StringBuilder sb = new StringBuilder(s.substring(0, s.indexOf('@')));
			while (sb.indexOf(".") != -1)
				sb.deleteCharAt(sb.indexOf("."));
			
			if (sb.indexOf("+") != -1)
				sb.replace(sb.indexOf("+"), sb.length(), "");

			Set<String> set = null;
			if (map.get(key) != null)
				set = map.get(key);
			else
				set = new HashSet<>();

			set.add(sb.toString());
			map.put(key, set);

		}

		int count = 0;
		for (String s : map.keySet()) {
			count += map.get(s).size();
		}
		return count;
	}
}
