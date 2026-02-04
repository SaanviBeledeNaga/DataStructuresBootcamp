import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class LinearQueue
{
	private static final int Max = 10;
	private int[] queue;
	private int front, rear;
	public LinearQueue()
	{
		queue = new int[MAX];
		front = 0;
		rear = 0;
	}
	public boolean isEmpty()
	{
		return front == rear;
	}
	public boolean isFull()
	{
		return rear == MAX;
	}
	public void enqueue(int item)
	{
		if(isFull())
		{
			System.out.println("Queue is full. Cannot enqueue " + item);
		}
		else
		{
			queue[rear++] = item;
			System.out.println("Enqueued: "+item);
		}
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty. Cannot dequeue");
			return -1;
		}
		else
		{
			int item = queue[front++];
			System.out.println("Dequeued: "+item);
			return item;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty.");
		}
		else
		{
			System.out.print("Queue: ");
			for(int i = front; i<rear;i++)
			{
				System.out.print(queue[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		LinearQueue queue = new LinearQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		queue.dequeue();
		queue.enqueue(40);
		queue.display();
	}
}

		

	