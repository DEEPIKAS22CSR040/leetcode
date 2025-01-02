/*class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int a[]=new int[queries.length];
        List<Character> l1=Arrays.asList('a','e','i','o','u');
        for(int i=0;i<queries.length;i++)
        {
            int c=0;
            int l=queries[i][0];
            int r=queries[i][1];
            for(int j=l;j<=r;j++)
            {
                char s=words[j].charAt(0);
                char e=words[j].charAt(words[j].length()-1);
                if(l1.contains(s) && l1.contains(e))
                c++;
                a[i]=c;

            }
        } 
        return a;       
    }
}*/

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] Prefix = new int[n + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            Prefix[i + 1] = Prefix[i];
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                Prefix[i + 1]++;
            }
        }

        int[] ANS = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ANS[i] = Prefix[queries[i][1] + 1] - Prefix[queries[i][0]];
        }
        return ANS;
    }
}