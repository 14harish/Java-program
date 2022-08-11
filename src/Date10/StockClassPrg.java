package Date10;
class Stock{
	String name;
	String StockSymbol;
	double pclosing;
	double cclosing;
	double sum,per,sum1;
	Stock(){
		this.name="Harish";
		this.StockSymbol="$";
		this.pclosing=20000;
		this.cclosing=50000;
	}
	double getChangePercentage(){
		sum=cclosing-pclosing;
		per=(sum/pclosing)*100;
		return per;
	}
}
public class StockClassPrg {
public static void main(String[] args) {
	Stock s=new Stock();
	double percentage=s.getChangePercentage();
	System.out.println("Percentage is:"+percentage+"%");
}
}
