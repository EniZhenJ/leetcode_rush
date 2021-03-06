package techniques.sliding_window.substring_with_concatenation_of_all_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: AC1
 * @Description: 30. 串联所有单词的子串
 * @Author: 琦玉
 * @Date: 2022年06月23日 11:37:00
 */
public class AC1 {

    /**
     * 30. 串联所有单词的子串
     * 给定一个字符串 s 和一些 长度相同 的单词 words 。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
     * <p>
     * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符 ，但不需要考虑 words 中单词串联的顺序。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
     * 输出：[0,9]
     * 解释：
     * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
     * 输出的顺序不重要, [9,0] 也是有效答案。
     * 示例 2：
     * <p>
     * 输入：s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
     * 输出：[]
     * 示例 3：
     * <p>
     * 输入：s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
     * 输出：[6,9,12]
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= s.length <= 10^4
     * s 由小写英文字母组成
     * 1 <= words.length <= 5000
     * 1 <= words[i].length <= 30
     * words[i] 由小写英文字母组成
     */
    static class Solution {
        public static List<Integer> findSubstring(String s, String[] words) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.merge(word, 1, Integer::sum);
            }
            int len = words[0].length();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.length() - i >= len) {
                    Map<String, Integer> copyMap = new HashMap<>(map);
                    int j = i;
                    while (!copyMap.isEmpty() && j + len <= s.length()) {
                        String s1 = s.substring(j, j + len);
                        Integer count = copyMap.get(s1);
                        if (count == null) {
                            break;
                        }
                        if (count == 1) {
                            copyMap.remove(s1);
                        } else {
                            copyMap.put(s1, count - 1);
                        }
                        j += len;
                    }
                    if (copyMap.isEmpty()) {
                        list.add(i);
                    }
                }
            }
            return list;
        }

        public static void main(String[] args) {
            System.out.println(findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}));
        }
    }
}
