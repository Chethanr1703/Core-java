package com.xworkz.platformapp.platform;

public class Platform {
    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    private String platformName;

    public String getPlatformName(){
        return platformName;
    }

    public void setPlatformName(String platformName){
        this.platformName=platformName;
    }

    private int noOfofficer;

    public int getNoOfofficer(){
        return noOfofficer;
    }

    public void setNoOfofficer(int noOfofficer) {
        this.noOfofficer = noOfofficer;
    }

    public void getPlatforminfo() {
        System.out.println("fetching platform info  ");
        System.out.println("the id of the platform is :" + id);
        System.out.println("the name of the platform is :" + platformName);
        System.out.println("the noOfofficer in platform is :" + noOfofficer);
    }
}
