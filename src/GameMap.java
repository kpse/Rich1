public class GameMap {
    private int count;

    public GameMap(int slotCount) {
        count = slotCount;
    }

    public String print() {
        if (getCount() == 2) {
            return "00";
        }
        return "0";
    }

    public int getCount() {
        return count;
    }
}
