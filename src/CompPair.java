public class CompPair {
    // variables for the two complex numbers in the pair.
    private Comp first;
    private Comp second;

    //  A Constructor that takes the two complex numbers in the pair and initializes them
    public CompPair(Comp first, Comp second) {
        this.first = first;
        this.second = second;
    }

    // getMethod which returns the first complex number in the pair.
    public Comp getFirst() {
        return this.first;
    }

    // getMethod which returns the second complex number in the pair.
    public Comp getSecond() {
        return this.second;
    }


}