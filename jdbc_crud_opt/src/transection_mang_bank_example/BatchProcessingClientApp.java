package transection_mang_bank_example;

import java.util.ArrayList;
import java.util.List;

public class BatchProcessingClientApp {

	public static void main(String[] args) throws Exception {
		
		BatchProcessing batch = new BatchProcessing();
		
		List<Account> list = new ArrayList<>();
		list.add(new Account(9999,"AAA",812765.00));
		list.add(new Account(8888, "BBB", 2876.00));
		list.add(new Account(7777, "CCC", 14657.00));
		
		batch.openAccount(list);
		
	}
}
