import java.util.List;
import java.util.ArrayList;

public class array_list_basic_methods {

    public static void main(String[] args) {
        
        // declaring an array list
        List<Integer> lst=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            // putting values into it
            lst.add(i+1);
        }

        // printing values of array list
        for(int i:lst)
        System.out.print(i+" ");

        




    }
    
}
