class Stack 
{
    int array [] = new int  [5];
    int top = 0;

    public void push(int data)
    {
        if(top==5)
        {
            System.out.println("It is full");
        }
        else
        {
        array[top]=data;
        top++;
        }
    }

    public int  pop()
    {
        int data=0;
        if(isempty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;  
            data = array[top];
            array[top]=0;
        }
      return data;   
    }


    public int peek()
    {
        int data;
        data = array[top-1];
        return data;
    }

    public Boolean isempty()
    {
        return top<=0;
    }
    
    public void show()
    {
        for(int indx : array)
        {
            System.out.print(indx + " ");
        }
    }
}