import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
  //code using recursion to call from the user and add figure the price and what color of the folders they want.  

      Scanner scan =  new Scanner(System.in);

      System.out.println("How many folders do you want to buy?"); 
        int amountOfFolders = scan.nextInt(); 
      System.out.println("What is the price of the folders?"); 
        double foldersPrice = scan.nextDouble(); 
      
      int i = 0; 

      int result = folderCost(amountOfFolders, foldersPrice, i);
  }

      static double folderCost(int amountOfFolders, double foldersPrice, int i)
      {
        if(i < amountOfFolders) 
          i++; 
        { 
          return foldersPrice + folderCost(amountOfFolders, foldersPrice, i); 
        }else{
          return 0;
        }
      }
    }