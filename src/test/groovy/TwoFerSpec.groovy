import org.apache.tools.ant.taskdefs.optional.extension.Specification
import spock.lang.Specification

class TwoFerSpec extends Specification {

    def 'no name given'() {
        expect: TwoFer.twoFer() == 'One for you, one for me.'
    }

    def 'empty name given'() {
        expect: TwoFer.twoFer('') == 'One for you, one for me.'
    }

    def 'Alice given as a name'() {
        expect:  TwoFer.twoFer('Alice') == 'One for Alice, one for me.'
    }

    def 'Bob given as name'() {
        expect: TwoFer.twoFer('Bob') == 'One for Bob, one for me.'
    }
}