package entities;

public class Bill {
	
	public char gender;
	public int beer, barbecue, softDrink;

	public double cover() {
		if (feeding() > 30.0) {
			return 0;
		} else {
			return 4.00;
		}
	}
		
	public double feeding() {
		return beer * 5.00 + barbecue * 7.00 + softDrink * 3.00;
	}
			
	public double ticket() {
		
		if (gender == 'M') {
			return 10.0; 
		} else {
			return 8.00;
		}	
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
		
	@Override
	public String toString() {
		
		String msg = "\nRELATÓRIO:\nConsumo = R$ " + String.format("%.2f", feeding()) + "\n";
		
		if (cover() == 0) {
			msg += "Isento de Couvert\n";
		} else {
			msg += "Consumo = R$ " + String.format("%.2f", cover()) + "\n";
		}
		
		msg += "Ingresso = R$ " + String.format("%.2f", ticket()) + "\n\nValor a pagar = R$ " 
		+ String.format("%.2f", total()) + "\n\n";
		
		return msg;
	}
}