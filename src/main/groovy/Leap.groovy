class Leap {

    int year

    def Leap(year) {
        this.year = year
    }

    def isLeapYear(){
        if(year % 4 != 0){
            return false
        } else {
            if(year % 100 != 0){
                return true
            }

            if(year % 400 == 0){
                return true
            }

            return false
        }
    }
}
