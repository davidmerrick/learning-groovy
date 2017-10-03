class DifferenceOfSquares {

    int n;

    DifferenceOfSquares(int n) {
        this.n = n
    }

    def sumOfSquares(){
        (1..n).collect { it -> Math.pow(it, 2) }
                .sum()
    }

    def squareOfSums(){
        def sum = (1..n).sum()
        Math.pow(sum, 2)
    }

    def difference(){
        squareOfSums() - sumOfSquares()
    }
}
