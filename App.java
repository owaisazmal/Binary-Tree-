import tools.Symbols;

public class App {
    public static void main(String[] args) 
    {
    

        //Symbols.PrintSymbols();
        //CardGame G = new CardGame();
        //G.Play();
        //Player p = new Player();
        //p.playMusic("c:\\temp\\music.wav");
        BinaryTree C = new BinaryTree();

        C.Insert(12);
        C.Insert(20);
        C.Insert(16);
        C.Insert(5);
        C.Insert(21);
        C.Insert(3);
        C.Insert(28);


        C.DisplayInfo();

        while (true);
    }
}


