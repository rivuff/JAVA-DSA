package HashMap;

import java.util.ArrayList;
import java.util.List;

public class MyMap<k,v> {
    private List<MapNode<k, v>> bucket;
    private int capacity; //length of the bucket
    private int size; // number of element in the map
    private final int INITIAL_CAPACITY = 5; //initial length of the bucket

    public MyMap(){
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for(int i = 0;i<capacity;i++){
            bucket.add(null);
        }
    }

    public int getBucketIndex(k key){
        int hashcode = key.hashCode();
        /* every object in java has his parent as object class
         and in the object class there is a function implemented
         as hashcode which is basically the memory address of that object.
        */
        return hashcode % capacity;
    }

    public v get(k key){
        int bucketIndex = getBucketIndex(key);
        MapNode<k,v> head = bucket.get(bucketIndex);
        while (head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void put(k key, v value){
        int bucketIndex = getBucketIndex(key);
        MapNode<k, v> head = bucket.get(bucketIndex);

        while(head !=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        MapNode<k,v> newEntry = new MapNode<k,v>(key , value);
        head = bucket.get(bucketIndex);
        newEntry.next = head;
        bucket.set(bucketIndex, newEntry);

    }

    public void remove(k key){
        int bucketIndex = getBucketIndex(key);
        MapNode<k, v> head = bucket.get(bucketIndex);
        MapNode<k, v> prev = null;

        while (head!=null){
            if(head.key.equals(head)){
                if(prev==null){
                    bucket.set(bucketIndex, head.next);
                }else {
                    prev.next = head.next;
                }
                head.next= null;
                size--;
                break;
            }
            prev = head;
            head = head.next;
        }
    }

    private class MapNode<k, v>{
        k key;
        v value;
        MapNode<k,v> next;

        public MapNode(k key, v value){
            this.key = key;
            this.value = value;
        }
    }
}
