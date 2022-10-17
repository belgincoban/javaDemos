package interfaces;

public class Main {

	public static void main(String[] args) {

		//referans tutabiliyorlar.
		//normal class'larda class içerisinde bir metot yazılacaksa bu metotlar
		//tamamlanmış olması gerekir.
		//abstract class'larda kimisi dolu kimisi boş olabilirdi.
		//onu inherit eden içini doldurmak zorunda
		//interfaceler ise tamamlanmamış operasyonlar içeriyor. 
		//interfaceş'lerde new'lenemezler. çünkü içerisinde
		//tamamlanmamış operasyonlar bulundurur. new'leyip çalıştırırsak boş metolar ne yapacağını 
		//bilmediği için hata verir.
		//interface'ler kendisini imlement eden class'ların
		//referansını tutarlar.
		//interface içersindeki imzaların default a.m public'tir.
		//o yüzden yazmayız.
		//void add();
	}

}
