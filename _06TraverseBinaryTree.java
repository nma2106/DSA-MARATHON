public class _06TraverseBinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        //CONSTRUCTOR
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;

        }
    }

    static class Buildtree{
        static int index = -1;

        public static Node tree(int nodes[]){
            index++;
            //BASE CLASS
            if(nodes[index]==-1){
                return null;
            }

            
            Node newnNode = new Node(nodes[index]);
            newnNode.left = tree(nodes);
            newnNode.right = tree(nodes);

            return newnNode;
            

        }

    }


    public static void main(String[] args) {

        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Buildtree traverse = new Buildtree();
        Node treeeRoot = traverse.tree(nodes);
        System.out.println(treeeRoot.data);

        
    }
    
}
