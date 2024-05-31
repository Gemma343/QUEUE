public class LinkedCircularQueue<E> implements CircularQueue<E>{

    private CircularLinkedList<E> list = new CircularLinkedList<>();

    public LinkedCircularQueue(){}

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void enqueue(E element){
        list.addLast(element);
    }

    public E first(){
        return list.first();
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public void rotate(){
        list.rotate();
    }

}
