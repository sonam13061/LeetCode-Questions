class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int key=groupSizes[i];
            if(mp.containsKey(key)){
                List<Integer> val=mp.get(key);
                val.add(i);
                mp.put(key,val);
            }
            else{
                List<Integer> val=new ArrayList<>();
                val.add(i);
                mp.put(key,val);
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(Integer key:mp.keySet()){
            List<Integer> val=mp.get(key);
            int k=val.size()/key;
            if(k>1){
                List<Integer> l=new ArrayList<>();
                for(int i=0;i<val.size();i++){
                    if(l.size()==key){
                     list.add(l);
                        l=new ArrayList<>();
                         
                    }
                        l.add(val.get(i));
                    
                    
                }
                if(l.size()>0){
                    list.add(l);
                }
            }
            else{
            list.add(val);
            }
        }
        return list;
    }
}