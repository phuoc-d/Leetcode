import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_sort = s.toCharArray();
        char[] t_sort = t.toCharArray();

        Arrays.sort(s_sort);
        Arrays.sort(t_sort);

        System.out.println(s_sort);
        System.out.println(t_sort);

        String sf = new String(s_sort);
        String tf = new String(t_sort);

        return sf.equals(tf);
    }
}