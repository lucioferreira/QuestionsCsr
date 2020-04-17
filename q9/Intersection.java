
 // class EmailNode {
 //     String title;
 //     String message;
 //     EmailNode nextNode;
 //     EmailNode(String title, String message) {
 //         this.title = title;
 //         this.message = message;
 //         nextNode = null;
 //     }
 // }


public class Intersection {
    public EmailNode findNodeIntersection(EmailNode A, EmailNode B) {
        int sizeA = 0;
        int sizeB = 0;
        EmailNode nodeA = A;
        EmailNode nodeB = B;
        if (nodeA == null || nodeB == null)
            return null;
 
        while(nodeA != null){
            sizeA++;
            nodeA = nodeA.nextNode;
        }
        while(nodeB !=null){
            sizeB++;
            nodeB = nodeB.nextNode;
        }
 
        int diff = 0;
        nodeA = A;
        nodeB = B;
 
        if(sizeA > sizeB){
            diff = sizeA-sizeB;
            int i = 0;
            while( i < diff){
                nodeA = nodeA.nextNode;
                i++;
            }
        } else {
            diff = sizeB-sizeA;
            int i = 0;
            while( i < diff){
                nodeB = nodeB.nextNode;
                i++;
            }
        }
 
        while(nodeA != null && nodeB != null){
            if(nodeA.title.equals(nodeB.title) && nodeA.message.equals(nodeB.message)) {
                return nodeA;
            }
            nodeA = nodeA.nextNode;
            nodeB = nodeB.nextNode;
        }
 
        return null;
    }
}