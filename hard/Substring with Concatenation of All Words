class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
            int n = s.length(), m = words.length, w = words[0].length();
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
            for (int i = 0; i < w; i++) {
                int left = i, right = i, count = 0;
                Map<String, Integer> tmp = new HashMap<>();
                while (right + w <= n) {
                    String str = s.substring(right, right + w);
                    right += w;
                    if (!map.containsKey(str)) {
                        count = 0;
                        left = right;
                        tmp.clear();
                    } else {
                        tmp.put(str, tmp.getOrDefault(str, 0) + 1);
                        count++;
                        while (tmp.getOrDefault(str, 0) > map.getOrDefault(str, 0)) {
                            String str1 = s.substring(left, left + w);
                            left += w;
                            tmp.put(str1, tmp.get(str1) - 1);
                            count--;
                        }
                        if (count == m) ans.add(left);
                    }
                }
            }
            return ans;
    }
}
