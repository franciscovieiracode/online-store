package com.onlinestore.onlineStore.exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(String s){
        super(s);
    }
}
