import org.junit.jupiter.api.*;
import ru.luxkod.qa.Booking;
import ru.luxkod.qa.Customer;
import ru.luxkod.qa.HotelManagement;
import ru.luxkod.qa.Room;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class HotelManagementTest {

    private HotelManagement hotelManagement;
    private Customer customer;


    private String firstRoomNumber = "1013";
    private String secondRoomNumber = "202";
    private String thirdRoomNumber = "204";

    @BeforeEach
    void setUp() {
        customer = new Customer("Sia", "mail@mail.com");
        hotelManagement = new HotelManagement();
        hotelManagement.addRoom(new Room(firstRoomNumber, "Lux", true, 1200.0));
        hotelManagement.addRoom(new Room(secondRoomNumber, "Economy", true, 350.0));
        hotelManagement.addRoom(new Room(thirdRoomNumber, "Economy", true, 350.0));
    }

    @AfterEach
    void tearDown() {
        for (Booking booking : hotelManagement.getBookings()) {
            booking.cancelBooking();
        }
    }

    @Test
    @DisplayName("Booking testing")
    public void bookRoomTest() {
        assertTrue(hotelManagement.bookRoom(firstRoomNumber,
                customer,
                LocalDate.now(),
                LocalDate.now().plusDays(6)));

        assertFalse(hotelManagement
                .getRooms()
                .get(0).isAvailable());

        assertEquals(1, hotelManagement.getBookings().size());
    }

    @Test
    public void getAvailableRoomsTest() {
        assertEquals(hotelManagement.getRooms().size(), hotelManagement.getAvailableRooms().size());
        hotelManagement.bookRoom(firstRoomNumber,
                customer,
                LocalDate.now(),
                LocalDate.now().plusDays(6));

        assertEquals(hotelManagement.getRooms().size() - 1, hotelManagement.getAvailableRooms().size());
    }

    @Test
    public void cancelBookingTest() {
        hotelManagement.bookRoom(firstRoomNumber,
                customer,
                LocalDate.now(),
                LocalDate.now().plusDays(6));

        Booking booking = hotelManagement
                .getBookings().get(0);

        booking.cancelBooking();

        assertFalse(booking.isActive());
        assertTrue(booking.getRoom().isAvailable());
    }

}
