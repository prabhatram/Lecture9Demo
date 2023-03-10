import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("****Beginning demo of ArrayList's basic methods****");
        
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Donnie Brasco");
        System.out.println("\n ArrayList after adding the first element");
        display(names);
        names.add("Jack Sparrow");
        System.out.println("\n ArrayList after adding the second element");
        display(names);
        names.add("Monty Python");
        System.out.println("\n ArrayList after adding the third element");
        display(names);
        names.add(1, "Edward Scissorhands");
        System.out.println("\n ArrayList after adding an element at the already populated first position");
        display(names);
        names.remove(1);
        System.out.println("\n ArrayList after removing an element from the first position");
        display(names);
        names.set(1, "Agent Smith");
        System.out.println("\n ArrayList after replacing the element in the first position");
        display(names);

        System.out.println("\n ArrayList without the iterator");
        System.out.println(names);

        Iterator it = names.iterator();
 
        
        System.out.println("\n ArrayList with the iterator");
        while (it.hasNext()){
            //System.out.println("\n");
            System.out.print(it.next() + ", ");
        }

        timeDifferenceBetweenArrayAndLinkedLists();
    
    }

    public static void display(ArrayList<String> names){
        System.out.println("The size of the ArrayList is:" + names.size()); // array.length to get the size in arrays
        
        for(int x=0; x<names.size(); ++x){
            System.out.println("At position " + x + " the Name is:" + names.get(x)); // IN arrays, names[i]
        }
    }

    public static void timeDifferenceBetweenArrayAndLinkedLists(){

        // COMPARING TIME CONSUMPTION DIFFERENCE BETWEEN ARRAYLIST AND LINKEDLIST

        System.out.println("\n \n ****Beginning demo of time difference between ArrayList and LinkedList**** \n \n");

        LinkedList<String> llist = new LinkedList<>();
        ArrayList<String> alist = new ArrayList<>();

        final int FACTOR = 1_000_000;
        final int MAX = 1000;

        for(int i=0; i<MAX; ++i){
            llist.add(i, "someString");
            alist.add(i, "someString");
        }
        
        int startTime, endTime;
        
        LocalDateTime now;
        now = LocalDateTime.now(); 
        startTime = now.getNano();

        //System.out.println("Getting an 500th element from a LinkedList" + llist.get(500));
        //System.out.println("Setting an element at 500th position in a LinkedList" + llist.set(500, "New element"));
        System.out.println("Adding an element at 500th position in a LinkedList"); 
        llist.add(600, "more string");

        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("\n Time it took LinkedList to set the 500th element: " +
        ((endTime - startTime) ) + " nanoseconds \n"); 


        LocalDateTime now2;
        now2 = LocalDateTime.now(); 
        startTime = now2.getNano();

        //System.out.println("Getting an 500th element from a ArrayList" + alist.get(500));
        //System.out.println("Setting an element at 500th position in a ArrayList" + alist.set(500, "New element"));
        System.out.println("Adding an element at 500th position in a ArrayList"); 
        alist.add(600, "more string");

        now2 = LocalDateTime.now();
        endTime = now2.getNano();
        System.out.println("\n Time it took ArrayList to set the 500th element: " +
        ((endTime - startTime)) + " nanoseconds \n");
    }

}

