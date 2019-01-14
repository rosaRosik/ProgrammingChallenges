public class TGraph extends MGraph
{

    public TGraph(int i){
        super(i);

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

        int counter=0;

        for(int i=0;i<getVertexCount();i++){

            for(int j=0;j<getVertexCount();j++){

                if(isEdge(i,j)){
                    counter++;
                }
            }
        }

        return counter;
    }

    @Override
    public void writeMatrix() {

        for(int i=0;i<getVertexCount();i++){

            for(int j=0;j<getVertexCount();j++){

                System.out.print(isEdge(i,j)+ "  ");
            }
            System.out.println();
        }

    }
}
