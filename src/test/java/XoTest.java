/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.lab3.Lab3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class XoTest {

    public XoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
//    @Test
    /**
     *
     */
    @Test
    public void Check_Not_Play() {
        String[][] board = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        String turn = "X";
        int row = 1;
        int column = 1;
        assertEquals(false, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_X_Win_At_Row() {
        String[][] board = {{"X", "X", "X"}, {"-", "-", "-"}, {"-", "-", "-"}};
        String turn = "X";
        int row = 1;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_X_Win_At_Row2() {
        String[][] board = {{"-", "-", "-"}, {"X", "X", "X"}, {"-", "-", "-"}};
        String turn = "X";
        int row = 2;
        int column = 2;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_X_Win_At_Column() {
        String[][] board = {{"X", "-", "-"}, {"X", "-", "-"}, {"X", "-", "-"}};
        String turn = "X";
        int row = 1;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_X_Win_Diagonal_1() {
        String[][] board = {{"X", "-", "-"}, {"-", "X", "-"}, {"-", "-", "X"}};
        String turn = "X";
        int row = 1;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_X_Win_Diagonal_2() {
        String[][] board = {{"-", "-", "X"}, {"-", "X", "-"}, {"X", "-", "-"}};
        String turn = "X";
        int row = 3;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_O_Win_At_Row() {
        String[][] board = {{"O", "O", "O"}, {"-", "-", "-"}, {"-", "-", "-"}};
        String turn = "O";
        int row = 1;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_O_Win_At_Row3() {
        String[][] board = {{"-", "-", "-"}, {"-", "-", "-"}, {"O", "O", "O"}};
        String turn = "O";
        int row = 3;
        int column = 2;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_O_Win_At_Column() {
        String[][] board = {{"O", "-", "-"}, {"O", "-", "-"}, {"O", "-", "-"}};
        String turn = "O";
        int row = 1;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_O_Win_At_Column2() {
        String[][] board = {{"-", "O", "-"}, {"-", "O", "-"}, {"-", "O", "-"}};
        String turn = "O";
        int row = 2;
        int column = 2;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_O_Win_At_Column3() {
        String[][] board = {{"-", "-", "O"}, {"-", "-", "O"}, {"-", "-", "O"}};
        String turn = "O";
        int row = 3;
        int column = 3;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_O_Win_Diagonal_1() {
        String[][] board = {{"O", "-", "-"}, {"-", "O", "-"}, {"-", "-", "O"}};
        String turn = "O";
        int row = 1;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void Check_Win_When_O_Win_Diagonal_2() {
        String[][] board = {{"-", "-", "O"}, {"-", "O", "-"}, {"O", "-", "-"}};
        String turn = "O";
        int row = 3;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }

    @Test
    public void check_Draw() {
        String[][] board = {{"X", "O", " X"}, {"X", " O ", "X"}, {" O ", "X", "O"}};

        assertEquals(true, Lab3.checkDraw(board));
    }

    @Test
    public void check_No_One_Win_Not_Finish() {
        String[][] board = {{"-", "O", " -"}, {"X", " O ", "X"}, {" O ", "X", "O"}};
        String turn = "O";
        int row = 1;
        int column = 2;
        assertEquals(false, Lab3.checkWinner(board, row, column, turn));
    }
}
