package com.tengteng.algorithmlib;

import java.util.Stack;

/**
 * 输入一个链表，然后倒叙输出
 */
   public class NodeTrainingMain {

    public static void main(String[] args) {
        ListNode headNode;
        headNode = createListNode();
        reversListNode(headNode);
        System.out.println("headNode:"+headNode.value);
    }

    /**
     * 把链表倒叙输出
     *
     * @param headNode
     */
      private static void reversListNode(ListNode headNode) {

        Stack<ListNode> stack = new Stack<>();
        while (headNode != null) {
            stack.push(headNode);
            headNode = headNode.next;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            ListNode node = stack.pop();
            System.out.println("当前pop出的节点是" + node.value);
        }
      }

    /**
     * 创建一个链表
     *
     * @return
     */
        private static ListNode createListNode() {
        ListNode nodeSta = new ListNode(0);    //创建首节点
        ListNode nextNode;                     //声明一个变量用来在移动过程中指向当前节点
        nextNode = nodeSta;                      //指向首节点

        //创建链表
        for (int i = 1; i < 10; i++) {
            ListNode node = new ListNode(i);  //生成新的节点
            nextNode.next = node;               //把心节点连起来
            nextNode = nextNode.next;           //当前节点往后移动
        } //当for循环完成之后 nextNode指向最后一个节点，
        nextNode = nodeSta;                     //重新赋值让它指向首节点
        print(nextNode);                      //打印输出
        return nextNode;

    }

    /**
     * 打印输出方法
     */
       static void print(ListNode listNoed) {
        //创建链表节点
        while (listNoed != null) {
            System.out.println("节点:" + listNoed.value);
            listNoed = listNoed.next;
        }
        System.out.println();
       }
      }