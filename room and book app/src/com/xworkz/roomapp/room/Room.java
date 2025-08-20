package com.xworkz.roomapp.room;

public class Room {

        private int roomNo;
        public int getRoomNo(){
            return roomNo;
        }
        public void setRoomNo(int roomNo){
            this.roomNo=roomNo;
        }
        private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int noOfbed;
    public int getNoOfbed(){
        return noOfbed;
    }
    public void setNoOfbed(int noOfbed){
        this.noOfbed=noOfbed;
    }




        public void getRoominfo(){
            System.out.println("room info fetching");
            System.out.println("the room number is"+roomNo);
            System.out.println("the type of the room is "+type);
            System.out.println("the bed type of the room "+noOfbed);


        }
    }
