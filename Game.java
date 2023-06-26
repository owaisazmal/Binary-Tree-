import java.util.LinkedList;
import java.util.Scanner;
import tools.*;

public class Game {

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
    {51,91,91,91,91,91,91,91,10,51},
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
                else if (card[cardNum][i][j] > 0 && card[cardNum][i][j] <= 9)
                    printxy(x + j, y + i, foreColor[cardNum][i][j] + backColor[cardNum][i][j] + String.valueOf(card[cardNum][i][j]));
                else if (card[cardNum][i][j] == 10)
                {
                    printxy(x + j-1, y + i, foreColor[cardNum][i][j] + backColor[cardNum][i][j] + "1");                                
                    printxy(x + j, y + i, foreColor[cardNum][i][j] + backColor[cardNum][i][j] + "0");                                
                }
                else
                    printxy(x + j, y + i, foreColor[cardNum][i][j] + backColor[cardNum][i][j] + Symbols.EXTENDED[card[cardNum][i][j]]);
            }
            System.out.println(" ");
        }
    }

    void PrintNumbers(int x, int y, LinkedList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); i++) 
        {
            //printxy(x,y, numbers.get(i).toString());
            DisplayCard(x,y, numbers.get(i)-1);
            x=x+15;
            //System.out.println(numbers.get(i));
        }
    }

    void DisplayDeck()
    {
        cls();
        printxy(0,2,"Computer");
        PrintNumbers(10,2,computerCards);
        printxy(0,20,"User");
        PrintNumbers(10,25, userCards);
    }

    int GetComputerNumber()
    {
        return computerCards.getFirst();
    }

    public void Run()
    {
        Integer userNumber;
        Integer computerNumber;

        userCards.add(1);
        userCards.add(4);
        computerCards.add(2);
        computerCards.add(3);

        DisplayDeck();

        Scanner scan = new Scanner(System.in);
        while (!userCards.isEmpty())    
        {
            userNumber = scan.nextInt();
            // remove number from linked list
            userCards.remove(userNumber);
            // display new deck of cards
            DisplayDeck();            
             // computer picks a number
            computerNumber = GetComputerNumber();
            // delete number from coputer deck
            computerCards.remove(computerNumber);
            // display new deck of cards
            DisplayDeck();     
            // display "removed card" in the middle
            DisplayCard(20, 15,userNumber-1 );
            // display computer removed card
            DisplayCard(30, 15,computerNumber -1 );

            if (userNumber > computerNumber)
            {

            }
            scan.close();
        }

        //PlaySound("goodbye.wav");

        //Symbols.PrintSymbols();
        //cls();
        //DisplayCard(5, 5, 0);
        //DisplayCard(15, 5, 1);
        //DisplayCard(25, 5, 2);
        //DisplayCard(35, 5, 3);
        
    }

}
