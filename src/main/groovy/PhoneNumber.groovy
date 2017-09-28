class PhoneNumber {

    public number

    PhoneNumber(number) {
        this.number = sanitize(number)
    }

    private sanitize(number){
        number.replaceAll(/[ \(\)\-\.]/, "")
    }
}
