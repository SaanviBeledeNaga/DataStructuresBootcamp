import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Stack
{
	int[] arr = new int[100];
	int top = -1;
	boolean isEmpty()
	{
		return top == -1;
	}
	boolean isFull()
	{
		return top == arr.length - 1;
	}
	void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			return;
		}
		top++;
		arr[top] = data;
		System.out.println(data + " pushed to stack");
	}
	void pop()
	{
		if(isEmpty())
		{
			System.out.println(arr[top]+" Stack is empty");
			return;
		}
		System.out.println(arr[top]+" popped from stack");
		top--;
	}
	Integer peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		return arr[top];
	}
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println("Top element: "+stack.peek());
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println("Final top element: "+stack.peek());
	}
}

	
			