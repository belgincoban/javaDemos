
package recapDemo1;

import javax.sql.rowset.JoinRowSet;

public class Main {

	public static void main(String[] args) {
		// genel tekrar
		int sayi01 = 10;
		int sayi02 = 25;
		int sayi03 = 35;

		// elimizdeki bu üç sayıdan en büyük olanını nasıl buluruz?

		int enBuyuk = sayi01;

		if (enBuyuk < sayi02) {
			enBuyuk = sayi02;
		}
		if (enBuyuk < sayi03) {
			enBuyuk = sayi03;
		}

		System.out.println("En büyük = " + enBuyuk);
	}

}
