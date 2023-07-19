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
    public void Check_Win_When_X_Win_At_Row() {
        String[][] board = {{"X", "X", "X"}, {"-", "-", "-"}, {"-", "-", "-"}};
        String turn = "X";
        int row = 1;
        int column = 1;
        assertEquals(true, Lab3.checkWinner(board, row, column, turn));
    }
    
//    @Test
//    public void Check_Win_When_X_Win_At_()

}
