package app.enums.application;

import java.util.Date;

import app.enums.entities.Order;
import app.enums.entities.enums.OrderStatus;

/**
 * testeEnum
 */
public class testeEnum {

    public static void main(String[] args) {
        Order order = new Order(1088, new Date(), OrderStatus.PENDING_PAYMENYT);

        System.out.println(order);
    }
}