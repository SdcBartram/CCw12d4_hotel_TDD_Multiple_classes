//import com.AndySam.Rooms.Room;
//import com.AndySam.Rooms.RoomType;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class RoomTest {
//
//    Room room;
//
//    @Before
//    public void before(){
//        room = new Room(RoomType.DOUBLE);
//    }
//
//    @Test
//    public void canGetGuestsInRoom(){
//        assertEquals("guest", room.getGuestsInRoom());
//    }
//    @Test
//    public void canGetRoomType(){
//        assertEquals(RoomType.DOUBLE, room.getRoomType());
//    }
//
//    @Test
//    public void doubleHasValue2(){
//        RoomType[] roomTypes = RoomType.values();
//        assertEquals(2, room.getMaxNumberOfOccupants());
//    }
//
//    public void canCountGuestsInRoom(){
//        //check guest in
//        assertEquals(1, room.guestInRoomCount());
//    }
//
//    @Test
//    public void canSetRoomType(){
//        room.setRoomType(RoomType.SINGLE);
//        assertEquals(RoomType.SINGLE, room.getRoomType());
//    }
//}
