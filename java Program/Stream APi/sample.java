// package Project.java Program.Stream APi;



/* Stream is interface */ 

import java.util.*;
import java.util.stream.Stream;
public class sample {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>(Arrays.asList(5,8,2,3,4,6));

        // When u change the value in the stream list will not affect
        // Stream<Integer> data=a.stream();
        Stream<Integer> data=a.stream().map(n->n*2);
         
        // it maps the data and print using foreach
        // a.stream().map(n->n*2).forEach(n->System.out.println(n));
        
        //it filter the value which is hard and using mapping the vale multiple by 2 and print using foreach
        a.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n));

        // it reducer add the value in the stream
        int res=a.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(res);
        //  a.stream().sorted().map(n->n*2).forEach(n->System.out.println(n));

        // Stream<Integer> mappedData=data.map(n->n*2);

        // data.forEach(n->
        // {System.out.println(n);
        // });

        // mappedData.forEach(n->
        // {System.out.println(n);
        // });
        // once use the stream we cannot reuse the stream
        // stream can only use once
        // Stream<Integer> sortData=data.sorted();

        // // long count=data.count();
        // sortData.forEach(n->
        // {System.out.println(n);
        // });




    }
}
