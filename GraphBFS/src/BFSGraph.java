import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph extends TGraph implements IBfsSearchable
{
     Queue<Integer> Q = new LinkedList<>();
     boolean []array ; //tablica oznaczonych
     boolean []array2 ; //tablica przeszukanych

    public BFSGraph(int i) {
        super(i);
        array=new boolean[i];
        array2=new boolean[i];
    }

    @Override
    public void addEdge(int i, int j) {
        super.addEdge(i, j);
    }

    @Override
    public boolean isEdge(int i, int j) {
        return super.isEdge(i, j);
    }

    @Override
    public int getEdgeCount() {
        return super.getEdgeCount();
    }

    @Override
    public void writeMatrix() {
        super.writeMatrix();
    }

    @Override
    public void bfs(int sourceVertex) {

        array[sourceVertex]=true;
        Q.offer(sourceVertex);

        while (!Q.isEmpty())
        {
            int v = Q.poll();

            if(!array2[v]){

                for (int j=0;j<getEdgeCount();j++) {

                    if (isEdge(v, j)) {

                        if (!array[j]){

                            array[j] = true;
                            Q.offer(j);

                        }
                    }
                }
            }
            array2[v] = true;

            System.out.println("___________________________________________________");
            System.out.println("\nVistited: ");
            for (int i=0;i<array2.length;i++){
                if(array2[i]) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nQueue: "+ Q);

        }


    }





}
