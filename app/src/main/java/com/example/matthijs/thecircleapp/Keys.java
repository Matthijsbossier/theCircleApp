package com.example.matthijs.thecircleapp;

public class Keys {

    private String email;
    private String signature;
    private boolean transparent;

    public Keys(String s, String s1, boolean b) {
    }


    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setSignature(String signature){
        this.signature = signature;
    }

    public String getSignature(){
        return signature;
    }

    public void setTransparent(boolean transparent){
        this.transparent = transparent;
    }

    public Boolean getTransparent(){
        return transparent;
    }

}
