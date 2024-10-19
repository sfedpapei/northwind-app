/******
 * Your top menu (and the tasks you are asked to implement) includes the following:
 *
 * add a customer
 * add an order
 * remove an order
 * ship an order
 * print pending orders (not shipped yet) with customer information
 * more options
 * exit
 * Keep in mind the following when you write your code:
 *
 * User will be promoted to enter the necessary info, one field at a time.
 * All IDs are automatically generated. (e.g. the biggest existing number + 1). MySQL has a function LAST_INSERT_ID() to obtain the auto-increment value immediately after an insert.
 * To add an order:
 * Populate proper information (list price, order date, ship address) to ORDERS and ORDER_DETAILS.
 * Pay attention to foreign key constraints on Customer, Employee, Shipper, Product, OrderID, etc.
 * Multiple products can be placed in an order.
 * The order should be rejected if a product in the order is discontinued.
 * To remove an order:
 * Delete the entries in ORDERS and ORDER_DETAILS tables.
 * To ship an order:
 * Check whether there are enough units in stock of every product in the order. To find units in stock of a product, use the InventoryTransactions table, find total quantity purchased and subtract quantities sold and on hold. If there are not enough units of any product in the order, the order cannot be shipped.
 * Fill in ShippedDate, Shipper ID and Shipping Fee.
 * For each product in the order, insert inventory transaction (TransactionType="Sold") into the InventoryTransactions table.
 * To print pending order list:
 * Print only pending orders (i.e. orders with NULL ShippedDate).
 * Print them in the order of order date.
 * Your code is expected to provide support of database transactions in proper ways.
 * Appropriate error-checking and error-handling are expected.
 * A user might enter a record whose key already exists in the table. Handle this appropriately.
 * Always assume the way it works in real world, if the above rules are not sufficient or not clear.
 */



package org.marios.northwind.nortwindapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class NortwindAppApplication {

	public static final Logger log =
			LoggerFactory.getLogger(NortwindAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NortwindAppApplication.class, args);
	}

}
