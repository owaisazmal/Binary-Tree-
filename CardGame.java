import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import tools.*;
    public class CardGame {


            LinkedList<Integer> userCards = new LinkedList<>();
            LinkedList<Integer> computerCards = new LinkedList<>();
            LinkedList<Integer> cards = new LinkedList<>();


        int[][][] card = 
        {
        { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,1,0,0,0,0,0,91,0,0,0,0,0,0,51},
            {51,0,0,0,0,0,91,0,91,0,0,0,0,0,51},
            {51,0,0,0,0,91,0,0,0,91,0,0,0,0,51},
            {51,0,0,0,91,0,50,0,50,0,91,0,0,0,51},
            {51,0,0,91,0,0,0,50,0,0,0,91,0,0,51},
            {51,0,91,0,0,0,50,0,50,0,0,0,91,0,51},
            {51,0,91,0,0,0,0,0,0,0,0,0,91,0,51},
            {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,2,50,0,0,0,52,52,52,0,0,0,50,0,51},
            {51,0,0,50,0,0,52,0,52,0,0,50,0,0,51},
            {51,0,0,0,50,0,52,52,52,0,50,0,0,0,51},
            {51,0,52,52,52,0,50,0,50,0,52,52,52,0,51},
            {51,0,52,0,52,0,0,50,0,0,52,0,52,0,51},
            {51,0,52,52,52,0,50,0,50,0,52,52,52,0,51},
            {51,0,0,0,50,0,0,0,0,0,50,0,0,0,51},
            {51,0,0,50,0,0,0,0,0,0,0,50,0,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,3,50,0,0,0,0,0,0,0,0,0,50,0,51},
            {51,50,50,0,0,0,0,91,91,91,91,0,50,50,51},
            {51,0,0,0,0,91,91,0,0,0,0,91,0,0,51},
            {51,0,0,91,91,0,0,0,0,0,91,0,0,0,51},
            {51,0,91,0,0,0,0,0,91,0,0,0,0,0,51},
            {51,0,0,91,91,0,0,0,0,91,0,0,0,0,51},
            {51,50,50,0,0,91,91,0,0,0,91,0,50,50,51},
            {51,0,50,0,0,0,0,0,91,91,0,0,50,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,4,0,0,0,0,50,50,0,0,0,0,0,0,51},
            {51,0,0,0,0,50,50,50,50,0,0,0,0,0,51},
            {51,0,0,0,50,50,50,50,50,50,0,0,0,0,51},
            {51,0,0,50,50,50,50,50,50,50,50,0,0,0,51},
            {51,0,50,50,50,50,50,50,50,50,50,50,0,0,51},
            {51,0,50,50,50,50,50,50,50,50,50,50,0,0,51},
            {51,0,0,0,0,0,91,91,0,0,0,0,0,0,51},
            {51,0,0,0,0,0,91,91,0,0,0,0,0,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,5,0,0,0,0,0,0,0,0,0,0,0,0,51},
            {51,0,0,0,0,0,0,91,0,0,0,0,0,0,51},
            {51,0,0,0,0,0,91,50,91,0,0,0,0,0,51},
            {51,0,0,0,0,91,0,50,0,91,0,0,0,0,51},
            {51,0,0,0,91,0,21,50,21,0,91,0,0,0,51},
            {51,0,0,91,0,0,21,50,21,0,0,91,0,0,51},
            {51,0,91,0,0,0,0,50,0,0,0,0,91,0,51},
            {51,91,0,0,0,0,0,50,0,0,0,0,0,91,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,6,0,0,0,0,20,20,20,0,0,0,0,0,51},
            {51,0,18,18,18,18,18,18,18,18,18,18,18,0,51},
            {51,0,0,91,91,91,91,91,91,91,91,91,0,0,51},
            {51,0,0,0,91,91,91,91,91,91,91,0,0,0,51},
            {51,0,0,0,0,91,91,91,91,91,0,0,0,0,51},
            {51,0,0,0,0,0,91,91,91,0,0,0,0,0,51},
            {51,0,0,0,0,0,0,91,0,0,0,0,0,0,51},
            {51,0,0,0,0,0,0,0,0,0,0,0,0,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,7,0,0,0,0,0,0,0,0,0,0,0,0,51},
            {51,0,81,81,81,81,81,81,81,81,81,81,81,0,51},
            {51,0,81,0,0,0,0,91,0,0,0,0,81,0,51},
            {51,0,81,0,0,0,91,91,91,0,0,0,81,0,51},
            {51,0,81,0,0,91,91,91,91,91,0,0,81,0,51},
            {51,0,81,0,91,91,91,91,91,91,91,0,81,0,51},
            {51,0,81,81,81,81,81,81,81,81,81,81,81,0,51},
            {51,0,0,0,0,0,0,0,0,0,0,0,0,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,8,0,0,0,0,0,70,0,0,0,0,0,0,51},
            {51,0,0,0,0,0,0,70,0,0,0,0,0,0,51},
            {51,70,70,0,0,0,0,70,0,0,0,0,70,70,51},
            {51,70,70,70,70,70,70,70,70,70,70,70,70,70,51},
            {51,70,70,70,70,70,70,70,70,70,70,70,70,70,51},
            {51,70,70,0,0,0,0,70,0,0,0,0,70,70,51},
            {51,0,0,0,0,0,0,70,0,0,0,0,0,0,51},
            {51,0,0,0,0,0,0,70,0,0,0,0,0,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,9,0,0,0,0,0,0,0,0,0,0,0,0,51},
            {51,0,91,0,0,0,0,0,0,0,0,0,91,0,51},
            {51,0,0,0,91,0,0,0,0,0,0,91,0,0,51},
            {51,0,0,0,0,0,75,75,75,0,0,0,0,0,51},
            {51,0,0,0,0,0,75,75,75,0,0,0,0,0,51},
            {51,0,0,91,0,0,0,0,0,0,0,91,0,0,51},
            {51,0,91,0,0,0,0,0,0,0,0,0,91,0,51},
            {51,0,0,0,0,0,0,0,0,0,0,0,0,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} },


            { {90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            {51,0,10,0,0,0,80,80,80,0,0,0,0,0,51},
            {51,0,0,0,0,0,80,80,80,0,0,0,0,0,51},
            {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            {51,0,0,91,91,91,91,91,91,91,91,91,0,0,51},
            {51,0,0,0,91,91,91,91,91,91,91,0,0,0,51},
            {51,0,0,0,0,91,91,91,91,91,0,0,0,0,51},
            {51,0,0,0,0,0,91,91,91,0,0,0,0,0,51},
            {51,0,0,0,0,0,0,91,0,0,0,0,0,0,51},
            {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89} }
        };


        String fcolor[][][] = {
            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.BLUE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.WHITE,Colors.BLUE,Colors.BLUE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.BLUE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.WHITE,Colors.BLUE,Colors.BLUE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW,Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.BLUE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.GREEN,Colors.BLUE,Colors.GREEN,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.BLUE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLUE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.CYAN,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.RED,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.YELLOW},
            {Colors.YELLOW,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.YELLOW},
            {Colors.YELLOW,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.YELLOW},
            {Colors.YELLOW,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} },


            { {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW},
            {Colors.YELLOW,Colors.RED,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.YELLOW},
            {Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW,Colors.YELLOW} }
            
    };


        String bcolor[][][] = {
            { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },


                    { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                            { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },


                            { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },


                                            { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                    Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                            Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },


                        { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },
                                        
                                        { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },
                                                        
        { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },


                        { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },


                                        { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },


                                                        { { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
                                                                { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,
                                                                        Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } }
    };


    public static final char getAscii(int code) 
    {
            return Symbols.EXTENDED[code];
    }


    public static final void printChar(int ascii) 
    {
        System.out.printf("%c%n", getAscii(ascii) );
    }
    public static void printxy(int col, int row, String val)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%s[%d;%df",escCode,row,col));
        System.out.print(val);
    }


    public static void Box(int x, int y, int w, int h, int ascii, String fcolor,String bcolor)
    {
        char val = getAscii(ascii);
        for (int i=0; i < w; i++)
        {
            for (int j=0; j< h; j++)
            {
                
                printxy(x+i,y+j,fcolor + bcolor + val);
            }
        }
    }


    public void DisplayCard(int x, int y, int cardNumber) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                // System.out.print(card[i][j]);
                if (card[cardNumber][i][j] == 0) {
                    printxy(x+j, y+i, " ");
                    printxy(x + j, y + i, String.valueOf(fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]));
                } else if ((card[cardNumber][i][j] >= 1) && (card[cardNumber][i][j] <= 9)) {
                    printxy(x + j, y + i, String.valueOf(fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                            + card[cardNumber][i][j]));          
                } 
                else if ((card[cardNumber][i][j] == 10)) {
                    printxy(x + j - 1, y + i, fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                            + "1");
                    printxy(x + j, y + i, fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                    + "0");
                }
                else {
                    printxy(x + j, y + i, String.valueOf(fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                            + Symbols.EXTENDED[card[cardNumber][i][j]]));
                }
            }
        }
    }


        public void cls()
        {
                    // cls
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
        }


        void PrintNumbers(int x, int y, LinkedList<Integer> numbers) {
            for (int i = 0; i < numbers.size(); i++) {
                    DisplayCard(x,y, numbers.get(i)-1);
                    x += 15;
            }
        }


        void DisplayDeck() {
            cls();
            printxy(0,2, "Computer");
            PrintNumbers(10,2,computerCards);
            printxy(0,25, "User");
            PrintNumbers(10,25,userCards);
        }


        int GetComputerNumber()
        {
            Random rand = new Random();
            int index = rand.nextInt(computerCards.size());
            int randValue = computerCards.get(index);
            return randValue;
        }
        public static int getRandomInteger(int maximum, int minimum){ 
            return ((int) (Math.random()*(maximum - minimum))) + minimum;
        }


        void ShuffleDeck() {
            for (int i = 0; i < 5; i++){
                int index = getRandomInteger(11, 1);
                while (userCards.contains(index)){
                    index = getRandomInteger(11, 1);
                }
                userCards.add(index);
            }
            for (int i = 0; i < 5; i++){
                int index2 = getRandomInteger(11, 1);


                while (computerCards.contains(index2) || userCards.contains(index2)){
                    index2 = getRandomInteger(11, 1);
                    while (index2 == 0){
                        index2 = getRandomInteger(11, 1);
                    }
                }
                if (!computerCards.contains(index2) || !(userCards.contains(index2))){


                    computerCards.add(index2);
                }


            }
        }


        public void Play()
        {


            Integer userNumber;
            Integer computerNumber;
            int userScore = 0;
            int computerScore = 0;


            ShuffleDeck();


            DisplayDeck();


            Scanner scan = new Scanner(System.in);
            while (!userCards.isEmpty())
            {
                printxy(0, 50, "");
                System.out.print("Enter card number to play: ");
                    userNumber = scan.nextInt();
                    // remove number from linked list
                    userCards.remove(userNumber);
                    // display new deck or cards
                    DisplayDeck();
                    // computer picks number
                    computerNumber = GetComputerNumber();
                    // delete number from computer deck
                    computerCards.remove(computerNumber);
                    // display new deck of carfs
                    DisplayDeck();
                    // display "remover card" in middle
                    DisplayCard(15, 15, userNumber - 1);
                    // display computer removed card
                    DisplayCard(30,15,computerNumber - 1);


                    if (userNumber > computerNumber)
                    {
                            userScore++;
                    }
                    if (userNumber < computerNumber) {
                            computerScore++;
                    }
                    printxy(0,35,"");
                    System.out.println("User: " + userScore);
                    printxy(30,35,"");
                    System.out.println("Computer: " + computerScore);


            }
            scan.close();
            if (computerScore > userScore)
            {
                cls();
                System.out.print("Computer Wins!");
                System.out.println("");
            }
            else {
                cls();
                System.out.print("You Win!");
                System.out.println("");
            }
            
            //DisplayCard(3, 3, 0);
            //DisplayCard(18, 3, 1);
            //DisplayCard(33,3,2);
            //DisplayCard(48,3,3);
            //tools.Symbols.PrintSymbols();
        }


    }