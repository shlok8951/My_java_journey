import java.util.*;

public class Iterable_interface{
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> its = list.iterator();
        for(Integer i : list){
            System.out.println(i);
        }
        
        // while(its.hasNext()){
        //     System.out.println(its.next());
        // }

        while(its.hasNext()){
             int value = its.next();
            // if(value==30){
            //     list.remove(value);
            // }
            System.out.println(value);
        }
       
        

        String[] arr = {"Adity","Mahesh","Shlok","mahesh"};
        NameCounter container = new NameCounter(arr);
        Iterator<String> it = container.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //compiler covert like upper code of For each loop
        for(String s : container){
            System.out.println(s);
        }        



    }   
}
class NameCounter implements Iterable<String>{
    private String [] names;
    private int size;

    NameCounter(String [] names){
        this.names = names;
        this.size = names.length;
    }
     @Override
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int pos =0;

      @Override
      public boolean hasNext(){
        return pos<size;

        }

        @Override
       public String next(){
        return names[pos++];

        }

            
        };
     }

    


}
        
    
    

