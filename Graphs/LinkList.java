



class LinkList{
    public Link first;
    
    public LinkList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insert(Vertex ch){
        Link newNode = new Link(ch);
        newNode.next = first;
        first = newNode;
    
    }
    public Vertex find(){ 
        Link current = first;
        while(current.data.wasVisited !=false)
        {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        current.data.wasVisited = false;
        return current.data;
    }
    
    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}