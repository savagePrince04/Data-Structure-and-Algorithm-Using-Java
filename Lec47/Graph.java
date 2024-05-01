package Lec47;

import java.util.HashMap;

public class Graph {
   HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
   Graph(int v){
       for(int i=1;i<=v;i++){
           map.put(i,new HashMap<>());
       }
   }
   public void AddEdge(int v1,int v2,int cost){
       map.get(v1).put(v2,cost);
       map.get(v2).put(v1,cost);
   }
   public void addVertex(int v){
       map.put(v,new HashMap<>());
   }
   public void containsEdge(int v1,int v2){
       map.get(v1).containsKey(v2);
   }
   public int NOofEdge(){
       int sum=0;
       for(int key:map.keySet()){
           sum=sum+map.get(key).size();
       }
       return sum/2;
   }
   public void Remove(int v1,int v2){
       map.get(v1).remove(v2);
       map.get(v2).remove(v1);
   }
   public void RemoveVertax(int v1){
       for(int nbrs: map.get(v1).keySet()){
           map.get(nbrs).remove(v1);
       }
       map.remove(v1);
   }
   public void display(){
       for(int key:map.keySet()){
           System.out.println(key+" "+map.get(key));
       }
   }
}
