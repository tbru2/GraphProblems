class Link{
    public Vertex data;
   
    public Link next;
    
    public Link(Vertex id){
        data = id;
       
    }
    
    public void displayLink(){
        System.out.print(data.label + " ");
    }
}