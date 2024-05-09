package BaekJoonAlgorithm.트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 트리순회 {

    static Node root_Node  = new Node('A', null,null);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            insertNode(root_Node,root,left,right);
        }


        preOrder(root_Node);
        System.out.println();
        inOrder(root_Node);
        System.out.println();
        postOrder(root_Node);
    }

    public static class Node{
        char value;
        Node left;
        Node right;

        public Node(char value,Node left, Node right){
            this.value= value;
            this.left= left;
            this.right = right;
        }

    }

    public static void insertNode(Node root_Node,char value,char left,char right){
        if (root_Node.value==value){
            root_Node.left = (left == '.' ? null : new Node(left,null,null));
            root_Node.right =(right == '.' ? null: new Node(right,null,null));
        }else {
            if (root_Node.left != null) insertNode(root_Node.left,value,left,right);
            if (root_Node.right != null) insertNode(root_Node.right,value,left,right);
        }
    }

    static void preOrder(Node node){
        if (node==null)return;
        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node){
        if (node==null) return;
        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    }

    static void postOrder(Node node){
        if (node==null)return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }
}
