class Main
{
    public static void main(String[] args)
    {
        LinkedList list  = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        // list.insertAt(0,55); //Here Passing the index value.....
        list.InsertAtFirst(11);  
        // list.deleteAt(2);
        list.show();
}
}