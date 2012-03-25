import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {
    @org.junit.Test
    public void should_run_Game_2_slot_map() throws Exception {
        assertThat(new Game(new GameMap(2)).printMap(), is("00"));
    }

    @org.junit.Test
    public void should_run_game_simplest_map() throws Exception {
        assertThat(new Game(new GameMap(1)).printMap(), is("0"));
    }

    @Test
    public void should_run_with_a_player_in_simplest_map() throws Exception {
        Game game = new Game(new GameMap(1));
        game.addPlayer(new Player("P"));
        assertThat(game.printMap(), is("P"));
        
    }

    @Test
    public void should_run_with_a_b_player_in_simplest_map() throws Exception {
        Game game = new Game(new GameMap(1));
        String name = "B";
        game.addPlayer(new Player(name));
        assertThat(game.printMap(), is(name));

    }

    @Test
    public void should_run_with_a_b_player_in_2_slot_map() throws Exception {
        Game game = new Game(new GameMap(2));
        String name = "B";
        game.addPlayer(new Player(name));
        assertThat(game.printMap(), is("B0"));
    }

    @Test
    public void should_game_execute_roll() throws Exception {
        Game game = new Game(new GameMap(2));
        Player player = new Player("B");
        game.addPlayer(player);
        game.execute("roll");
        assertThat(game.printMap(), is("0B"));
    }
}
