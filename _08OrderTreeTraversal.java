public class _08OrderTreeTraversal {

    static class Node{
        int data;
        Node left;
        Node right;

        //CONSTRUCTOR
        Node(int data){
            this.data = data;
            this.left=null;
            this.right = null;

        }

    }

    static class tree{
        static int index = -1;
        public static Node Buildtree(int nodes[]){
            

            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newnNode = new Node(nodes[index]);
            newnNode.left = Buildtree(nodes);
            newnNode.right = Buildtree(nodes);

            return newnNode;

            
        }

        public static void Preorder(Node root){
            if(root==null){
                System.out.print("-1"+ " ");
                return;

            }


            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        //SIMILARLY WE HAVE POSTORDER AND INORDER
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        tree traverse = new tree();
        Node root = traverse.Buildtree(nodes);
        System.out.println(root.data);
        System.out.println("/////////////////////////");
        traverse.Preorder(root);
        
    }
    
}
