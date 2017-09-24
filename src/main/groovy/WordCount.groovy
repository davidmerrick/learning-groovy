class WordCount {

    def sentence

    WordCount(sentence) {
        this.sentence = sentence
    }

    def getDelimiter(sentence) {
        def result

        if (sentence.contains(",") && !sentence.contains(" ")){
            result = ","
        } else {
            result = " "
        }
        result
    }

    def wordCount(){
        def delimiter = getDelimiter(sentence)
        def wordList = sentence
                .split(delimiter)
                .collect { it -> it.replace(",", "") }
                .collect { it -> it.replaceAll(/[\:\!\?\&\@\%\^\$\.]/, "") }
                .collect { it -> it.toLowerCase() }
        wordList.removeAll { !it }
        def wordMap = wordList.countBy {it}
        wordMap
    }
}
