import com.AndySam.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Andrew Smith");
    }

    @Test
    public void guestHasName(){
        assertEquals("Andrew Smith", guest.getName());
    }

    @Test
    public void setGuestName(){
        guest.setName("Sammy Sam");
        assertEquals("Sammy Sam", guest.getName());
    }
}
