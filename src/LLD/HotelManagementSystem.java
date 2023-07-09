package LLD;
import javax.crypto.SealedObject;
import java.security.PublicKey;
import java.util.Date;
import java.util.List;

public class HotelManagementSystem {
    public static void main(String[] args) {

    }

    class Hotel{
        String name;
        Location address;
        Integer id;
        List<Room> rooms;
    }

    class Location{
        int pin;
        String street;
        String area;
        String city;
    }

    class Room{
        String roomNumber;
        RoomStyle roomStyle;
        RoomStatus roomStatus;
        Double bookingPrice;
        List<RoomKey> roomKeys;
        List<HouseKeepingLog> houseKeepingLogs;
    }

    public enum RoomStyle{
        STANDARD, DELUXE, FAMILY_SUITE;
    }

    public enum RoomStatus{
        AVAILABLE, OCCUPIED , NOT_AVAILABLE
    }

    abstract class RoomKey{
        String keyId;
        String barCode;
        Date issuedAt;
        boolean isActive;
        boolean isInactive;

        abstract public void assignRoom(Room room);
    }

    abstract class HouseKeepingLog{
        String description;
        Date startDate;
        int duration;
        HouseKeeper houseKeeper;

        abstract public void addRoom(Room room);
    }

    class Person{
        String name;
        Account accountDetail;
        String phone;
    }
    public enum AccountStatus{
        Active, Closed, Blocked
    }

    class Account{
        String userName;
        String email;
        AccountStatus accountStatus;
    }

    abstract class HouseKeeper extends Person{
        abstract public List<Room> getRoomServiced(Date date);
    }

    abstract class Guest extends Person{
        Search searchObject;
        Booking bookingObj;

        abstract public List<RoomBooking> getAllRoomBookings();
    }

    abstract class Receptionist extends Person{
        Search searchObject;
        Booking bookingObj;

        abstract public void checkInGuest(Guest guest, RoomBooking roomBookingInfo);
        abstract public void checkOutGuest(Guest guest, RoomBooking roomBookingInfo);
    }

    abstract class Admin{
        abstract public void eddRoom(Room roomDetails);
        abstract public void deleteRoom(Room roomDetails);
        abstract public void editRoom(Room roomDetails);
    }

    abstract class Search{
        abstract public List<Room> searchRoom(RoomStyle roomStyle, Date startDate, int duration);
    }

    abstract class Booking{
        abstract public RoomBooking CreateRoomBooking(Guest guestInfo );
        abstract public RoomBooking CancelBooking(int bookingId);
    }

    class RoomBooking {
        String bookingId;
        Date startDate;
        int duration;
        BookingStatus bookingStatus;
        List<Guest> guestList;
        List<Room> roomInfo;
        BaseRoomCharge totalRoomCharge;
    }

    public enum BookingStatus{
        Active, DeActive
    }

    interface BaseRoomCharge{
        Double getCost();
    }

    class RoomCharge implements BaseRoomCharge{
        Double cost;
        @Override
        public Double getCost() {
            return cost;
        }

        void setCost(double cost){
            this.cost = cost;
        }
    }

    class InRoomPurchase implements BaseRoomCharge{

        Double cost;
        BaseRoomCharge baseRoomCharge;

        @Override
        public Double getCost() {
            return null;
        }
    }

}
