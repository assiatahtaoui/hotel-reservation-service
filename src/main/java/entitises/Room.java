package entitises;

public class Room {
  private int roomId;
    private RoomType type;
    private int priceNight;
 

    public Room( int roomId,int priceNight, RoomType type) {
        this.priceNight = priceNight;
        this.roomId = roomId;
        this.type = type;
    }

    public int getPriceNight() {
        return priceNight;
    }

    public int getRoomId() {
        return roomId;
    }

    public RoomType getType() {
        return type;
    }

    public void setPriceNight(int priceNight) {
        this.priceNight = priceNight;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", price=" + priceNight +
                ", type=" + type +
                '}';
    }
}
