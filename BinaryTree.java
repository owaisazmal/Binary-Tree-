import java.util.PriorityQueue;
import java.util.ResourceBundle.Control;

import tools.Controls;
import tools.Colors;

public class BinaryTree {
    public Node root;
    int [][] AdjacencyMatrix = new int[30][30];

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value,0);
        }
    
        if (value < current.intvalue) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.intvalue) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
    
        return current;
    }

    public void Insert(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } 
        if (value == current.value) {
            return true;
        } 
        return value < current.value
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
    
        if (value == current.value) 
        {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            
            if (current.left == null) {
                return current.right;
            }  

            int smallestValue = findSmallestValue(current.right);
            current.intvalue = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        } 
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print("->" + node.get_intValue());
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print("->" + node.get_intValue());
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print("->" + node.get_intValue());
        }
    }

    public void printnodes(Node node, int x, int y, int width, int height) {
        if (node != null) {
            // Print node value
            Controls.Box(x - 2, y - 1, 6, 3, 91, Colors.GREEN, Colors.BLACK_BACKGROUND);
            Controls.SetForegroundBackgroundColor(Colors.YELLOW, Colors.GREEN_BACKGROUND, "");
            Controls.printxy(x, y, node.get_intValue());
            Controls.SetForegroundBackgroundColor(Colors.WHITE, Colors.BLACK_BACKGROUND, "");
    
            // Print left child node
            if (node.left != null) {
                Controls.Box(x - 12, y + 1, 6, 3, 91, Colors.BLACK, Colors.BLACK_BACKGROUND);
                Controls.SetForegroundBackgroundColor(Colors.YELLOW, Colors.GREEN_BACKGROUND, "");
                Controls.SetForegroundBackgroundColor(Colors.WHITE, Colors.BLACK_BACKGROUND, "/");
            }
    
            // Print right child node
            if (node.right != null) {
                Controls.Box(x + 5, y + 3, 1, 1, 91, Colors.BLACK, Colors.BLACK_BACKGROUND);
                Controls.SetForegroundBackgroundColor(Colors.YELLOW, Colors.GREEN_BACKGROUND, "");
                Controls.SetForegroundBackgroundColor(Colors.WHITE, Colors.BLACK_BACKGROUND, "\\");
            }
    
            // Recursively print child nodes
            printnodes(node.left, x - (width / 2), y + (height / 2), width, height);
            printnodes(node.right, x + (width / 2), y + (height / 2), width, height);
        }
    }
    
   



    public void CreateNodes()
    {
        PriorityQueue<Node> Q = new PriorityQueue<Node>();
        
        Q.add(new Node('A',5));
        Q.add(new Node('Z',1));
        Q.add(new Node('X',9));
        Q.add(new Node('T',2));
        Q.add(new Node('R',13));

        while (!Q.isEmpty())
        {
            Node x = Q.poll();
            System.out.println(x.value + " : " + String.valueOf(x.weight));
        }
    }

    public void FillAdjacencyMatrix(Node ptr)
    {
        if (ptr == null) 
        {
            return;
        }

        if (ptr.left != null) 
        {
            AdjacencyMatrix[ptr.get_intValue()][ptr.left.get_intValue()] = 1;
        }

        if (ptr.right != null) 
        {
            AdjacencyMatrix[ptr.get_intValue()][ptr.right.get_intValue()] = 1;
        }
        
        FillAdjacencyMatrix(ptr.left);
        FillAdjacencyMatrix(ptr.right);

    }
    public void PrintAdjacencyMatrix()
    {

        FillAdjacencyMatrix(root);

        System.out.print("   ");

        for (int i = 0; i < 30; i++) 
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 30; i++) 
        {
            System.out.print(i + ": "); 

            for (int j = 0; j < 30; j++)
            {
                System.out.printf(AdjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void DisplayInfo()
    {
        //CreateNodes();
        System.out.print("\033[40m");
        Controls.cls();

        printnodes(root,70,5,20,10);
        System.out.println();
        System.out.println(" \ntraverse in Order");
        traverseInOrder(root);
        //delete(100);
        System.out.println(" \ntraverse in pre - Order");
        traversePreOrder(root);
        //add(1);
        System.out.println(" \ntraverse in Post - Order");
        traversePostOrder(root);
        System.out.println();
        PrintAdjacencyMatrix();

        System.out.print("\033[0m");
    }
}
