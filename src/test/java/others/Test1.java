package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/17 13:36
 **/
public class Test1 {

    private int a = 1;

    private static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5,6));

    public static void main(String[] args) {
        Test1 abc = new Test1();
        System.out.println(abc.hashCode());

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            if(list.get(i) == 3){
//                list.remove(i);
//            }
//        }

//        for (Integer item : list) {
//            System.out.println(item);
//            if(list.get(item) == 3){
//                list.remove(item);
//            }
//        }

        System.out.println(TestEnum.A.getA());
    }
}
