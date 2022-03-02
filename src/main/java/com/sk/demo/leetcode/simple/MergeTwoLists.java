package com.sk.demo.leetcode.simple;

/**
 * @Title: MergeTwoLists
 * @Package: com.sk.util.leetcode.simple
 * @Description: 合并两个有序的链表
 * @Author: sk
 * @Date: 2021/11/8 - 15:57
 */
public class MergeTwoLists {
    /**
     * 递归方式
     *
     * @param l1 链表1
     * @param l2 链表2
     * @return 合并后的新链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
