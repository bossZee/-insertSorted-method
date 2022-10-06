package earphoneobject;

/**
 *
 * @author Zinhle
 */
public class TestMyArrayList {

    public static void main(String[] args) {
        MyArrayList<EarphoneObject> list= new MyArrayList<>();
        
        System.out.println("Call on an empty list");
        System.out.println("Contents of 'List': "+list);
        System.out.println("Add an object");
        list.insertSorted(new StandardSet (1.5, "white", false, 45.0, 50.0, 5));
        System.out.println("Contents of 'List': "+list);
        
        System.out.println("\nClear List");
        list.clear();
        System.out.println("Contents of 'List': "+list);
        
        System.out.println("\nCreating new list");
        list.add(0,new StandardSet (2.5, "purple", true, 25.0, 30.0, 20));
        list.add(1,new Bluetooth (3.0,false,0.0,0.0, "red",true, 85.0, 100.0, 19));
        list.add(2,new Bluetooth (5.0,true,2.5,10.0, "blue", false, 80.0, 95.50, 25));
        list.add(3,new StandardSet (2.0, "black", true, 45.0, 60.0, 2));
        list.add(4,new Bluetooth (4.0,true,3.5,25.0, "pink",false, 65.0, 70.0, 80));
        System.out.println("Contents of 'List': "+list);
        if(list.sortList())
            System.out.println("Sorted List: "+list);
        System.out.println("Inserting object to list");
        list.insertSorted(new StandardSet (1.5, "yellow", true, 20.0, 27.0, 75));
        System.out.println("Contents of 'List': "+list);
    }
    
}
