import java.util.Optional;

public class Optional_class {
    public static void main(String[] args) {
       // Optional<String> name  = getName();
       // System.out.println(name); //print  name with optinal word
        //  if(name.isPresent()){
        //     System.out.println(name.get());
        //  }  
        
        // name.ifPresent(System.out :: println);

        // System.out.println(name.orElse("Unknown")); //consumer
        // System.out.println( name.orElseGet(()->"Unknown"));//supplier
       
        // System.out.println(name.orElseThrow()); //if not value throw exception
        // name.ifPresentOrElse(System.out::println,()-> System.out.println("unknown"));
    
    


        // User user =  getUser();
        // if(user!=null){
        //     Address address = user.address;
        //     if(address!=null){
        //         String city = address.city;
        //         if(city!=null){
        //             System.out.println(city);
        //         }
        //     }
        // }

        Optional<User> user = getUser2();
        user.map(x->x.address)
             .map(x->x.city)
             . ifPresentOrElse(System.out :: println,()->System.out.println("Unknown"));

    
    }
    public static Optional<String> getName(){
        //return Optional.of("Shlok");
        //return Optional.empty();
        return Optional.ofNullable("shlok");
    }
    private static User getUser(){
        Address a = new Address();
        a.city = "Delhi";
        User u = new User();
        u.address = a;
        return u;

    }
    private static Optional<User> getUser2(){
        Address a = new Address();
        a.city = "Delhi";
        User u = new User();
        u.address = a;
        return Optional.empty();

    }
}

//orElse -> veue present or not check the given string/data
//orElseGet -> if value in optional not check the supplier value


//map()->Function(T->R) , if value return optional
//filter -> check a condition ,if true keep the value else do nothing

class User{
    public Address address;
}

class Address{
    public String city;
}