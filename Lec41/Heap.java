package Lec41;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> ll=new ArrayList<>();
    public void add(int ele){
        ll.add(ele);
        upheapify(ll.size()-1);
    }
    public void upheapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    public void swap(int pi,int ci){
        int pith=ll.get(pi);
        int cith=ll.get(ci);
        ll.set(pi,cith);
        ll.set(ci,pith);
    }
    public int Remove(){
        swap(0,ll.size()-1);
        int rv=ll.size()-1;
        Downhepify(0);
        return rv;
    }
    public void Downhepify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int min=pi;
        if(lci<ll.size() && ll.get(lci)<ll.get(min)){
            min=lci;
        }
        if(rci<ll.size() && ll.get(rci)<ll.get(min)){
            min=rci;
        }
        if(min!=pi){
            swap(pi,min);
            Downhepify(min);
        }
    }
    public void Display(){
        System.out.println(ll);
    }
    public int Get(){
        return ll.size();
    }
}
