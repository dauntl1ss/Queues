public class QueueClass 
{
   private QueueNode front;//Head
   private QueueNode rear;//Tail
   
   public QueueClass()
   {
      front = null;
      rear = null;
   }
   
   public QueueClass(QueueNode front, QueueNode rear)
   {
      this.front = front;
      this.rear = rear;
   }
   
   public boolean isEmpty()
   {
      if(front == null && rear == null)
         return true;
      else
         return false;
   }
   
   public void enqueue(int info)
   {    
     if(isEmpty())
     {
         QueueNode Node = new QueueNode(null, info, null);
         front = Node;
         rear = Node;
     }
     else
     {
         QueueNode Node = new QueueNode(rear, info, null);
         rear = Node;
         
         Node.previous.next = Node;
     }
   }  
   
   public void dequeue()
   {
      if(isEmpty())
      {
         System.out.print("\nAdd a node first.");
      }
      else if(front == rear)
      {
         front = null;
         rear = null;
      }
      else
      {
         front.next.previous = null;
         front = front.next;
      }
   }
   
   public void front()
   {
      if(isEmpty())
      {
         System.out.print("\nFront is empty. Add a node first");
      }
      else
         System.out.print(front.info);
   }
   public void rear()
   {
      if(isEmpty())
      {
         System.out.print("\nRear is empty. Add a node first");
      }
      else
         System.out.print(rear.info);
   }
   
   public void print()
   {
      QueueNode current = front;
      
      while(current != null)
      {
         System.out.print(current.info + " ");
         current = current.next;
      }
   }
}