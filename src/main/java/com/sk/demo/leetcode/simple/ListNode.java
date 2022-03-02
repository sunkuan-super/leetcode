package com.sk.demo.leetcode.simple;

/**
 * @Title: ListNode
 * @Package: com.sk.util.leetcode.simple
 * @Description: 单链表
 * @Author: sk
 * @Date: 2021/11/8 - 15:55
 */
public class ListNode {
    int val;

    ListNode next;

    ListNode(){

    }

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public int getVal(){
        return this.val;
    }

    public ListNode getListNode(){
        return this.next;
    }
}
