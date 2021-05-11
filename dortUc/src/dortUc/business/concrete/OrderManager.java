package dortUc.business.concrete;

import dortUc.business.abstracts.IOrderService;
import dortUc.entities.concrete.Campaign;
import dortUc.entities.concrete.Gamer;
import dortUc.entities.concrete.Order;

public class OrderManager implements IOrderService {

	@Override
	public void add(Order order) {
		System.out.println("Sat�n alma tamamland�");
		
	}

	@Override
	public void update(Order order) {
		System.out.println("G�ncelleme y�kseltildi");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sat�n alma iptal edildi");
		
	}

	@Override
	public void sale(Order order, Gamer gamer) {
		System.out.println("Sat�n alma"+" "+gamer.getName()+" "+
	gamer.getLastName()+" "+"taraf�ndan ger�ekle�tirildi");
		
	}

	@Override
	public void campaign(Order order, Campaign campaign, Gamer gamer) {
		System.out.println("Sat�n alma"+" "+campaign.getSaleRate()+" "+"indirimle"+" "+gamer.getName()+" "+
	gamer.getLastName()+" "+"taraf�ndan ger�ekle�ti");
		
	}

}
