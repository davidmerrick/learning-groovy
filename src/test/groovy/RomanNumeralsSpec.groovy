import spock.lang.*

class RomanNumeralsSpec extends Specification {

    def '1 == I'() {
        expect: new RomanNumerals(1).roman == 'I'
    }

    def '2 == II'() {
        expect: new RomanNumerals(2).roman == 'II'
    }

    def '3 == III'() {
        expect: new RomanNumerals(3).roman == 'III'
    }

    def '4 == IV'() {
        expect: new RomanNumerals(4).roman == 'IV'
    }

    def '5 == V'() {
        expect: new RomanNumerals(5).roman == 'V'
    }

    def '6 == VI'() {
        expect: new RomanNumerals(6).roman == 'VI'
    }

    def '9 == IX'() {
        expect: new RomanNumerals(9).roman == 'IX'
    }

    def '27 == XXVII'() {
        expect: new RomanNumerals(27).roman == 'XXVII'
    }

    def '48 == XLVIII'() {
        expect: new RomanNumerals(48).roman == 'XLVIII'
    }

    def '59 == LIX'() {
        expect: new RomanNumerals(59).roman == 'LIX'
    }

    def '93 == XCIII'() {
        expect: new RomanNumerals(93).roman == 'XCIII'
    }

    def '141 == CXLI'() {
        expect: new RomanNumerals(141).roman == 'CXLI'
    }

    def '163 == CLXIII'() {
        expect: new RomanNumerals(163).roman == 'CLXIII'
    }

    def '402 == CDII'() {
        expect: new RomanNumerals(402).roman == 'CDII'
    }

    def '575 == DLXXV'() {
        expect: new RomanNumerals(575).roman == 'DLXXV'
    }

    def '911 == CMXI'() {
        expect: new RomanNumerals(911).roman == 'CMXI'
    }

    def '1024 == MXXIV'() {
        expect: new RomanNumerals(1024).roman == 'MXXIV'
    }

    def '3000 == MMM'() {
        expect: new RomanNumerals(3000).roman == 'MMM'
    }
}