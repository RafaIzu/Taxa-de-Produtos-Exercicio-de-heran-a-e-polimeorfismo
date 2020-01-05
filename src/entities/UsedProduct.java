package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manufactureDate;
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		StringBuilder sb=new StringBuilder();
		sb.append(super.getName());
		sb.append(" (used)");
		sb.append(" $ ");
		sb.append(String.format("%.2f",super.getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(sdf.format(manufactureDate));
		sb.append(")");
		return sb.toString();
				
				
				
	}
	


	

}
