class QueuePro{
    private int Front,Rear;
    private int size=10;
    private int arr[]=new int[size];
    QueuePro(){
        Front=-1;
        Rear=-1;
    }
    //Check the Queue is Full
    public boolean CheckFull(){
        if(Front==0 && Rear==size-1){
            return true;
        }
        return false;
    }
    //Check the Queue is Empty
    public boolean CheckEmpty(){
        if(Front==-1){
            return true;
        }
        return false;
    }
    //Add the Values to the Queue
    public void Enqueue(int items){
        if(CheckFull()){
            System.out.println("Alread Stack Fulled");
        }
        else{
            Front=0;
            arr[++Rear]=items;
            System.out.println("Inserted Element In Queue:"+arr[Rear]);
        }
    }
    //Remove the Value in Queue
    public int Dequeue(){
        int n;
        if(CheckEmpty()){
            System.out.println("Queue already Empty");
            return -1;
        }
        else{
            n=arr[Front];
            if(Front>=Rear){
                Front=-1;
                Rear=-1;
            }
            else{
                Front++;
            }
            System.out.println("Dequeued Value in Queue:"+n);
            return (n);
        }
    }
    //Print the Queue
    public void display(){
        if(CheckEmpty()){
            System.out.println("Stack Empty");
        }
        else{

            System.out.println("Values in Queue");
            for(int i=Front;i<=Rear;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        QueuePro s=new QueuePro();
        s.Enqueue(10);
        s.Enqueue(20);
        s.Enqueue(30);
        s.Dequeue();
        s.Dequeue();
        s.display();
    }
}