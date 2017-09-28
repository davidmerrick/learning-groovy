class TwoFer {

    def static twoFer(){
        "One for you, one for me."
    }

    def static twoFer(name){
        if(!name){
            return "One for you, one for me."
        }

        return "One for ${name}, one for me."
    }
}
