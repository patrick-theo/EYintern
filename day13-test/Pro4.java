package day13_test;

import java.util.HashMap;
import java.util.Map;

public class Pro4 {
	public static void main(String[] args) {
		
		AccountManager accountManager=new AccountManager();
		accountManager.getBalance("Patrick");
	}
	
}
 class AccountManager {
	 private Map accountTotals = new HashMap(); 
		 private int retirementFund; 
		 
		 public int getBalance(String accountName) { 
		 Integer total = (Integer) accountTotals.get(accountName); 
		 if (total == null) 
		total = Integer.valueOf(0); 
		 return total.intValue(); 
		 } 
		 public void setBalance(String accountName, int amount) { 
		 accountTotals.put(accountName, Integer.valueOf(amount)); 
		 } 
	 }