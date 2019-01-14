public class BFSGraph2 extends BFSGraph {

     int []array5;
     int [][]count;
     int [][]count1;
     int []start;

    public BFSGraph2(int i){
        super(i);
        count = new int [i][i];
        count1 = new int [i][i];
        start = new int [i];
    }

    @Override
    public void bfs(int sourceVertex) {



        int coun=1;
        array[sourceVertex]=true;
        Q.offer(sourceVertex);

        while (!Q.isEmpty())
        {
            int v = Q.poll();

            if(!array2[v]){


                for (int j=0;j<getEdgeCount();j++) {

                    if (isEdge(v, j)) {

                        if (!array[j]){


                            count[sourceVertex][j]=coun;

                            array[j] = true;
                            Q.offer(j);

                        }
                    }
                }

                coun++;


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


        System.out.println("\n\n ----    Distance:   ----");
        for (int i=0;i<count.length;i++){

            if (count[sourceVertex][i]!=0) {
                System.out.println(sourceVertex + " - " + i + "  :  " + count[sourceVertex][i]);
            }
        }

    }

    public void smalldist(int start, int meta){

       // bfs(start);

        int length = count[start][meta];
        int co = 0;
        array5= new int[length];

        int i=meta;

                for (int j = i; j >=start; j--) {

                    if (isEdge(j-1, j)) {

                       {
                           array5[co] = j;
                           co++;
                       }
                    }

                }

        System.out.println("\n\nShortest distance from "+ start +" to "+ meta);
        System.out.println(start + " - "+ meta +" : "+ count[start][meta]);


        System.out.println("\n\nStreet: ");
        for (int j=array5.length-1;j>=0;j--){
            System.out.print(" > "+array5[j] );
        }
    }

}
