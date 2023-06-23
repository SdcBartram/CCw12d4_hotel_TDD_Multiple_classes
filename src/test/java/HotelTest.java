import com.AndySam.Guest.Guest;
import com.AndySam.Hotel.Hotel;
import com.AndySam.Rooms.Bedroom;
import com.AndySam.Rooms.ConferenceRoom;
import com.AndySam.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelTest {
    private Hotel hotel;
    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    ArrayList<Guest> expectedGuests;

    ArrayList<Bedroom> expectedBedroom;

    ArrayList<ConferenceRoom> expectedConferenceRoom;
    ConferenceRoom conferenceRoom;


    @Before
    public void before(){
        guest = new Guest("Andrew Smith");
        guest2 = new Guest("Sammy Sam");
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest);
        guests.add(guest2);
        bedroom = new Bedroom(RoomType.FAMILY, guests,12);
        conferenceRoom = new ConferenceRoom(RoomType.FAMILY, guests, "Conference Room 1");
        expectedGuests = guests;
        ArrayList< Bedroom > hotelRooms = new ArrayList<>();
        hotelRooms.add(bedroom);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);
        hotel = new Hotel(hotelRooms, conferenceRooms);
        expectedBedroom = hotelRooms;
        expectedConferenceRoom = conferenceRooms;

    }

    @Test
    public void canGetHotelBedrooms(){assertEquals(expectedBedroom, hotel.getHotelBedrooms());
    }

    @Test
    public void canGetConferenceRooms() {assertEquals(expectedConferenceRoom, hotel.getHotelConferenceRooms());}


    @Test
    public void canCheckInGuestToBedroom() {
        Guest newGuest = new Guest("John Doe");
        hotel.checkInGuest(bedroom, newGuest);
        assertEquals(3, bedroom.guestInRoomCount());
        assertTrue(bedroom.getGuestsInRoom().contains(newGuest));
    }

    @Test
    public void canCheckOutGuestFromBedroom() {
        hotel.checkOutGuest(bedroom, guest);
        assertEquals(1, bedroom.guestInRoomCount());
        assertFalse(bedroom.getGuestsInRoom().contains(guest));
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        Guest newGuest = new Guest("Jane Smith");
        hotel.checkInGuest(conferenceRoom, newGuest);
        assertEquals(3, conferenceRoom.guestInRoomCount());
        assertTrue(conferenceRoom.getGuestsInRoom().contains(newGuest));
    }

    @Test
    public void canCheckOutGuestFromConferenceRoom() {
        hotel.checkOutGuest(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.guestInRoomCount());
        assertFalse(conferenceRoom.getGuestsInRoom().contains(guest));
    }

}
