class WordCount {

    def sentence

    WordCount(sentence) {
        this.sentence = sentence
    }

    def getDelimiter(sentence){
        def result
        switch(sentence){
            case sentence.contains(",") && !sentence.contains(" "):
                result = ","
                break
            default:
                result = " "
                break
        }
        result
    }

    def wordCount(){
        def delimiter = getDelimiter(sentence)
        def wordMap = sentence
                .split(delimiter)
                .removeIf(!it ==~ "/*[A-Za-z]*/")
                .collect { it -> it.replace(",", "") }
                .countBy {it}
        wordMap
    }
}
