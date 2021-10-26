package chapterFour;

public class SalesCommission {
    private String name;
    private int sales;
    private int commission;
    int grossSales;
    int commissionPercent;

    public SalesCommission(String name, int commission, int sales){
        this.name = name;
        this.commission = commission;
        this.sales = sales;

    }

    public int getCommission() {
        return commission;
    }

    public int getSales() {
        return sales;
    }

    public String getName() {
        return name;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void grossSales(int sales) {

        if (sales > 0)
            sales = sales + commission;
    }

    public void commissionPercent(int sales){
        if(commission > 0)
            commission = (int) (0.09 * sales);
    }
}



