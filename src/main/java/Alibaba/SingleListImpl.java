package Alibaba;

public class SingleListImpl implements SingleList{

    SingleListNode head;
    SingleListNode tail;
    @Override
    public void print() {
        SingleListNode node = head;
        System.out.print("(");
        while ( node != null){
            System.out.print(node.getItem());
            System.out.print(" ");
            node = node.getNext();
        }
        System.out.print(")");
    }

    @Override
    public void push(int n) {
        if(this.head == null) { //第一个元素
            head = new SingleListNode(n);
            tail = head;
        }else {
            tail.setNext(new SingleListNode(n));
            tail = tail.getNext();
        }
    }

    @Override
    public void sort() {
       // bubulSort();
        quickSort(head,tail);
    }
    private void bubulSort(){
       // SingleListNode node1 = head;
        SingleListNode node2 ;
        SingleListNode node3 = tail; //后边界
        while (node3 != head){
            node2  = head;
            while (node2 != node3){

                if(node2.getItem() > node2.getNext().getItem()) swap(node2,node2.getNext());


                if(node2.getNext() == node3) node3 = node2;
                else node2 = node2.getNext();
            }

        }
    }
    //对[left,right]范围排序
    private void quickSort(SingleListNode left,SingleListNode right){
        if(left == right || right.getNext()==left) return;

        SingleListNode mid = partition(left,right);
        quickSort(left,mid);
        quickSort(mid.getNext(),right);
    }
    private SingleListNode partition(SingleListNode left,SingleListNode right){
        int key = tail.getItem();
        SingleListNode keyPos = head;
        for(SingleListNode node = head;node!=null;node=node.getNext()) {
            if (node.getItem() < key) keyPos = keyPos.getNext();
        }
        //key置于正确位置
        swap(keyPos,tail);

        SingleListNode node1 = head;
        SingleListNode  node2 = keyPos.getNext();
        while (node2!=null){
            while (node1.getItem()<key) node1 = node1.getNext();
            while (node2 != null && node2.getItem() > key) node2 = node2.getNext();
            if(node2 != null) swap(node1,node2);
        }
         return keyPos;
    }
    private void swap(SingleListNode node1,SingleListNode node2){
        int tmp  = node1.getItem();
        node1.setItem(node2.getItem());
        node2.setItem(tmp);
    }
    private void preN(SingleListNode node,int times){
        for(int i=0;i<times;i++){
            node  = node.getNext();
        }
    }


}
