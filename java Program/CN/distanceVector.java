public class distanceVector {
    private static class node{
        int dist[]=new int[20];
        int from[]=new int[20];
      //     this.from=null;
        // }   // public node(){
        //     this.dist=null;
       
     }
    static node rt[];
    public static void main(String[] args) { 
        // public node head;
        int count=0;
        int cost[][]={{1,2,3},{4,5,6},{7,8,9}};
        int dmat[][]=new int[20][20];
        for(int i=0;i<cost.length;i++){
            for(int j=0;j<cost.length;j++){
                dmat[i][j]=0;
                rt[i].dist[j]=dmat[i][j];
                rt[i].from[j]=j;
            }
            do{
                count=0;
                for(int k=0;k<cost.length;k++){
                    for(int j=0;j<cost.length;j++){
                        for(int v=0;v<cost.length;v++){
                            if(rt[k].dist[j]>dmat[k][v]+rt[v].dist[j]){
                                rt[i].from[j]=k;
                                count++;
                            }
                        }
                    }   
            }
        }while(count!=0);
        for(int r=0;r<cost.length;r++){
            System.out.println("State value for router"+i+1);
            for(int j=0;j<cost.length;j++){
                System.out.println("Node"+j+1+""+rt[r].from[j]+1+""+rt[r].dist[j]);
            }
        }
    }
}}

