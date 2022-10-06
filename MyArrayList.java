package earphoneobject;

/**
 *
 * @author Zinhle
 */
public class MyArrayList<E> {
    private int size;
    private final E[] data;
    private int MAXELEMENTS=100;
    
    /*create empty list*/
    public MyArrayList(){
        data= (E[])new Object[MAXELEMENTS];
        size=0;
    }
    
    public void add(int index, E e){
        if(index<0||index>size)
            throw new IndexOutOfBoundsException
                    ("Index: "+index+"\nSize: "+size);
        for(int i=size-1;i >=index; i--)
            data[i+1]=data[i];
        
        data[index]=e;
        
        size++;
    }
    
    public boolean contains(Object e){
        for(int i=0;i<size;i++)
            if(e.equals(data[i]))
                return true;
        return false;
    }
    
    public E get(int index){
        if(index<0|| index>=size)
            throw new IndexOutOfBoundsException
                    ("Index: "+index+"\nSize: "+size);
        return data[index];
    }
    
    public E remove(int index){
        if(index<0||index >=size)
            throw new IndexOutOfBoundsException
                    ("Index: "+index+"\nSize: "+size);
        E e=data[index];
        for(int j=index;j<size-1;j++)
            data[j]=data[j+1];
        data[size-1]=null;
        size--;
        return e;
    }
    
    public void clear(){
        size=0;
    }
    
    public void insertSorted(E param){
    int i=0; 
    E[] temp=(E[]) new Object[MAXELEMENTS];
    if(getSize()==0) 
        return;
    if((this.getSize()+1)>MAXELEMENTS) 
        throw new IndexOutOfBoundsException("No more objects may be added");
    
    while(i<this.getSize()&&((Comparable)data[i]).compareTo(param)<0){    
        i++;
    }
    add(i,param);
    sortList();
  }	
    
    public String toString(){
        String result= " ";
        for(int i=0;i<size;i++){
            result+=data[i];
            if(i<size-1)
                result+=", ";
        }
        return result.toString()+"]";
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean sortList(){
        E hold;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1;j++){
                if(((Comparable)data[j]).compareTo(data[j+1])>0){
                    hold= data[j+1];
                    data[j+1]=data[j];
                    data[j]=hold;
                }
            }
        }
        return true;
    }
    
}