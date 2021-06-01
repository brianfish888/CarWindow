package com.brian;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int perprice=20;

        Map<String, Car>cars= new HashMap<>();

        Car c1=new Car("abc-123","09:00");
        Car c2=new Car("efg-456","08:26");
        Car c3=new Car("hij-789","11:10");

        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id,c3);

        String id="hij-789";
        Car car=cars.get(id);
        if(car==null){
            System.out.println("not found");
        }else {
            Date now=new Date();
            long time= now.getTime()-car.enter.getTime();
            long times=time/1000/60;
            long cash=times*perprice;
            System.out.println(times);
            System.out.println(cash);
        }
    }
}
