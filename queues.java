import java.util.Arrays;
public class queues
{
 int array[], size;
 int count = 0;
 
 public queues(int size)
 {
   this.size = size;
   array = new int[size];
 } 
 
 public boolean isEmpty()
 {
   if(count == 0)
      return true;
   else
      return false;
 }
 
 public boolean isFull()
 {
   if(count >= size)
      return true;
   else
      return false;
 }
 
 
 public void enqueue(int item)
 {
   if(isFull())
   {
      System.out.print("Queue is full.");
   }
   else
   {
      array[count] = item;
      count++;
   }
 }
 
 public void dequeue()
 {
  if(isEmpty())
  {
      System.out.print("Queue is empty.");
  }
  else
  {
      int temp;
      
      array[0] = 0;
      
         for(int j = 0; j < size - 1; ++j)
         {
            temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
         }
         
         count--;
  }     
 }
 
 public void deleteAll()
 {
   Arrays.fill(array, 0);
 }
 
 public void front()
 {
   if(isEmpty())
   {
      System.out.print("\nQueue is empty.");
   }
   else
   {
      System.out.print(array[0]);
   }
 }
 
 public void print()
 {
   for(int val: array)
   {
      if(val != 0)
         System.out.print(val + " ");
   }  
 }
 
    
}