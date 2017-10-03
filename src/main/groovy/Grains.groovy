class Grains {

    def square(int square){
        Math.pow(2, square - 1)
    }

    def total(){
        (1..64).collect { it -> square(it) }
                .sum()
    }
}
