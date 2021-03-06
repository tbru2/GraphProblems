class BFSMinSpanTree{
    public static void main(String[] args){
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addVertex('F');
        theGraph.addVertex('G');
        
        theGraph.addEdge(0,1);
        theGraph.addEdge(0,2);
      
        theGraph.addEdge(5,4);
        theGraph.addEdge(7,5);
         
        theGraph.addEdge(0,8);
        theGraph.addEdge(1,2);
        theGraph.addEdge(8,3);
        theGraph.addEdge(6,4);
       
        theGraph.addEdge(1,6);
        theGraph.addEdge(1,7);
      
        theGraph.addEdge(2,3);
        theGraph.addEdge(2,4);
        
        theGraph.BFSMinTree();
        System.out.println("");
        theGraph.mst();
        
        
        GraphWithAdjList theGraph2 = new GraphWithAdjList();
        theGraph2.addVertex('A');
        theGraph2.addVertex('B');
        theGraph2.addVertex('C');
        theGraph2.addVertex('D');
        theGraph2.addVertex('E');
        
        theGraph2.addEdge(0,1);
        theGraph2.addEdge(1,2);
        theGraph2.addEdge(0,3);
        theGraph2.addEdge(3,4);
       
        theGraph2.dfs();
        
        DirectedGraph theGraph3 = new DirectedGraph();
        theGraph3.addVertex('A');
        theGraph3.addVertex('B');
        theGraph3.addVertex('C');
        theGraph3.addVertex('D');
        theGraph3.addVertex('E');
        
        theGraph3.addEdge(0,2);
        theGraph3.addEdge(1,3);
        theGraph3.addEdge(1,0);
        theGraph3.addEdge(4,1);
        theGraph3.addEdge(2,4);
        theGraph3.addEdge(3,4);
       
        theGraph3.dfsConnectivity();
        
        DirectedGraph aGraph = new DirectedGraph();
        aGraph.addVertex('A');
        aGraph.addVertex('B');
        aGraph.addVertex('C');
        aGraph.addVertex('D');
        aGraph.addVertex('E');
        
        aGraph.addEdge(0,2);
        aGraph.addEdge(1,4);
        aGraph.addEdge(1,0);
        aGraph.addEdge(3,4);
        aGraph.addEdge(4,2);
        
        aGraph.Warshall();
        
        KnightsTour knightTour = new KnightsTour(5);
        knightTour.solveKT(); 
    }
}
        