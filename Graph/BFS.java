import java.util.*;


public class BFS {
    static class Edge{
        int src;
        int dest;
        
        public Edge(int s,int d){
          this.src  = s;
          this.dest = d;
          
        }
     }
public static void createGraph(ArrayList<Edge> graph[]){
  // convert null arraylist to empty arraylist
  for(int i=0;i<graph.length;i++){      
    graph[i] = new ArrayList<Edge>();
  }
   graph[0].add(new Edge(0,1));
   graph[0].add(new Edge(0,2));

   graph[1].add(new Edge(1,0));
   graph[1].add(new Edge(1,3));

   graph[2].add(new Edge(2,0));
   graph[2].add(new Edge(2,4));

   graph[3].add(new Edge(3,1));
   graph[3].add(new Edge(3,4));
   graph[3].add(new Edge(3,5));

   graph[4].add(new Edge(4,2));
   graph[4].add(new Edge(4,3));
   graph[4].add(new Edge(4,5));

   graph[5].add(new Edge(5,3));
   graph[5].add(new Edge(5,4));
   graph[5].add(new Edge(5,6));

   graph[6].add(new Edge(6,5));
}
public static void bfs(ArrayList<Edge> graph[],int v){ //(int v,boolean vis[],int start)
    Queue<Integer> q = new LinkedList<>() ;
    boolean vis[] = new boolean[v]; // cut for disconnected components
    q.add(0); // q.add(start)

    while(!q.isEmpty()){
        int curr = q.remove();
        if(vis[curr] == false){
            System.out.print(curr+" ");
            vis[curr] = true;

            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                 q.add(e.dest);

            }
        }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr,boolean[] vis,int v){ //O(V+E)
        
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph,e.dest,vis,v);

            }

        }
    }

    // O(v^v)
    public static void printallpath(ArrayList<Edge> graph[],boolean vis[], int curr, String path,int tar){

        if(curr == tar){
            System.out.println(path+" ");
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr] = true;
                printallpath(graph,vis,e.dest,path+e.dest,tar);
                vis[curr] =false;
            }

        }

    }
        
    


    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];    //for disconnected components
        // for (int i = 0; i < v; i++) {
        //     if(vis[i] == false){
        //         bfs(graph,v,vis,i);
        //     }
        // }
       // bfs(graph,v);
       //System.out.println();
      dfs(graph,0,vis,v);
       System.out.println();


   // int src =0,tar =5;
    //printallpath(graph,new boolean[v],src,"0",tar);
        
    }
}
    


