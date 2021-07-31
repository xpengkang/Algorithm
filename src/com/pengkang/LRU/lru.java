// class LRUCache {


//     public LRUCache(int capacity) {

//     }

//     public int get(int key) {

//     }

//     public void put(int key, int value) {

//     }
// }

import java.util.HashMap;
import java.util.Map;

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//L146
class LRUCache {

    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap();
    int capacity;

    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            remove(map.get(key));
        }
        if(map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node){
        map.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }

    class Node{
        Node prev, next;
        int key, value;
        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }
}


//0731
class LRUCache {

    class Node{
        Node next,prev;
        int key,value;//存储key, value;

        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int size;

    public LRUCache(int capacity) {
        this.size = capacity;
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        //判断有么有key
        if(map.containsKey(key)){
            Node node = map.get(key);//一定要指明node, 不然空指针异常
            //移动
            remove(node);//map中去除node,链表中移除
            insert(node);//插入到头部

            return node.value;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            //移动
            remove(node);//map中去除node,链表中移除
            // insert(map.get(key));//插入到头部

            // return map.get(key).value;
        }
        if(map.size() == size){
            //满了
            remove(tail.prev);//移除尾部

        }

        //插入头部
        insert(new Node(key, value));



    }

    private void remove (Node node){
        //map中删除
        map.remove(node.key);
        //链表中删除
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert (Node node){
        //map中加入
        map.put(node.key, node);
        //链表中加入头部
        node.next = head.next;//node 后
        node.next.prev = node;//node.next 前
        node.prev = head;
        head.next = node;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

