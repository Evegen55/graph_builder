package entities;

public class RowWithData {

    private Periods period;
    private Number two_pow_N_column;
    private Number n_squared_column;
    private Number N_column;
    private Number log_n_column;

    public RowWithData(Periods period, Number two_pow_N_column, Number n_squared_column, Number N_column, Number log_n_column) {
        this.period = period;
        this.two_pow_N_column = two_pow_N_column;
        this.n_squared_column = n_squared_column;
        this.N_column = N_column;
        this.log_n_column = log_n_column;
    }

    public Number getTwo_pow_N_column() {
        return two_pow_N_column;
    }

    public Number getN_squared_column() {
        return n_squared_column;
    }

    public Number getN_column() {
        return N_column;
    }

    public Number getLog_n_column() {
        return log_n_column;
    }

    public Periods getPeriod() {
        return period;
    }
}
