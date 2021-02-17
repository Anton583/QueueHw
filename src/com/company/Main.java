package com.company;
import ibadts.*;
public class Main {

    public static void main(String[] args) {
	hw4();
    }
	public static void hw4() {
		Queue business = new Queue();
		Queue economy = new Queue();
		String[] businessC = {"Sir_A", "Madam_B", "Rick_C"};
		String[] economyC = {"Sarah_A", "John_B", "Wendy_C"};
		business.add(businessC);
		economy.add(economyC);
		while (!economy.isEmpty()) {
			for (int i = 0; i < 2 && !business.isEmpty(); i++) {
				System.out.print(business.dequeue() + " ");
			}
			System.out.print(economy.dequeue() + " ");
		}

	}
    }

