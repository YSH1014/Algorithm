package Alibaba;

public class SingleListNode {
    private int  item;
    private SingleListNode next;

    public SingleListNode(int item){
        this.item = item;
    }
    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public SingleListNode getNext() {
        return next;
    }

    public void setNext(SingleListNode next) {
        this.next = next;
    }

}
