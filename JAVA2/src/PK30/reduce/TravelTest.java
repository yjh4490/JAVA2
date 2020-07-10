package PK30.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 100);
		
		List<TravelCustomer> customerList= new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);

		System.out.println("== �� ��� �߰��� ������� ���==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("== �� ���� ��� ���==");
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�Ѻ�� : " + total);
		
		
		
		System.out.println("== 20�� �̻� ����������Ͽ� ���==");
		customerList.stream().filter(c->c.getAge()>=20).
		map(c->c.getName()).sorted().forEach(s->System.out.println(s)); //����
		
		
}
}