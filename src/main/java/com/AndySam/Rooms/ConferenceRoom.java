package com.AndySam.Rooms;

import com.AndySam.Guest.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String roomName;
    public ConferenceRoom(RoomType roomType, ArrayList<Guest> guests, String roomName) {
        super(roomType, guests);
        this.roomName = roomName;
    }

    public String getRoomName(){
        return roomName;
    }

    public void setRoomName(String roomName){
        this.roomName =  roomName;
    }
}
