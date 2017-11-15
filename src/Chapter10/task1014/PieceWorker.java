package Chapter10.task1014;

public class PieceWorker extends Employee{
    private double wage;
    private int pieces;
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces){
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setPieces(pieces);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage > 0.0){
            this.wage = wage;
        } else {
            throw new IllegalArgumentException("wage must be > 0.0");
        }
    }

    public void setPieces(int pieces) {
        if(pieces > 0){
            this.pieces = pieces;
        } else {
            this.pieces = 0;
        }
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }
    @Override
    public String toString() {
        return String.format("pieceworker: %s%n%s: $%,.2f; %s: %d",
                super.toString(), "wage", getWage(), "pieces", getPieces());
    }
}
