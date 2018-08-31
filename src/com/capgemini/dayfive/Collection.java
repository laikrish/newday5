package com.capgemini.dayfive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collection {
	public static void main(String a[]){
        
        List<Object> laptop = new ArrayList<Object>();
        laptop.add("DELL");
        laptop.add("Core i5 Processor");
        laptop.add("Windows10");
        laptop.add(2011);
        Collections.addAll(laptop,"intel");
        System.out.println("laptop specifications"+laptop);
        
        List<Object> car = new ArrayList<Object>();
       
        car.add("BMW");
        car.add(2015);
        Collections.addAll(car,2015);
        Set<Object> carWithoutDuplicates = new LinkedHashSet<Object>(car);
        car.clear();

        car.addAll(carWithoutDuplicates);
        
        System.out.println("car specifications"+car);
        
        List<Object> television = new ArrayList<Object>();
        television.add("Samsung");
        television.add(2015);
        television.add("LCD");
        Collections.addAll(television,"3D enabled");
        System.out.println("televison specifications"+television);
        
        List<Object> telephone = new ArrayList<Object>();
        telephone.add("redmi");
        telephone.add("android");
        telephone.add(9500);
        Collections.addAll(telephone,"5 pixel");
        System.out.println("telephone specifications"+telephone);
        
        List<Object> school = new ArrayList<Object>();
        school.add("neeraj school");
        school.add("hyderabad");
        school.add("rangareddy");
        Collections.addAll(school,21);
        System.out.println("school information"+school);
        
}
}
