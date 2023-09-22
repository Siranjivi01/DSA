class StackPro{
    public int firstValue,capacity;
    public int arr[];

StackPro(int size){
    arr=new int[size];
    firstValue=-1;
    capacity=size;
}

public boolean Stackfull(){
    return firstValue==capacity-1;
}
public boolean StackEmpty(){
    return firstValue==-1;
}
public void AddStack(int x){
if(Stackfull()){
    System.out.println("Stack Alread Fulled");
    System.exit(1);
}
    arr[++firstValue]=x;
}
public int RemoveStack(){
    if(StackEmpty()){
        System.out.println("Stack is Empty");
        System.exit(1);;
    }
    return arr[--firstValue];
}
public void ShowStack(){
    System.out.println("Stack Values");
    for(int i=0;i<=firstValue;i++){
      System.out.println("Stack Values:"+ arr[i]);  
    }
}
public static void main(String[] args){
StackPro s=new StackPro(5);
s.AddStack(1);
s.AddStack(2);
s.AddStack(3);
s.AddStack(4);
s.RemoveStack();
s.ShowStack();
}
}