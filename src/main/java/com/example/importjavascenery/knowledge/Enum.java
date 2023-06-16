package com.example.importjavascenery.knowledge;

enum SessionDemo{
    SPRING,SUMMER,AUTUMN,WINTER
}
public class Enum {
    public static  void main(String[] args){
        SessionDemo tmp = SessionDemo.valueOf("SUMMER");
        SessionDemo es[] = SessionDemo.values();

        for(int i=0;i<es.length;i++){
            String message ="";
            int result = tmp.compareTo(es[i]);
            if(result < 0) {
                message = tmp + "在" + es[i] + "的前" + (-result) + "个位置";
            }else if(result > 0){
                message = tmp + "在" + es[i] + "的后" + (-result) + "个位置";
            }else if(result == 0){
                message = tmp + "与" + es[i] + "是同一个值";
            }
            System.out.println(message);
        }
    }
}


