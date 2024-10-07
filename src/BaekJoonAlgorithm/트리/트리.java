package BaekJoonAlgorithm.트리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 트리 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] parent = new int[n];

        for (int i =0; i<n;i++){
            parent[i] = sc.nextInt();
        }

        int deleteNode = sc.nextInt();

        Tree tree = new Tree(n, parent, deleteNode);
        System.out.println(tree.countLeafNode());
    }

    static class Tree{
        private int n;
        private List<Integer>[] tree;
        private int root;
        private int deleteNode;

        public Tree(int n,int[] parent,int deleteNode){
            this.n = n;
            this.deleteNode = deleteNode;
            tree = new ArrayList[n];

            for (int i =0; i<n;i++){
                tree[i] = new ArrayList<>();
            }

            for (int i =0; i<n;i++){
                if (parent[i] == -1){
                    root = i;
                }else{
                    tree[parent[i]].add(i);
                }
            }
        }

        public int countLeafNode(){
            if(deleteNode==root){
                return 0;
            }

            deleteNode(deleteNode);

            return countLeaf(root);
        }

        public void deleteNode(int node){
            for (int i =0; i<n;i++){
                if (tree[i].contains(node)) {
                    tree[i].remove((Integer) node);
                    break;
                }
            }
            tree[node].clear();
        }

        public int countLeaf(int node){
            if (tree[node].isEmpty()){
                return 1;
            }
            int leafCount = 0;

            for (int child : tree[node]){
                leafCount += countLeaf(child);
            }
            return leafCount;

        }
    }

}
