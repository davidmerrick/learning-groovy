import groovy.time.TimeCategory

import java.time.Duration

class Gigasecond {

    def Gigasecond() {}

    def from(Date startDate){
        Date newDate
        use(TimeCategory) {
            newDate = startDate + 10.power(9).seconds
        }

        newDate
    }
}
