import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.PriorityQueue;

class frequencySort {
    public static void main(String[] args) {
        frequencySort("tree");
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new Hashtable<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        StringBuilder ans = new StringBuilder();
        PriorityQueue<pair> maxHeap = new PriorityQueue<>();

        for (char ch : map.keySet())
            maxHeap.add(new pair(map.get(ch), ch));

        while (maxHeap.size() > 0) {
            pair p = maxHeap.poll();

            for (int i = 0; i < p.count; i++) {
                ans.append(p.ch);
            }
        }

        return ans.toString();
    }
}

class pair implements Comparable<pair> {
    int count;
    char ch;

    public pair(int count, char ch) {
        this.count = count;
        this.ch = ch;
    }

    @Override
    public int compareTo(pair o1) {
        // TODO Auto-generated method stub
        return o1.count - this.count;
    }

}