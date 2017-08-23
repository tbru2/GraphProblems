import java.util.*;

class GraphWithAdjList{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    public LinkList[] adjList;
    private int nVerts;
    private Stack<Integer> theStack;
    
    public GraphWithAdjList(){
        vertexList = new Vertex[MAX_VERTS];
        adjList = new LinkList[MAX_VERTS];
        nVerts = 0;
       
        theStack = new Stack<Integer>();
    }
    
    public void addVertex(char lab){
        vertexList[nVerts] = new Vertex(lab);
        LinkList aList = new LinkList();
        
        adjList[nVerts++] = aList;
    }
    
    public void addEdge(int start, int end){
        
        adjList[start].insert(vertexList[end]);
        adjList[end].insert(vertexList[start]);
    }
    
    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }
    
    public void dfs(){
        vertexList[0].wasVisited = true;
        theStack.push(0);
        displayVertex(0);
        System.out.print(" ");
        while(!theStack.isEmpty()){
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1)
                theStack.pop();
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                System.out.print(" ");
                theStack.push(v);
            }
        }
        System.out.println("");
            for(int j =0;j<nVerts;j++)
                vertexList[j].wasVisited = false;
    }
        public int getAdjUnvisitedVertex(int v){
            for(int j =0;j<nVerts;j++)
                if(adjList[v].find() != null && vertexList[j].wasVisited==false)
                    return j;
            return -1;
        }
        
      
}