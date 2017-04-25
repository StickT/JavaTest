package com.yym.test.year;

/**
 * Created by StickT on 2017/4/18.
 */
public class DayOfYear {



    public static void main(String []args){
        int monthDays[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int year=2017,month=4,day=20;
        for (int i=0;i< month;i++){
            day+=monthDays[i];
        }
        if(year%4==0 && year%100 !=0 && year%400!=0){
            if(month >2){
                day+=1;
            }
        }
        System.out.println(day);
    }
}
