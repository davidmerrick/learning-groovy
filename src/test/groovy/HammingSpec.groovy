import spock.lang.*

// from http://exercism.io/exercises/groovy/hamming/test-suite

class HammingSpec extends Specification {

    def 'computes zero distance for identical strands'() {
        expect: new Hamming().compute('A','A') == 0
    }

    def 'computes the distance for a single nucleotide strand'() {
        expect: new Hamming().compute('A','G') == 1
    }

    def 'computes the distance for a small strand'() {
        expect: new Hamming().compute('AG','CT') == 2
    }

    def 'computes a small Hamming distance'() {
        expect: new Hamming().compute('AT','CT') == 1
    }

    def 'computes a small Hamming distance in a longer strand'() {
        expect: new Hamming().compute('GGACG','GGTCG') == 1
    }

    def 'ignores additional nucleotides when the first strand is longer'() {
        expect: new Hamming().compute('AGAGACTTA','AAA') == 1
    }

    def 'ignores additional nucleotides when the second strand is longer'() {
        expect: new Hamming().compute('AGG','AAAACTGACCCACCCCAGG') == 2
    }

    def 'computes a large Hamming distance'() {
        expect: new Hamming().compute('GATACA','GCATAA') == 4
    }

    def 'computes a very long Hamming distance'() {
        expect: new Hamming().compute('GGACGGATTCTG','AGGACGGATTCT') == 9
    }

}