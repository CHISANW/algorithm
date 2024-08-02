package BaekJoonAlgorithm.트리;

import java.io.*;

public class 이진검색트리 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BinaryTree bt = new BinaryTree();
        while (true){
            String input = br.readLine();

            if (input ==null || input.equals(""))break;
            bt.insert(Integer.parseInt(input));
        }
        bt.postOrder();

    }
}

class BinaryTree{
    private Tree root;

    public BinaryTree(){
        this.root = null;
    }
    public void insert(int value){
        insertRc(root, value);
    }

    private Tree insertRc(Tree root, int value){
        if (root ==null){
            root = new Tree(value);
            return root;
        }
        if (value < root.value){
            root.left = insertRc(root.left, value);
        }else if (value> root.value)
            root.right = insertRc(root.right,value);

        return root;
    }

    public void postOrder(){
        postOrderRc(root);
    }

    private void postOrderRc(Tree root){
        if (root!=null) {
            postOrderRc(root.left);
            postOrderRc(root.right);
            System.out.println(root.value);
        }
    }
}
class Tree{
    int value;
    Tree left;
    Tree right;

    public Tree(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
