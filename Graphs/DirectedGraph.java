import java.util.*;

class DirectedGraph{
   private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Queue theQueue;
    private Stack<Integer> theStack;
    public DirectedGraph(){
        vertexList = new Vertex[MAX_VERTS];
        
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j=0;j<MAX_VERTS;j++)
            for(int k=0;k<MAX_VERTS;k++)
                adjMat[j][k] = 0;
        theQueue = new Queue();
        theStack = new Stack<Integer>();
    }
    
    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }
    
    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        
    }
    
    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }
    public void dfsConnectivity(){
        int i = 0;
        while(i<nVerts){
            vertexList[i].wasVisited = true;
            displayVertex(i);
            theStack.push(i);
            
            while(!theStack.isEmpty()){
                int v = getAdjUnvisitedVertex(theStack.peek());
                if(v == -1)
                    theStack.pop();
                else{
                    vertexList[v].wasVisited = true;
                    displayVertex(v);
                    theStack.push(v);
                }
            }
            for(int j = 0;j<nVerts;j++)
                vertexList[j].wasVisited = false;
            i++;
            System.out.println("");
        }
    }
    public void bfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        int v2;
        
        while(!theQueue.isEmpty()){
            int v1 = theQueue.remove();
            
            while((v2 = getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
    
        for(int j = 0;j<nVerts; j++)
            vertexList[j].wasVisited = false;
        }

        public int getAdjUnvisitedVertex(int v){
            for(int j =0;j<nVerts;j++)
                if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                    return j;
            return -1;
        }
        
        public void BFSMinTree(){
            Stack<Integer> st = new Stack<Integer>();
            vertexList[0].wasVisited = true;
            
            st.push(0);
            int v2;
        
            while(!st.isEmpty()){
                int currentVertex = st.peek();
                
                if((v2 = getAdjUnvisitedVertex(currentVertex)) != -1){
                    vertexList[v2].wasVisited = true;
                    displayVertex(currentVertex);
                    st.push(v2);
                    displayVertex(v2);
                    System.out.print(" ");
                }
                else
                    st.pop();
            }
    
            for(int j = 0;j<nVerts; j++)
                vertexList[j].wasVisited = false;
           

       }
        
        public void mst(){
            vertexList[0].wasVisited = true;
            Stack<Integer> st = new Stack<Integer>();
            st.push(0);
            
            while(!st.isEmpty()){
                int currentVertex = st.peek();
                
                int v = getAdjUnvisitedVertex(currentVertex);
                if(v == -1)
                    st.pop();
                else
                {
                    vertexList[v].wasVisited = true;
                    st.push(v);
                    
                    displayVertex(currentVertex);
                    displayVertex(v);
                    System.out.print(" ");
                }
            }
            System.out.println("");
            for(int j = 0;j<nVerts;j++)
                vertexList[j].wasVisited = false;
        }
        
          public void Warshall(){
            printAdjMat();
            for(int x = 0;x<nVerts;x++){
                for(int y = 0;y<nVerts;y++){
                    if(adjMat[x][y] == 1){
                        for(int z=0;z<nVerts;z++){
                            if(adjMat[y][z] == 1){
                                adjMat[x][z] = 1;
                                printAdjMat();
                            }
                        }
                    }
                }
            }
        }
        private void printAdjMat(){
            for(int i = 0;i<nVerts;i++){
                for(int j = 0;j<nVerts;j++)
                    System.out.print(adjMat[i][j]);
                System.out.println("");
            }
            System.out.println("End of matrix");
        }
}