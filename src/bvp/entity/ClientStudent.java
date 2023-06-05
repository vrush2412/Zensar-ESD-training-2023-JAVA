package bvp.entity;

import bvp.entity.Belt.BeIt;
import bvp.entity.BeEtc;

public class ClientStudent {
	public static void main(String[] args) {

		BeIt beit = new BeIt("abc", 70, 70, 70, 70);
		BeEtc beEtc = new BeEtc("xyz", 90, 90, 90, 90);
		
		beit.calculateTotal();
		beit.calculatePercent();
		
		beEtc.calculateTotal();
		beEtc.calculatePercent();
		
		System.out.println(beit);
		System.out.println(beEtc);
	}

}
