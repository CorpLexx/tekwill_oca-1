/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_11_2_s;

import practice_11_2.*;

public class ShoppingCart {
    public static void main(String args[]){
        practice_11_2.Order order = new practice_11_2.Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}    
