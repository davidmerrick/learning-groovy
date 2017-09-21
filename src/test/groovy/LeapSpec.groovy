import spock.lang.*

// From http://exercism.io/exercises/groovy/leap/test-suite
// Given a year, report if it is a leap year.

class LeapSpec extends Specification {

    def 'a year not divisible by 4 is not a leap year'() {
        expect: new Leap(2015).isLeapYear() == false
    }

    def 'a year divisible by 4, but not 100, is a leap year'() {
        expect: new Leap(2016).isLeapYear() == true
    }

    def 'a year divisible by 100, but not 400, is not a leap year'() {
        expect: new Leap(2100).isLeapYear() == false
    }

    def 'a year divisible by 400 is a leap year'() {
        expect: new Leap(2000).isLeapYear() == true
    }

}