class RobotName {

    def name
    Random random = new Random()

    def getRandomChar(){
        def alphabet = ('A'..'Z').join()
        alphabet.charAt(random.nextInt(alphabet.size() + 1))
    }

    def getRandomDigit(){
        random.nextInt(10)
    }

    RobotName() {
        this.getName()
    }

    def reset(){
        this.getName()
    }

    def getName(){
        def name = ""
        name += getRandomChar()
        name += getRandomChar()
        name += getRandomDigit()
        name += getRandomDigit()
        name += getRandomDigit()
        name
    }
}
