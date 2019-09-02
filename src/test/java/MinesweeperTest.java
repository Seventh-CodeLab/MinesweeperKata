import no.kristiania.Minesweeper.Minesweeper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinesweeperTest {
    /*
    @Test
    void getHintsTest(){
        assertArrayEquals(new String[] {
                "1100000000",
                "*311000111",
                "*3*10112*2",
                "121101*22*",
                "1100011111",
                "*210000000",
                "2*21100000",
                "123*100000",
                "01*2100000",
                "0111000000"},
                new Minesweeper(new String[]{
                        "..........",
                        "*.........",
                        "*.*.....*.",
                        "......*..*",
                        "..........",
                        "*.........",
                        ".*........",
                        "...*......",
                        "..*.......",
                        ".........."
                }).calculateHints());
    }
    */ //This is stored for later

    @Test
    void noMines1by1(){
        assertArrayEquals(new String[] {
                "0"},
                new Minesweeper(new String[]{
                    "."}
                    ).calculateHints());
    }


}
