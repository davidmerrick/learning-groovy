class Raindrops {

    def convert(number){
        def result
        switch(number) {
            case { it % 3 == 0 }:
                if(number % 5 == 0){
                    if(number % 7 == 0) {
                        result = "PlingPlangPlong"
                    } else {
                        result = "PlingPlang"
                    }
                } else if(number % 7 == 0){
                    result = "PlingPlong"
                } else {
                    result = "Pling"
                }
                break
            case { it % 5 == 0 }:
                if(number % 7 == 0){
                    result = "PlangPlong"
                } else {
                    result = "Plang"
                }
                break
            case { it % 7 == 0 }:
                result = "Plong"
                break
            default:
                result = String.valueOf(number)
                break
        }
        result
    }
}
