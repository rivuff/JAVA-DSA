package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kPairswithSamllestSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> pq = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        int n = nums1.length;
        int m = nums2.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int sum = nums1[i] + nums2[j];

                if (pq.size() < k) {
                    pq.offer(new Pair<>(sum, new Pair<>(nums1[i], nums2[j])));
                } else if (sum < pq.peek().getKey()) {

                    pq.poll();
                    pq.offer(new Pair<>(sum, new Pair<>(nums1[i], nums2[j])));

                } else {
                    break;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair<Integer, Integer> pair = pq.poll().getValue();
            List<Integer> pairList = new ArrayList<>();
            pairList.add(pair.getKey());
            pairList.add(pair.getValue());
            ans.add(pairList);
        }

        return ans;


    }

    public class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }


}



