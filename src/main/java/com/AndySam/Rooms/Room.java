package com.AndySam.Rooms;

import com.AndySam.Guest.Guest;

import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    private ArrayList<Guest> guestsInRoom;

    public Room(RoomType roomType, ArrayList<Guest> guests){
        this.roomType = roomType;
        this.guestsInRoom = guests;
    }


    public RoomType getRoomType(){
        return this.roomType;
    }

    public void setRoomType(RoomType roomType){
        this.roomType = roomType;
    }

    public ArrayList<Guest> getGuestsInRoom(){
        return this.guestsInRoom;
    }

    public void addGuestToRoom(Guest guest) {
        guestsInRoom.add(guest);
    }

    public void removeGuestFromRoom(Guest guest){
        guestsInRoom.remove(guest);
    }


    public int getMaxNumberOfOccupants(){
        return this.roomType.getValue();
    }

    public int guestInRoomCount(){
        return guestsInRoom.size();
    }


}
