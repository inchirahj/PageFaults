import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) 
  {
    System.out.println("Welcome to the simulator! We are using the FIFO algorithm.");
    
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    System.out.print("How many virtual pages are in the process: ");
    int virtualPages = s.nextInt();
    System.out.print("How many frames are allocated to the process: ");
    int frames = s.nextInt();
    System.out.print("How many page references would you like to simulate: ");
    int pageRef = s.nextInt();
    s.close();


    int[] pages = new int[frames];
    int[] pageReferences = new int[pageRef];
    for(int i = 0; i < pageRef; i++)
    {
     pageReferences[i] = r.nextInt(virtualPages) + 1;   
    }

    int pageFaults = 0;
    int i = 0;
    int j = 0;
 
    while (0 == 0)
    {

      if (contains(pages, pageReferences[i]) == false)
      {
        pages[j] = pageReferences[i];
        pageFaults++;
        j++;
      }
      i++;
      if(i == pageRef)
      {
        break;
      }
                
      if (j == frames)
      {
        j = 0;
      } 
    }
    
    double percentage = (double)pageFaults*100/pageRef;
    System.out.println("The algorithm produced " + pageFaults + "     page faults, or " + percentage + "%.");
  }


  public static boolean contains(int[] arr, int i) 
  {

    for(int j = 0; j < arr.length; j++)
    {
      if(arr[j] == i)
      {
        return true;
      }
    }
    return false;
  }
}