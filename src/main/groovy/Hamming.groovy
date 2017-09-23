class Hamming {

    Hamming() {}

    def getDiff(String longerString, String shorterString){
        def count = 0;
        for(def i = 0; i < shorterString.size(); i++){
            def unequal = longerString.substring(i, i+1) != shorterString.substring(i, i+1)
            if(unequal){
                count++
            }
        }

        count
    }

    def compute(String a, String b){
        if(a.size() <= b.size()){
            return getDiff(b, a)
        } else {
            return getDiff(a, b)
        }
    }
}
