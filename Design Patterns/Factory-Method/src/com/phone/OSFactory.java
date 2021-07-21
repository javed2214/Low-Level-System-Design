package com.phone;

public class OSFactory {
    public OS createOS(String type){
        if(type.equals("Best")){
            return new IOS();
        }
        else if(type.equals("Average")){
            return new Android();
        }
        else if(type.equals("Worst")){
            return new Windows();
        }
        else return null;
    }
}
