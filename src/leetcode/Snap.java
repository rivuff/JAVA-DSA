package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snap {
    public static void main(String[] args) {
        SnapshotArray snap = new SnapshotArray(4);

        snap.set(0,5);
        snap.snap();
        snap.set(0,6);
        snap.get(0,0);
    }
}

class SnapshotArray {
    int[] arr;
    List<int[]> list;
    public SnapshotArray(int length) {
        arr = new int[length];
        list = new ArrayList<>();
    }

    public void set(int index, int val) {
        arr[index]=val;
    }

    public int snap() {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        list.add(arr2);
        return list.size()-1;
    }

    public int get(int index, int snap_id) {
        int[] sol = list.get(index);
        return sol[snap_id];
    }
}