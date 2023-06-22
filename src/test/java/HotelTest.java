//import com.AndySam.Hotel.Hotel;
//import com.AndySam.Rooms.Bedroom;
//import com.AndySam.Rooms.ConferenceRoom;
//import com.AndySam.Rooms.RoomType;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
//public class HotelTest {
//    private Hotel hotel;
//    private Bedroom bedroom;
//
//    private ConferenceRoom conferenceRoom;
//
//    @Before
//    public void before(){
//        bedroom = new Bedroom(RoomType.FAMILY, 12);
//        conferenceRoom = new ConferenceRoom(RoomType.SINGLE, "Conference Room 1");
//        ArrayList< Bedroom > hotelRooms = new ArrayList<>();
//        hotelRooms.add(bedroom);
//        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
//        conferenceRooms.add(conferenceRoom);
//        hotel = new Hotel(hotelRooms, conferenceRooms);
//    }
//
//    @Test
//    public void canGetHotelBedrooms(){
//        assertEquals("Family", hotel.getHotelBedrooms());
//    }
//
//}
