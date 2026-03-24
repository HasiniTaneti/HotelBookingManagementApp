class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 400, 2500.0, 3);
        super(2, 400, 2500.0);
    }

    public String getRoomType() {
        return "double room";
    }
}