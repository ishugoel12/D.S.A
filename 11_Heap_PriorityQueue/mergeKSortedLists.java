import java.io.*;
import java.util.*;
public class mergeKSortedLists {
        public static class Pair implements Comparable<Pair>{
            int lidx, eidx,val;
            Pair(int l, int e, int v){
                lidx=l;
                eidx=e;
                val=v;
            }
            public int compareTo(Pair o){
                return this.val-o.val;
            }
        } 
        
        public static ArrayList<Integer> mergeLists(ArrayList<ArrayList<Integer>> lists)
        {
            ArrayList<Integer> res = new ArrayList<>();
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            for(int i=0;i<lists.size();i++){
                Pair p = new Pair(i,0,lists.get(i).get(0));
                pq.add(p);
            }
            while(true){
                Pair newp = pq.remove();
                res.add(newp.val);
                if(newp.eidx < lists.get(newp.lidx).size()-1)
                {
                    newp.eidx = newp.eidx+1;
                    newp.val = lists.get(newp.lidx).get(newp.eidx);
                    pq.add(newp);
                }
                if(pq.size()==0)
                    break;
            }
            return res;
        }
        
        public static void main(String[] args) throws Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int k = Integer.parseInt(br.readLine());
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            for(int i = 0; i < k; i++){
                ArrayList<Integer> list = new ArrayList<>();
                int n = Integer.parseInt(br.readLine());
                String[] elements = br.readLine().split(" ");
                for(int j = 0; j < n; j++){
                    list.add(Integer.parseInt(elements[j]));
                }
                lists.add(list);
            }
            ArrayList<Integer> mlist = mergeLists(lists);
            for(int val: mlist){
                System.out.print(val + " ");
            }
            System.out.println();
        }
}