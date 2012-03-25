public class Game {
    private GameMap gameMap;
    private Player player;
    private int position;

    public Game(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public String printMap() {
        String result = gameMap.print();
        if (player != null) {
            if (position == 0)
                result = result.replaceFirst("0", player.getName());
            else
                result = "0" + player.getName();
        }
        return result;
    }

    public void addPlayer(Player p) {
        player = p;
    }

    public void execute(String command) {
        position = 1;
    }
}
