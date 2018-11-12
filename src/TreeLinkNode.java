public class TreeLinkNode {

    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }

    void inOrder(TreeLinkNode head){
        if(head != null){
            inOrder(head.left);
            System.out.println(head.val);
            inOrder(head.right);
        }else{
            return ;
        }
    }
}
