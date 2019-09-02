package no.kristiania.Minesweeper;

public class Minesweeper {
    String[] minefield;

    public Minesweeper(String[] minefield) {
        this.minefield = minefield;
    }

    public String[] calculateHints() {
        String[] hints = new String[minefield.length];
        hints[0] = "0";
        return hints;
    }
}
