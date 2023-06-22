import com.AndySam.Guest.Guest;
import com.AndySam.Rooms.Bedroom;
import com.AndySam.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    ArrayList<Guest> expectedGuests;

    @Before
    public void before(){
        guest = new Guest("Andrew Smith");
        guest2 = new Guest("Sammy Sam");
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest);
        guests.add(guest2);
        bedroom = new Bedroom(RoomType.FAMILY, guests,12);
        expectedGuests = guests;
    }

    @Test
    public void canCountGuestsInRoom() {
       assertEquals(2, bedroom.guestInRoomCount());
    }

    @Test
    public void canGetGuestsInRoom(){
        assertEquals(expectedGuests, bedroom.getGuestsInRoom());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void canSetRoomNumber(){
        bedroom.setRoomNumber(5);
        assertEquals(5, bedroom.getRoomNumber());
    }
    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.FAMILY, bedroom.getRoomType());
    }

    @Test
    public void doubleHasValue2(){
        RoomType[] roomTypes = RoomType.values();
        assertEquals(4, bedroom.getMaxNumberOfOccupants());
    }

    @Test
    public void canSetRoomType(){
        bedroom.setRoomType(RoomType.SINGLE);
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }
}
