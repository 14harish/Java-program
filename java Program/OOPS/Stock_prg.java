class stock{
    String stock_name;
    String stock_symbol;
    Double current_closing_price;
    Double previous_closing_price;
    stock(String stock_name,String stock_symbol,double current_closing_price,double previous_closing_price ){
        this.stock_name=stock_name;
        this.stock_symbol=stock_symbol;
        this.current_closing_price=current_closing_price;
        this.previous_closing_price=previous_closing_price;
    }    
    public double getchangePercentage(){
        return ((current_closing_price-previous_closing_price)/current_closing_price)*100;
    }
}

public class Stock_prg {
    public static void main(String[] args) {
        stock s=new stock("dollar","$",7000,5000);
        System.out.println("Stock Name:"+s.stock_name+"\n"+"Stock Symbol:"+s.stock_symbol+"\n"+"percantage Gain:"+s.getchangePercentage()+"%");
    }
}   
