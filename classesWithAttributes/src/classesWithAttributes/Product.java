package classesWithAttributes;

public class Product {
	
	public Product() {
		System.out.println("yapıcı metot çalıştı");
	}
	
	
	
    public Product(String _name, String _description, double _price, int _stockAmount) {
		super();
		this._name = _name;
		this._description = _description;
		this._price = _price;
		this._stockAmount = _stockAmount;
		
	}



	//Bir class aynı zamanda attribute barındırır.
	//attribute veya field denir.
	
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _kod;
	
	//sınıf üyelerinin default erişim belirleyicisi public'tir.
	//private : sadece tanımlandığı blok içerisinden erişilebilir.
	
	//getter
	public String get_name() {
		return _name;
	}
	
	//setter
	public void set_name(String name) {
		_name=name;
		//this.name=name;
		//this:benim içerisinde bulunduğum class demek
	}

	
	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}
	
	public String get_kod() {
		return this._name.substring(0,1)+this._description;
	}

	

}
