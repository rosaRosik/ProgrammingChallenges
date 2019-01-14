public class Main {

    public static void main(String[] args)
    {
        BFSGraph2 tg = new BFSGraph2(10);

        tg.addEdge(1,2);
        tg.addEdge(1,3);
        tg.addEdge(2,5);
        tg.addEdge(5,4);
        tg.addEdge(2,4);
        tg.addEdge(3,6);
        tg.addEdge(3,4);
        tg.addEdge(4,1);




        System.out.println("\nNumber of edges: "+tg.getEdgeCount());

        System.out.println("\nNeighborhood matrix of the graph: ");
        tg.writeMatrix();

        tg.bfs(1);
        tg.smalldist(1,4);


    }
}
