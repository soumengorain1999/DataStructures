package com.graphs;

//import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Graph {
	
	private static LinkedList<Integer> adj[];
	
	public Graph(int v)
	{
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source,int destination)
	{
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public static void printNeighbour(LinkedList<Integer> adj[])
	{
		for(int i=0;i<adj.length;i++)
		{
			System.out.print(i+"-> ");
			for(int ele:adj[i] )
				System.out.print(" "+ele);
			System.out.println();
		}
	}
	
	public int bfs(int source,int destination)
	{
		boolean vis[] = new boolean[adj.length];
		
		int parent[] = new int[adj.length];
		
		Queue<Integer> q= new LinkedList<>();
		
		q.add(source);
		parent[source]=-1;
		vis[source]=true;
		
		while(!q.isEmpty())
		{
			int cur=q.poll();
			if(cur==destination) break;
			for(int neighbour: adj[cur])
			{
				if(!vis[neighbour])
				{
					vis[neighbour]=true;
					q.add(neighbour);
					parent[neighbour]=cur;
				}
			}
		}
		int cur=destination;
		int distance=0; 
		while(parent[cur]!=-1)
		{
			System.out.print(cur + " -> ");
			cur=parent[cur];
			distance++;
		}
		System.out.print(source);
		System.out.println();
		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of vertices and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		
		Graph graph=new Graph(v);
		System.out.println("Enter "+e+ " edges");
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			
			graph.addEdge(source, destination);
		}
		System.out.println("Enter source and destination");
		
		int source=sc.nextInt();
		int destination=sc.nextInt();		
		int distance=graph.bfs(source, destination);
		System.out.println("Min distance is "+ distance);
		
		System.out.println("Adjacency list is");
		printNeighbour(adj);
		

	}

}