package chapter14.task14_1;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" +this.balance + "(口座番号：" + this.accountNumber + ")";
	}
	
	//口座番号が同じかどうかの判別
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o; //サブクラスの方にスーパークラスをキャストしているため、ダウンキャストで強制的に型変換する
			String an1 = this.accountNumber;
			String an2 = a.accountNumber;
			if(an1.equals(an2)) {
				return true;
				
			}
		
		}
		return false;
		
		
	}
	
	
	
	

}
