package com.javainuse.service;

import org.springframework.stereotype.Service;

import com.javainuse.aspect.Loggable;

@Service  
public class HomeService {  
  @Loggable
  // this here is what's called a join point  
  public String homePage(int i){  
        System.out.println("Loggable annotation triggered - From Service: "+i);
        return "okkkk";
    }  
  
  
  public void page1(){  
        System.out.println("From Service page 1");  
    }  
}
