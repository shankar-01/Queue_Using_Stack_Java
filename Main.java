import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StackQueue q = new StackQueue();
    printMenu();

    while(true){
      System.out.print("Choice : ");
      switch(scan.nextInt()){
        case 1:
            System.out.print("Enter any thing: ");
            q.enqueue(scan.next());
            System.out.println("enqueued done");
        break;
        case 2:
          System.out.println("dequeued: " + q.dequeue());
        break;
        case 3:
          System.out.println("first: " + q.first());
        break;
        case 4:
          System.out.println("size: " + q.size());
        break;
        case 5:
          System.out.println("is empty?: " + q.isEmpty());
        break;
        case 6:
          System.out.println(q);
        break;
        case 7:
          return;
        default:
          printMenu();
      }
    }

  }
  static void printMenu(){
    System.out.println("Menu");
    System.out.println("1 Enqueue");
    System.out.println("2 Dequeue");
    System.out.println("3 First");
    System.out.println("4 Size");
    System.out.println("5 Is empty?");
    System.out.println("6 Print");
    System.out.println("7 Exit");
    System.out.println("Any Print Menu");

  }
}
