package com.xworkz.roomapp;

import com.xworkz.roomapp.room.Room;

public class RoomRunner {

        public static void main(String[] args) {
            Room room =new Room();
            room.setRoomNo(230);
            room.getRoomNo();
            room.setType("deluxe");
            room.getType();
            room.setNoOfbed(6);
            room.getNoOfbed();

            room.getRoominfo();

    }
}
