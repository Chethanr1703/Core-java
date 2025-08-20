package com.xworkz.planetapp.planet;

public class Planet {
    private int planetId;

    public int getPlanetId() {
        return planetId;
    }

    public void setPlanetId(int planetId) {
        this.planetId = planetId;
    }

    private String planetname;

    public String getPlanetname() {
        return planetname;
    }

    public void setPlanetname(String planetname) {
        this.planetname = planetname;
    }

    private boolean isLife;
    public boolean getIsLife(){
        return isLife;
    }
    public void setLife(boolean isLife){
        this.isLife=isLife;
    }



    public void getPlanetInfo(){
        System.out.println("fetching planet info------");
        System.out.println("the id of the planetId :"+planetId);
        System.out.println("the name of the planet is "+planetname);
        System.out.println("is life supported "+isLife);





    }
}
