import java.util.*;

 class UniqueElement {

	public static void main(String[] args) {
      // int[]arr= {1,2,3,1,2,4,5};
      // System.out.println(Arrays.toString(arr));
      // List <Integer> list=new ArrayList<>();
      // for(Integer i:arr)
    // 	  list.add(i);
      // Set<Integer> set=new LinkedHashSet<>(list);
      
      // System.out.println(set);

        int[]arr={1,11,23,4,5,6,6,1,2};
        List<Integer> list=new ArrayList<>();
          for(Integer i : arr)
            list.add(i);
        System.out.println(list);

        Set<Integer> set=new HashSet<>();
        for(Integer i:arr)
        set.add(i);
       System.out.println(set);
	}

}