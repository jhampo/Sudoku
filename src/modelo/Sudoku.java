package modelo;

import java.util.Random;
import javax.swing.JTextField;

public class Sudoku {

    private int sudoku[][];

    public Sudoku() {
        sudoku = new int[9][9];
        limpiarSudoku();
    }

    public boolean resolverSudoku() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                if (sudoku[i][j] == 0) {
                    for (int valor = 1; valor <= 9; valor++) {
                        if (validarFila(i, valor) && validarColumna(j, valor) && validarCuadrante(i, j, valor)) {
                            sudoku[i][j] = valor;
                            if (resolverSudoku()) {
                                return true;
                            }
                            sudoku[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean comprobarSudoku() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                int aux = sudoku[i][j];
                sudoku[i][j] = 0;
                if (!validarFila(i, aux) || !validarColumna(j, aux) || !validarCuadrante(i, j, aux)) {
                    sudoku[i][j]=aux;
                    return false;

                }
                sudoku[i][j]=aux;
            }
        }
        return true;
    }

    public boolean validarCuadrante(int i, int j, int valor) {
        int posI = subCuadranteActual(i);
        int posJ = subCuadranteActual(j);

        for (int k = posI - 3; k < posI; k++) {
            for (int l = posJ - 3; l < posJ; l++) {
                if (sudoku[k][l] == valor) {
                    return false;
                }
            }
        }
        return true;
    }

    public void limpiarSudoku() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                sudoku[i][j] = 0;
            }
        }
    }

    public int subCuadranteActual(int pos) {
        if (pos <= 2) {
            return 3;
        } else if (pos <= 5) {
            return 6;
        } else {
            return 9;
        }
    }

    public boolean validarFila(int i, int valor) {
        for (int j = 0; j < sudoku[i].length; j++) {
            if (sudoku[i][j] == valor) {
                return false;
            }
        }
        return true;
    }

    public boolean validarColumna(int j, int valor) {
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][j] == valor) {
                return false;
            }
        }
        return true;
    }

    public void mostrarSudoku() {
        resolverSudoku();
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j]);
                if (!(j == sudoku[0].length - 1)) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public void generarSudoku(int nivel) {
        limpiarSudoku();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = random.nextInt(9) + 1;
                if (validarCuadrante(i, j, num)) {
                    sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                int num = random.nextInt(9) + 1;
                if (validarCuadrante(i, j, num)) {
                    sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }

        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                int num = random.nextInt(9) + 1;
                if (validarCuadrante(i, j, num)) {
                    sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }
        resolverSudoku();

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                int aux = j;
                int rand = random.nextInt(nivel + 1);
                j += rand;
                for (int k = aux; k < j && k < sudoku.length; k++) {
                    sudoku[i][k] = 0;
                }
            }
        }

    }

    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
//      public boolean verSolucion(JTextField[][] listaTxt) {
//          
//          for (int i = 0; i < sudoku.length; i++) {
//            for (int j = 0; j < sudoku[0].length; j++) {
//                if (sudoku[i][j] == 0) {
//                    for (int valor = 1; valor <= 9; valor++) {
//                        if (validarFila(i, valor) && validarColumna(j, valor) && validarCuadrante(i, j, valor)) {
//                            sudoku[i][j] = valor;
//                            listaTxt[i][j].setText(String.valueOf(getSudoku()[i][j]));
//                            if (verSolucion(listaTxt)) {
//                                return true;
//                            }
//                            sudoku[i][j] = 0;
//                              listaTxt[i][j].setText("");
//                        }
//                        try {
//                            Thread.sleep(10);
//                        } catch (Exception e) {
//                        }
//                    }
//                    return false;
//                }
//            }
//        }
//        return true;
//          
//
//    }

}
