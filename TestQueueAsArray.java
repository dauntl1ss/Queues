import java.util.*;
public class TestQueueAsArray
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
   
   
      int item, size, choice = 0, input = 0;
       	   
            System.out.print("Enter size: ");
            size = console.nextInt();
            
            QueueAsArrayClass obj = new QueueAsArrayClass(size);

       
       
			do{
			System.out.print("\n__________________MENU__________________\n");
			System.out.print("1 -- ENQUEUE\n2 -- DEQUEUE\n3 -- FRONT\n4 -- REAR\n5 -- PRINT\n6 -- EXIT\n");
			System.out.print("______________END MENU__________________\n");
         

				System.out.print("\nSelect an item from the menu: ");
			   choice = console.nextInt();
				switch(choice){
					case 1:
					      System.out.print("-----ENQUEUE-----\n");
                     item = console.nextInt();
                     obj.enqueue(item);
                     break;
               case 2:
                     System.out.print("-----DEQUEUE-----\n");
                     obj.dequeue();
                     break;
               case 3:
                     System.out.print("-----FRONT-----\n");
                     obj.front();
                     break;
               case 4:
                     System.out.print("-----REAR-----\n");
                     obj.rear();
                     break;
               case 5:
                     System.out.print("-----PRINT-----\n");
                     obj.print();
                     break;
               case 6:
                     System.out.print("-----EXIT-----\n");
                     break;
            }
			}while(choice < 6);
  
   
   
   
   }
}