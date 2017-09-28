class PhoneNumber {

    public number
    public areaCode

    PhoneNumber(number) {
        this.number = sanitize(number)
        this.areaCode = number.substring(0, 3)
    }

    private sanitize(number){
        number = number.replaceAll(/[ \(\)\-\.]/, "")
        if(number ==~ /.*[a-zA-Z].*/){
            number = "0000000000"
        } else if(number.size() == 9){
            number = "0000000000"
        } else if(number.size() == 11) {
            if(number.substring(0, 1) == "1"){
                number = number.substring(1, number.size())
            } else {
                number = "0000000000"
            }
        } else if(number.size() == 11) {
            if(!number.substring(0, 1) == "1"){
                number = "0000000000"
            }
        } else if(number.size() > 11) {
            number = "0000000000"
        }
        number
    }

    @Override
    String toString() {
        return "(${number.substring(0, 3)}) ${number.substring(3, 6)}-${number.substring(6, 10)}"
    }
}
