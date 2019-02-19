public class IntegerSet {
    int size =0;

    public void insert(Integer num){
        size++;
    }
    public void remove(Integer num){
        size--;
    }
    public int size(){
        return size;
    }
    public boolean contain(Integer num){
        return false;
    }
}
