package com.example.importjavascenery.knowledge;


import java.util.ArrayList;
import java.util.List;

public interface SaySomething {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       for(int i = 1;i<=10;i++){
           list.add(i);
        }
       System.out.print(list);
    }
}
