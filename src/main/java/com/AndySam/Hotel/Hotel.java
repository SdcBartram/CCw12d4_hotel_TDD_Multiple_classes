package com.AndySam.Hotel;

import com.AndySam.Guest.Guest;
import com.AndySam.Rooms.Bedroom;
import com.AndySam.Rooms.ConferenceRoom;
import com.AndySam.Rooms.Room;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> hotelBedrooms;
    private ArrayList<ConferenceRoom> hotelConferenceRooms;

    public Hotel(ArrayList<Bedroom> hotelBedrooms, ArrayList<ConferenceRoom> hotelConferenceRooms){
        this.hotelBedrooms = new ArrayList<>();
        this.hotelConferenceRooms = new ArrayList<>();
    };

    public ArrayList<Bedroom> getHotelBedrooms(){
        return hotelBedrooms;
    }

    public ArrayList<ConferenceRoom> getHotelConferenceRooms(){
        return hotelConferenceRooms;
    }

    public void setHotelBedrooms(ArrayList<Bedroom> hotelBedrooms) {
        this.hotelBedrooms = hotelBedrooms;
    }

    public void setHotelConferenceRooms(ArrayList<ConferenceRoom> hotelConferenceRooms) {
        this.hotelConferenceRooms = hotelConferenceRooms;
    }

    public void checkInGuest(Room room, Guest guest){
        room.addGuestToRoom(guest);
    }

    public void checkOutGuest(Room room, Guest guest){
        room.removeGuestFromRoom(guest);
    }
}