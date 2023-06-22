package com.AndySam.Rooms;

import com.AndySam.Guest.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;

    public Bedroom(RoomType roomType, ArrayList<Guest> guests, int roomNumber) {
        super(roomType, guests);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber(){
            return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber){
            this.roomNumber = roomNumber;
    }

}
