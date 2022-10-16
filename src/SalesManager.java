public class SalesManager {
    protected int[] sales;
    int max = -1;
    int min =0;


    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    //вычисление максимального значения массива
    public int max() {
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    //вычисление минимального значения массива
    public void min() {
        for (int i=0; i<sales.length; i++) {
            if (sales[i] < sales[i+1]) {
                min = sales[i];
            }
        }
    }

    //вычисление суммы средних продаж
    public int average() {
        int av = 0;
        for (int sale : sales) {
            av = av + sale;
        }
        av = (av - min - max) / (sales.length - 2);
        return av;
    }
}
