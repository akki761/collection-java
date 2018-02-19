//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return
// minimum element from the SpecialStack. (Expected complexity ­ O(1))

package collectionboot;

class SpecialStack {

    int index=-1 ,size,indexmin=-1;

    int min=Integer.MAX_VALUE;

    int stack[];

    int minstack[];

    SpecialStack(int size) {
        this.size = size;
        stack=new int[size];
        minstack=new int[size];
    }

    void push(int item){
        if(isFull()){
            System.out.println("stack over flow");
        }
        else {
            index = index + 1;
            stack[index] = item;
            if (min >= item) {
                min = item;
                indexmin = indexmin + 1;
                minstack[indexmin] = min;
            }
        }


    }
    int pop(){
        if (isEmpty())
        {  System.out.println("error stack is empty so it will return 0");
            return 0;
        }
        else {

            int p = stack[index];
            index = index - 1;
            if (p == min) {
                indexmin = indexmin - 1;
            }

            return p;

        }
    }
    boolean isEmpty(){
        if(index==-1){
            return true;
        }
        else{
            return false;
        }

    }
    boolean isFull(){
        if(size==index+1){
            return true;
        }
        else {
            return false;
        }
    }
    int peek(){
        int pk;
        if(index==-1){
            System.out.println("no element exist so it will return 0");
            return 0;
        }else{
            pk=stack[index];
            return pk;}
    }
    int getMin(){

        int m;
        if(indexmin==-1)
        {
            System.out.println("no element exist so it will return 0");
            min=Integer.MAX_VALUE;
            m=0;
        }else
        { m=minstack[indexmin];}
        return m;
    }




}
public class ques7{
    public static void main(String[] args) {
        SpecialStack s=new SpecialStack(4);
        s.push(50);
        s.push(12);
        System.out.println("min in stack: "+s.getMin());
        s.pop();
        System.out.println("min in stack: "+s.getMin());
        s.push(60);
        s.push(70);
        s.push(5);

        s.push(1);

        System.out.println("peek() : "+s.peek());
        s.pop();

        System.out.println("peek() : "+s.peek());
        System.out.println("min in stack: "+s.getMin());










    }

}