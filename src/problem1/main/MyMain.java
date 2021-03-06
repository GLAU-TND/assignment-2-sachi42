
package problem1.main;

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();

        //setting root
        m.setRoot();
        System.out.println("root set : " + m.getRoot().getData());


        //insertion
        for (int i = 0; i < 5; i++) {
            m.insert(m.getRoot());
        }



        /*
        My binary search tree class in this package supports insertion of left children in to queue during
        the time of insertion.
        also if we subtract total number the number of queue elements from totla elements present we will get
         nodes not having left children.
         */

        //printing left children
        m.getQueue().queuePrint(m.getQueue());
        //Nodes not having left childrens
        System.out.println(m.getTotalInsertion() - m.getQueue().getSize(m.getQueue()));


    }

}
