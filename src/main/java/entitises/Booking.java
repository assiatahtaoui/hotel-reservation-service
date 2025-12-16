package entitises;

public class Booking {
  private int userId;
    private int roomId;
    private Date checkIn;
    private Date checkOut;
    private int priceNight;
    private int totalPrice;
    private RoomType roomType;

    public Booking(int userId, int roomId, int priceNight, RoomType type, Date checkIn, Date checkOut, int totalPrice) {

        this.userId = userId;
        this.roomId = roomId;
        this.priceNight = priceNight;
        this.totalPrice = totalPrice;
        this.roomType = type;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "checkIn=" + checkIn +
                ", userId=" + userId +
                ", roomId=" + roomId +
                ", checkOut=" + checkOut +
                ", priceNight=" + priceNight +
                ", totalPrice=" + totalPrice +
                ", roomType=" + roomType +
                '}';
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOUT) {
        this.checkOut = checkOUT;
    }

    public int getPriceNight() {
        return priceNight;
    }

    public void setPriceNight(int priceNight) {
        this.priceNight = priceNight;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
