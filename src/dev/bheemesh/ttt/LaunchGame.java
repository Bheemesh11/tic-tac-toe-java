package dev.bheemesh.ttt;

public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.dispBoard();
        System.out.println(t.checkDiagWin());
        System.out.println(t.checkColWin());
        System.out.println(t.checkRowWin());

    }
}


