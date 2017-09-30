class RnaTranscription {

    def dnaMap = [
            'G':'C',
            'C':'G',
            'T':'A',
            'A':'U'
    ]

    def ofDNA(dnaString){
        def badCharRegex = /.*[^G^C^T^A].*/;
        def matcher = (dnaString =~ badCharRegex)
        if(matcher.matches()){
            def errorMessage = "String contains invalid characters: ${matcher.group(0)}"
            throw new IllegalArgumentException(errorMessage)
        }

        dnaString.split("")
                .collect { it -> dnaMap.get(it) }
                .join("")
    }
}
