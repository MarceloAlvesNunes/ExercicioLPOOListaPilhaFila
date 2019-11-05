
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class LinkIntList {
     private ListNode first;
    private int size;

    LinkIntList() {
        first = null;
        size = 0;
    }

    LinkIntList(LinkIntList l) {
        first = l.getFirst();
        size = l.size();
    }

    public ListNode getFirst() {
        return first;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void print() {

        for (ListNode cursor = first; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.val);
            //if (ccursor.val){
            //    JOptionPane.showMessageDialog(null,true);
           // }
        }
    }

    public void addFirst(Object v) {
        first = new ListNode(v, first);
        size++;
    }

    public void add(int v, int index) {
        if (index == 0) {
            addFirst(v);
          
        }else{
            ListNode cursor = first;
            for(int i = 0;i< index -1;i++){
                cursor = cursor.next;
            }
            cursor.next = new ListNode(v, cursor.next);
        }
        size++;

    }
    
     public void remove(int index) {
        if (index == 0) {
            first = first.next;
        } else {
            ListNode cursor = first;
        }

    }

    public int indxOff(Object v) {
        int index = 0;
        ListNode cursor;
        for (cursor = first; cursor != null && cursor.val != v; cursor = cursor.next) {
            index++;
        }
        if (cursor == null) {
            index = -1;
        }
        return index;
    }

   

    
}
