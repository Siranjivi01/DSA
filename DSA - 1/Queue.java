class FormalQueue{
    private int size=10;
    private int Front,Rear;
    private int arr[]=new int[size];
    FormalQueue(){
        Front=-1;
        Rear=-1;
    }
    public boolean CheckEmpty(){
        if(Front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean CheckFull(){
        if(Front==0 && Rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void Enqueue(int x){
        if(CheckFull()){
            System.out.println("Queue has Already Full");
            System.exit(1);
        }
        else{
            Front=0;
            Rear=0;
            arr[++Rear]=x;
            System.out.println("Enqueue Value" +x);
        }
    }
    public void Dequeue(){
        int element;
        if(CheckEmpty()){
            System.out.println("Queue has Already Empty");
            System.exit(1);
        }
        else{
            element=arr[Front];
            if(Front==Rear){
                Front=-1;
                Rear=-1;
            }
            System.out.println("Dequeue Item:"+element);
        }
    }
    public void DisplayQueue(){
        for(int i=Front;i<=Rear;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args)
{
        FormalQueue q=new FormalQueue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.DisplayQueue();
}
}

/* Circular Queue

 * class Main{
    private int Front,Rear;
    private int Size=10;
    private int data[]=new int[Size];
    Main(){
        Front=-1;
        Rear=-1;
    }
public boolean CheckFull(){
    if(Front==0 && Rear==Size-1){
        return true;
    }
    if(Front == Rear + 1 ){
        return true;
    }
    else{
        return false;
    }
}
public boolean CheckEmpty(){
    if(Front==-1){
    return true;
    }
    else{
        return false;
    }
}
public void Enqueue(int x){
    if(CheckFull()){
        System.out.println("Queue Full");
        System.exit(1);
    }
    else{
            Front=0;
            Rear=(Rear+1 % Size);
            data[Rear]=x;
            System.out.println("Value Enqueued in Queue:" +x);
        } 
    }

public int Dequeue(){
    int dequeueX;
    if(CheckEmpty())
    {
        System.out.println("Queue is Empty");
        return -1;
    }
    else{
        dequeueX=data[Front];
        if(Front == Rear){
            Front=-1;
            Rear=-1;
        }
        else{
            Front=(Front+1 % Size);
        }
        System.out.println("Dequeue Value in Queue:"+dequeueX);
        return dequeueX;
    }
}
public void DisplayQueue(){
    for(int i=Front;i<=Rear;i=(i+1 % Size)){
        System.out.println("Queue Values: "+data[i]);
    }
}
public static void main(String[] args){
Main s=new Main();
s.Enqueue(20);
s.Enqueue(30);
s.Enqueue(50);
s.Enqueue(80);
s.Dequeue();
s.DisplayQueue();
}
}
*/