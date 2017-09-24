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
                .collect { it -> it.replace(",", "") }
                .collect { it -> it.replaceAll(/[\:\!\?\&\@\%\^\$]/, "") }
                .countBy {it}
        wordMap
    }
}
