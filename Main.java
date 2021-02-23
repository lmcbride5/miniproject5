import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
  //code using recursion to call from the user and add figure the price and what color of the folders they want.  

      Scanner scan =  new Scanner(System.in);
//using a scanner to ask the user for the amount of folders and the prices 
      System.out.println("How many folders do you want to buy?"); 
        int amountOfFolders = scan.nextInt(); 
//print statement and scanner variable asking and storing the amount of folders
      System.out.println("What is the price of the folders?"); 
        double foldersPrice = scan.nextDouble(); 
//print statement and scanner variable askign and storing the price of folders 
      
      int i = 0; 
//initalizing the i variable 
      double result = folderCost(amountOfFolders, foldersPrice, i);
      System.out.println("The total cost is " + result); 
//printing out the method call and statement
  }

      static double folderCost(int amountOfFolders, double foldersPrice, int i)
      {
//method w/ parameters 
        if(i < amountOfFolders) 
        { 
          i++; 
          return foldersPrice + folderCost(amountOfFolders, foldersPrice, i); 
//if statement asking if 0 (i) is less than the amount of folders, if yes passing through and adding one to i. if one is less than the amount of folders, passing it through again and adding one then the price of the folders. This repeats itself until it reaches the amount of folders number. Once it hits that, the total cost is printed out. 
        }else{
          return 0;
//the base case of the method. 
        }
      }
    }