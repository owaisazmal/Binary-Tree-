import java.util.LinkedList;
import java.util.Scanner;
import java.lang.Thread;
import tools.*;

public class GameComplete {

LinkedList<Integer> userCards = new LinkedList<>();
LinkedList<Integer> computerCards = new LinkedList<>();


int card[][][] = 
{

    { {90,68,68,68,68,68,68,68,68,63},
    {51,91,91,91,91,91,91,91,1,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {64,68,68,68,68,68,68,68,68,89} },

    { {90,68,68,68,68,68,68,68,68,63},
    {51,91,91,91,91,91,91,91,2,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,11,25,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {64,68,68,68,68,68,68,68,68,89} },

    { {90,68,68,68,68,68,68,68,68,63},
    {51,91,91,91,91,91,91,91,3,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {64,68,68,68,68,68,68,68,68,89} },

    { {90,68,68,68,68,68,68,68,68,63},
    {51,91,91,91,91,91,91,91,4,51},
    {51,91,91,91,91,18,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {51,91,91,91,91,91,91,91,91,51},
    {64,68,68,68,68,68,68,68,68,89} },
};

String foreColor[][][] = 
{
    { {Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE},
    {Colors.BLUE, Colors.BLACK, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.BLACK, Colors.BLUE},
    {Colors.BLUE, Colors.WHITE, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE, Colors.BLUE},
    {Colors.BLUE, Colors.WHITE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.WHITE, Colors.BLUE},
    {Colors.BLUE, Colors.WHITE, Colors.YELLOW, Colors.YELLOW, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.YELLOW, Colors.WHITE, Colors.BLUE},
    {Colors.BLUE, Colors.WHITE, Colors.YELLOW, Colors.GREEN, Colors.YELLOW, Colors.YELLOW, Colors.BLUE, Colors.YELLOW, Colors.WHITE, Colors.BLUE},
    {Colors.BLUE, Colors.BLACK, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.BLACK, Colors.BLUE},
    {Colors.BLUE, Colors.BLACK, Colors.YELLOW, Colors.GREEN, Colors.YELLOW, Colors.YELLOW, Colors.GREEN, Colors.YELLOW, Colors.BLACK, Colors.BLUE},
    {Colors.BLUE, Colors.BLACK, Colors.YELLOW, Colors.YELLOW, Colors.GREEN, Colors.GREEN, Colors.YELLOW, Colors.YELLOW, Colors.BLACK, Colors.BLUE},
    {Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE} },

    { {Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW},
    {Colors.YELLOW, Colors.BLACK, Colors.BLACK, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.BLACK, Colors.BLACK, Colors.YELLOW},
    {Colors.YELLOW, Colors.BLACK, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.BLACK, Colors.YELLOW},
    {Colors.YELLOW, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.BLUE, Colors.YELLOW, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.YELLOW},
    {Colors.YELLOW, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.PURPLE, Colors.YELLOW},
    {Colors.YELLOW, Colors.PURPLE, Colors.GREEN, Colors.WHITE, Colors.GREEN, Colors.GREEN, Colors.WHITE, Colors.GREEN, Colors.PURPLE, Colors.YELLOW},
    {Colors.YELLOW, Colors.BLACK, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.BLACK, Colors.YELLOW}, 
    {Colors.YELLOW, Colors.BLACK, Colors.GREEN, Colors.GREEN, Colors.WHITE, Colors.WHITE, Colors.GREEN, Colors.GREEN, Colors.BLACK, Colors.YELLOW},
    {Colors.YELLOW, Colors.BLACK, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.BLACK, Colors.YELLOW},
    {Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW} },

    { {Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN},
    {Colors.GREEN, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.YELLOW, Colors.YELLOW, Colors.BLACK, Colors.BLACK, Colors.GREEN},
    {Colors.GREEN, Colors.BLACK, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.BLACK, Colors.BLACK, Colors.GREEN},
    {Colors.GREEN, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.YELLOW, Colors.GREEN},
    {Colors.GREEN, Colors.YELLOW, Colors.YELLOW, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.BLACK, Colors.GREEN},
    {Colors.GREEN, Colors.RED, Colors.RED, Colors.BLUE, Colors.RED, Colors.RED, Colors.BLUE, Colors.RED, Colors.RED, Colors.GREEN},
    {Colors.GREEN, Colors.BLACK, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.BLACK, Colors.GREEN},   
    {Colors.GREEN, Colors.BLACK, Colors.RED, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.BLUE, Colors.RED, Colors.BLACK, Colors.GREEN},
    {Colors.GREEN, Colors.BLACK, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.BLACK, Colors.GREEN},
    {Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN} },

    { {Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED},
    {Colors.RED, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.BLACK, Colors.BLACK, Colors.RED},
    {Colors.RED, Colors.BLACK, Colors.BLACK, Colors.GREEN, Colors.GREEN, Colors.RED, Colors.GREEN, Colors.GREEN, Colors.BLACK, Colors.RED},
    {Colors.RED, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.GREEN, Colors.RED},
    {Colors.RED, Colors.BLACK, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.BLACK, Colors.RED},
    {Colors.RED, Colors.WHITE, Colors.CYAN, Colors.BLACK, Colors.CYAN, Colors.CYAN, Colors.BLACK, Colors.CYAN, Colors.WHITE, Colors.RED},
    {Colors.RED, Colors.BLACK, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.BLACK, Colors.RED},
    {Colors.RED, Colors.BLACK, Colors.CYAN, Colors.YELLOW, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.BLACK, Colors.RED},
    {Colors.RED, Colors.BLACK, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.CYAN, Colors.BLACK, Colors.RED},
    {Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED, Colors.RED} },
};

String backColor[][][] = {

    { {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
     {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND}
 },

 { {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND}
 },

 { {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND}
 },

 { {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND},
 {Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND}
 }

};

    public void cls()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    

    public static void printxy(int col, int row, String val)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%s[%d;%df",escCode,row,col));
        System.out.print(val);
    }

    void DisplayCard(int x, int y, int cardNum)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (card[cardNum][i][j] == 0)
                    printxy(x + j, y + i, foreColor[cardNum][i][j] + backColor[cardNum][i][j] + " ");
                else if (card[cardNum][i][j] > 0 && card[cardNum][i][j] < 9)
                    printxy(x + j, y + i, foreColor[cardNum][i][j] + backColor[cardNum][i][j] + String.valueOf(card[cardNum][i][j]));
                else
                    printxy(x + j, y + i, foreColor[cardNum][i][j] + backColor[cardNum][i][j] + Symbols.EXTENDED[card[cardNum][i][j]]);
            }
            System.out.println(" ");
        }
    }

    void DisplayDeck(int x, int y, LinkedList<Integer>  thecards)
    {
        for (int i=0; i < thecards.size();i++)
        {
            DisplayCard(x, y, thecards.get(i)-1);
            x=x+15;
        }
    }

    void DisplayScreen()
    {
        cls();
        printxy(5,2,"Computer:");
        DisplayDeck(15,2,computerCards);
        printxy(5,25,"User:");
        DisplayDeck(15,25,userCards);
    }

    int GetRandomNumber( LinkedList<Integer>  numbers)
    {
        return numbers.get(0);
    }

    public void Run()
    {

        // Add elements to the linked list
        userCards.add(1);
        computerCards.add(2);
        userCards.add(3);
        computerCards.add(4);

        DisplayScreen();

        Scanner read = new Scanner(System.in);

        while (! userCards.isEmpty())
        {
            Integer number =    read.nextInt();  
            userCards.remove(number);
            DisplayScreen();
            DisplayCard(21, 14, number-1);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e) {
           
                // catching the exception
                System.out.println(e);
            }
            Integer comoputernumber = GetRandomNumber(computerCards);
            computerCards.remove(comoputernumber);
            DisplayScreen();
            DisplayCard(21, 14, number-1);
            DisplayCard(31, 14, comoputernumber-1);

            //
        }

        read.close();

        //Symbols.PrintSymbols();

       /* DisplayCard(5, 5, 0);
        System.out.println("");
        DisplayCard(15, 5, 1);
        System.out.println("");
        DisplayCard(25, 5, 2);
        System.out.println("");
        DisplayCard(35, 5, 3);
        */
    }

}
