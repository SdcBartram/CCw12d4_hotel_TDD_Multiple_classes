import com.AndySam.Guest.Guest;
import com.AndySam.Rooms.ConferenceRoom;
import com.AndySam.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;
    ArrayList<Guest> expectedGuests;

    @Before
    public void before(){
        guest = new Guest("Bob Marley");
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest);
        conferenceRoom = new ConferenceRoom(RoomType.FAMILY, guests, "Conference Room 1");
        expectedGuests = guests;
    }

    @Test
    public void canCountGuestsInRoom() {
        assertEquals(1, conferenceRoom.guestInRoomCount());
    }

    @Test
    public void canGetGuestsInRoom(){
        assertEquals(expectedGuests, conferenceRoom.getGuestsInRoom());
    }
    @Test
    public void roomHasName(){
        assertEquals("Conference Room 1", conferenceRoom.getRoomName());
    }

    @Test
    public void canSetRoomName(){
        conferenceRoom.setRoomName("Conference Room 2");
        assertEquals("Conference Room 2", conferenceRoom.getRoomName());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.FAMILY, conferenceRoom.getRoomType());
    }

    @Test
    public void doubleHasValue2(){
        RoomType[] roomTypes = RoomType.values();
        assertEquals(4, conferenceRoom.getMaxNumberOfOccupants());
    }

    @Test
    public void canSetRoomType(){
        conferenceRoom.setRoomType(RoomType.SINGLE);
        assertEquals(RoomType.SINGLE, conferenceRoom.getRoomType());
    }
}
