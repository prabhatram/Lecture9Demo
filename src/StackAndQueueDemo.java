
import java.util.*;
//import java.util.LinkedList;
//import java.util.Iterator;

public class StackAndQueueDemo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n ****Beginning demo of Priority Queue's basic methods****");
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        System.out.println("\n The Priority Queues is empty?" + pQueue.isEmpty()); // true
        //System.out.println("The Head of the Priority Queues is: " + pQueue.element()); // Should throw an exception

        System.out.println("Polling a Priority Queues when it is empty : " + pQueue.poll()); // null
        //System.out.println("Polling a Priority Queues when it is empty : " + pQueue.remove()); // Should throw an exception

        pQueue.add(23);
        pQueue.offer(323);
        pQueue.add(16);
        pQueue.offer(220);
        pQueue.add(2);
        pQueue.offer(3123);

        System.out.println("\n The Priority Queues at this moment is: " + pQueue); 
        System.out.println("The Head of the Priority Queues after adding some elements is: " + pQueue.element()); 
        System.out.println("\n The Head of the Priority Queues after adding some elements is: " + pQueue.peek()); 

        System.out.println("\n Polling a Priority Queues when it is not empty : " + pQueue.poll()); 
        System.out.println("Polling a Priority Queues when it is not empty : " + pQueue.remove()); 

        System.out.println("\n The Priority Queues at this moment is: " + pQueue); 

        System.out.println("****Ending demo of Priority Queue's basic methods**** \n");
        
        
        System.out.println("\n****Beginning demo of Stack's basic methods****");
        
        Stack<String> names = new Stack<>();
        String [] someArray = {"Mind Your Langauge", "Father Ted", "Derry Girls"};

        List<String> listOfArray = Arrays.asList(someArray);
        
        names.add("Donnie Brasco");
        System.out.println("\n Stack after adding the first element");
        display(names);

        names.push("Life of Brian");
        System.out.println("\n Stack after adding the first element");
        display(names);

        names.add("Jack Sparrow");
        System.out.println("\n Stack after adding the second element");
        display(names);
        names.add("Monty Python");
        System.out.println("\n Stack after adding the third element");
        display(names);
        names.add(4, "Edward Scissorhands");
        System.out.println("\n Stack after adding an element at the already populated first position");
        display(names);
        names.remove(1);
        System.out.println("\n Stack after removing an element from the first position");
        display(names);
        names.set(1, "Agent Smith");
        System.out.println("\n Stack after replacing the element in the first position");
        display(names);

        names.pop();
        System.out.println("\n Stack after replacing the element in the first position");
        display(names);

        names.add("Sleepy Hollow");
        System.out.println("\n Stack after adding an element: ");
        display(names);

        names.add("Sweeney Todd");
        System.out.println("\n Stack after adding an element: ");
        display(names);

        System.out.println("The position at which Donnie Brasco is stacked:" + names.search("Donnie Brasco"));

        System.out.println("The position at which Donnie Brasco is stacked:" + names.contains("Donnie Brasco"));

        names.addAll(listOfArray);
        System.out.println("\n Stack after adding a list of elements: ");
        display(names);


        System.out.println("\n Stack without the iterator");
        System.out.println(names);

        Iterator it = names.iterator();
 
        
        System.out.println("\n Stack with the iterator");
        while (it.hasNext()){
            //System.out.println("\n");
            System.out.print(it.next() + ", ");
        }

        System.out.println("\n ****Ending demo of Stack's basic methods**** \n");
    
    }
   

    public static void display(Stack<String> names){
        System.out.println("The size of the Stack is:" + names.size()); 
        
        for(int x=0; x<names.size(); ++x){
            System.out.println("At position " + x + " the Name is:" + names.get(x)); // IN arrays, names[i]
        }
    }

}

