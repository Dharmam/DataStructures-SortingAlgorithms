import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class House {

    public static void main(String[] args) {

        for (int i = 0 ; i < 10 ; i++){
            shouldThrottleForFinal();
        }

        List<Integer> lst1 = new ArrayList<>();
        lst1.add(3);
        lst1.add(6);


        List<Integer> lst2 = new ArrayList<>();
        lst2.add(6);
        lst2.add(3);

        List<Integer> lst3 = new ArrayList<>();
        lst3.add(2);
        lst3.add(5);

        List<Integer> lst4 = new ArrayList<>();
        lst4.add(5);
        lst4.add(2);

        List<Integer> lst5 = new ArrayList<>();
        lst5.add(1);
        lst5.add(8);

        List<Integer> lst6 = new ArrayList<>();
        lst6.add(8);
        lst6.add(1);


        List<List<Integer>> allLocations = new ArrayList<>();
        allLocations.add(lst1);
        allLocations.add(lst2);
        allLocations.add(lst3);
        allLocations.add(lst4);
        allLocations.add(lst5);
        allLocations.add(lst6);


        ClosestXdestinations(6, allLocations, 3);

        List<List<Integer>> result  = findClosestElements(allLocations,3 ) ;

        System.out.println(result);


    }

    static void shouldThrottleForFinal(){
        System.out.println((Math.random()*10) < 5);//AppMgr.getFinalThrottleVolume());
    }



    static public List<List<Integer>> findClosestElements(List<List<Integer>> arr, int numDeliveries) {
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int a = o1.get(0);
                int b = o1.get(1);

                int c = o2.get(0);
                int d = o2.get(1);

                if ((a * a + b * b) > (c * c + d * d)) {
                    return +1;
                } else if ((a * a + b * b) < (c * c + d * d)) {
                    return -1;
                }

                return 0;
            }
        });
        arr = arr.subList(0, numDeliveries);
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int a = o1.get(0);
                int b = o1.get(1);

                int c = o2.get(0);
                int d = o2.get(1);

                if ((a * a + b * b) > (c * c + d * d)) {
                    return +1;
                } else if ((a * a + b * b) < (c * c + d * d)) {
                    return -1;
                }

                return 0;
            }
        });

        return arr;
    }


    static public void ClosestXdestinations(int numDestinations,
                                            List<List<Integer>> allLocations,
                                            int numDeliveries) {
        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>(numDestinations, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int a = o1.get(0);
                int b = o1.get(1);

                int c = o2.get(0);
                int d = o2.get(1);

                if ((a * a + b * b) > (c * c + d * d)) {
                    return +1;
                } else if ((a * a + b * b) < (c * c + d * d)) {
                    return -1;
                }

                return 0;
            }
        });

        for (List<Integer> routes : allLocations) {
            maxHeap.offer(routes);
        }


        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        for (List<Integer> lst : maxHeap) {
            if (i < numDeliveries) {
                result.add(lst);
                System.out.println(lst.get(0) + " " + lst.get(1));
                i++;
            }
        }
    }


    public List<Integer> cellCompete(int[] states, int days) {
        List<Integer> latest = new ArrayList<>();

        int current = 0, next = 0, prev = 0;
        for (int j = 0; j < days; j++) {

            for (int i = 0; i < 8; i++) {
                current = prev ^ next;
                latest.add(current);
                prev = states[i];
                if (i + 2 >= states.length)
                    next = 0;
                else
                    next = states[i + 2];
            }

            int i = 0;
            for (Integer cell : latest) {
                states[i] = cell;
                i++;
            }

        }
        return latest;


    }
    // METHOD SIGNATURE ENDS
}
