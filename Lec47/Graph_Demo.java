package Lec47;
import java.util.Scanner;
public class Graph_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertex = sc.nextInt();
        int[][] arr = new int[vertex][vertex];

        for (int i = 0; i < vertex; i++) {
            System.out.print("Enter the row number (vertex u): ");
            int u = sc.nextInt();
            System.out.print("Enter the column number (vertex v): ");
            int v = sc.nextInt();

            // Validate user input
            if (u >= 0 && u < vertex && v >= 0 && v < vertex) {
                arr[u][v] = 1;
                arr[v][u] = 1;
            } else {
                System.out.println("Invalid vertex numbers. Please enter valid indices.");
                i--; // Retry the same iteration
            }
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

