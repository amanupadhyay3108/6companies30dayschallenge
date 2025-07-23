import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class phoneDirectory {
    // User function Template for Java
    public static void main(String[] args) {
        phoneDirectory solution = new phoneDirectory();
        String[] contacts = {"alice", "bob", "charlie", "dave"};
        String searchString = "al";
        ArrayList<ArrayList<String>> result = solution.displayContacts(contacts.length, contacts, searchString);
        System.out.println(result); // Output the matching contacts
    }       
    static ArrayList<ArrayList<String>> displayContacts(int n, String contact[],
                                                        String s) {
        // code here
      TreeSet<String> contactSet = new TreeSet<>(Arrays.asList(contact));
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        String prefix = "";
        for (int i = 0; i < s.length(); i++) {
            prefix += s.charAt(i);
            ArrayList<String> matchList = new ArrayList<>();

            for (String name : contactSet) {
                if (name.startsWith(prefix)) {
                    matchList.add(name);
                }
            }

            if (matchList.isEmpty()) {
                matchList.add("0");
            }

            ans.add(matchList);
        }

        return ans;
    }
}

