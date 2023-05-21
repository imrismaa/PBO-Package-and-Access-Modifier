public class Room {
    private int panjang;
    private int lebar;

    public Room(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    final double area() {
        return panjang*lebar;
    }
}
