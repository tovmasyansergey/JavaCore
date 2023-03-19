package classwork.classwork26;

public class Storage<T> {


    Object[] objects = new Object[10];
    int size;
    public void add(T obj){
        if (objects.length == size){
            extend();
        }
        objects[size++] = obj;
    }
    public T getByIndex(int index){
        return(T) objects[index];
    }
public void print(){
    for (int i = 0; i < size; i++) {
        System.out.println(objects[i]);
    }
}
public void extend(){
        Object[] temp = new Object[objects.length+ 10];
        System.arraycopy(objects,0,temp,0,size);
}
}
