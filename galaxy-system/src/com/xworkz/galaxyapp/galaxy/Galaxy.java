package com.xworkz.galaxyapp.galaxy;

public class Galaxy {
   private int galaxyId;
   public int getGalaxyId(){
       return galaxyId;
   }
   public void setGalaxyId(int galaxyId){
       this.galaxyId=galaxyId;
   }
   private String galaxyName;
   public String getGalaxyName(){
       return galaxyName;
   }
   public void setGalaxyName(String galaxyName){
       this.galaxyName=galaxyName;
   }
   private int daimeterOfGalaxy;

   public int getDaimeterOfGalaxy(){
       return daimeterOfGalaxy;
   }
   public void setDaimeterOfGalaxy(int daimeterOfGalaxy){
       this.daimeterOfGalaxy=daimeterOfGalaxy;
   }


    public void getGalaxyInfo(){
        System.out.println("fetching galaxy info ----");
        System.out.println("the id of the galaxy is :"+galaxyId);
        System.out.println("the nameof the galaxy is: "+galaxyName);
        System.out.println("the daimeterOfGalaxy is : "+daimeterOfGalaxy);
    }
}
