// stack implementation in java
class Stack{
//store element of stack
private int arr [];
//represent top of Stack
private int top;
//total capacity of the Stack
private int capacity;
//creating a Stack
Stack(int Size){
//initialize the array
//initialize the Stack variable
arr=new int[Size];
capacity=Size;
top=-1;
}
//push element to the top of Stack
public void push(int x){
if (isFull()){
System.out.println("StackOverFlow");
//terminates the program
System.exit(1);
}
//insert element on top of stack
System.out.println("Inserting"+x);
arr[++top]=x;
}
//pop element from top of stack
public int pop(){
//if stack is empty
//no element to pop
if (isEmpty());{
System.out.println("STACK EMPTY");
//terminates the program
System.exit(1);
}
//pop element from top of stack
return arr[top--];
}
//return size of the stack
public int getSize(){
  return top+1;
}
//check if the stack is empty
public boolean isEmpty(){
  return top==-1;
}
//check if the stack is full
public Boolean isFull(){
  return top==capacity-1;
}
//display element of stack
public void printStack(){
  for(int i=0; i<=top; i++){
  System.out.print(arr[i]+ ",");
  }
}
public static void main (String[] args){
Stack stack = new Stack(5);
stack.push(1);
stack.push(2);
stack.push(3);
System.out.print("stack:");
stack.printStack();
//remove element from stack
stack.pop();
System.out.print("\n After popping out");
stack.printStack();
}
}

