class RomanNumerals {

    private int arabic

    def onesMap = [
            1:'I',
            2:'II',
            3:'III',
            4:'IV',
            5:'V',
            6:'VI',
            7:'VII',
            8:'VIII',
            9:'IX'
    ]

    def tensMap = [
            1:'X',
            2:'XX',
            3:'XXX',
            4:'XL',
            5:'L',
            6:'LX',
            7:'LXX',
            8:'LXXX',
            9:'XC'
    ]

    def hundredsMap = [
            1:'C',
            2:'CC',
            3:'CCC',
            4:'CD',
            5:'D',
            6:'DC',
            7:'DCC',
            8:'DCCC',
            9:'CM'
    ]

    def thousandsMap = [
            1:'M',
            2:'MM',
            3:'MMM'
    ]

    RomanNumerals(int arabic) {
        if(arabic > 3000){
            throw new RuntimeException("Arabic number must be less than or equal to 3,000")
        }

        this.arabic = arabic
    }

    def getRoman(){
        def roman = ""

        def thousands = thousandsMap.get((int) Math.floor((this.arabic % 10000)/1000))
        if(thousands) {
            roman += thousands
        }

        def hundreds = hundredsMap.get((int) Math.floor((this.arabic % 1000)/100))
        if(hundreds) {
            roman += hundreds
        }

        def tens = tensMap.get((int) Math.floor((this.arabic % 100)/10))
        if(tens) {
            roman += tens
        }

        def ones = onesMap.get(this.arabic % 10)
        if(ones){
            roman += ones
        }
        roman

    }
}
