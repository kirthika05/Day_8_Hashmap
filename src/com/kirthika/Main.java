package com.kirthika;

import java.util.*;

public class Main {

    static HashMap<String,Integer> hm;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        hm= new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer ph = hm.get(s);
            if(ph!=null){
                System.out.println(s+"="+ph);
            }else{
                System.out.println("Not found");
            }
        }
        in.close();

    }
}
