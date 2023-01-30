package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

import homework_4.Samvel_Hakobyan.homework4_1.stack2.Stack2;

public class Stack2_ {
    private int[] stck;
    private  int tos;

    Stack2_(int size){
        stck = new int[size];
        tos = -1;
    }

    void push (int item) {
        if (tos == stck.length - 1) {
            System.out.println("stack is full");
        } else {
            stck[++tos] = item;
        }
    }

        int pop(){
            if (tos < 0){
                System.out.println("stack underflow");
                return 0;
            }else {
                return stck[tos--];
            }
        }
    }

