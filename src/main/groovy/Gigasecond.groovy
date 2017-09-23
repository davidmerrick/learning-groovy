import groovy.time.TimeCategory

class Gigasecond {

    Gigasecond() {}

    def from(Date startDate){
        Date newDate
        use(TimeCategory) {
            newDate = startDate + 10.power(9).seconds
        }

        newDate
    }
}
