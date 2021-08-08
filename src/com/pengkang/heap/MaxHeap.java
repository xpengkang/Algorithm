package pengkang.heap;


public class MaxHeap<Item> {

    private Item[] data;
    private int count;
    private int capacity;

    // 构造函数, 构造一个空堆, 可容纳capacity个元素
    public MaxHeap(int capacity){
        data = (Item[])new Comparable[capacity+1];
        count = 0;
        this.capacity = capacity;
    }

    // 返回堆中的元素个数
    public int size(){
        return count;
    }

    // 返回一个布尔值, 表示堆中是否为空
    public boolean isEmpty(){
        return count == 0;
    }
    //********************
    //* 最大堆核心辅助函数
    //********************
    public void add(Item item){
        assert count +1 <= capacity;
        data[count +1] = item;
        count ++;
        shiftUp(count);

    }
    //********************
    //* 最大堆核心辅助函数
    //********************
    private void shiftUp(int k){
        while(k>0 && data[k/2].compareTo(data[k])<0){
            swap(k,k/2);
            k /= 2;
        }
    }

    private void swap(int i ,int j){
        Item t = data[i];
        data[i] = data[j];
        data[j] = t;
    }


    public Item poll(){
        assert count >0;
        Item res = data[1];

        swap(1,count);
        count--;
        shiftDown(1);

        return res;
    }
    //删除元素，count --
    //shift down ,先把最后一个元素放在root ，然后维持最大堆，
    //像下调整，到满足最大堆性质结束
    //左右孩子，哪个大，就和哪个交换
    private void shiftDown(int k){
        while(2*k <= count){//有左孩子，
            int j = 2*k;
            if(j+1 <= count && data[j+1].compareTo(data[j])>0){
                //有右孩子，并且右孩子大于左孩子
                j += 1;
            }

            if(data[k].compareTo(data[j]) >= 0){
                break;//已经是最大堆了
            }

            swap(k,j);
            k = j;//更新k

        }
    }

    public Item getMax(){
        assert (count >0);
        return data[1];
    }


    // 测试 MaxHeap
    public static void main(String[] args) {

        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(100);
        System.out.println(maxHeap.size());
    }
}