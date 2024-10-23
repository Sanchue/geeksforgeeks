class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        Node cur=head;
        Node prev=head;
        int a=0;
        int sum=0;
        while(cur!=null)
        {
            a++;
            sum+=cur.data;
            if(a>n)
            {
                sum-=prev.data;
                prev=prev.next;
                a--;
            }
            cur=cur.next;
        }
        return sum;
    }
}
