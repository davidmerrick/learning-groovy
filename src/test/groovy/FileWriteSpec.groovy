import spock.lang.Specification

// Doing this as an exercise to answer this question:
// https://stackoverflow.com/questions/46484269/connecting-with-linux-sftp-server-using-groovy/46493308#46493308
// Note: requires a "tmp" directory in this repo

public class FileWriteSpec extends Specification {

    def 'Writes a file and changes permissions on it'() {
        given:
            def myFile = new File("tmp/myFile.txt")
        when:
            myFile.write("Hello World")
            myFile.setReadable(true, false)
            myFile.setWritable(true, false)
            myFile.setExecutable(true, false)
        then:
            myFile.canRead() && myFile.canWrite() && myFile.canExecute()
    }

}
