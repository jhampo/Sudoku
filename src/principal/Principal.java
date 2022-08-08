package principal;

import modelo.Sudoku;
import vista.FormSudoku;

public class Principal {

    public static void main(String[] args) {
        FormSudoku sudoku = new FormSudoku();
        sudoku.setVisible(true);        
    }
}
