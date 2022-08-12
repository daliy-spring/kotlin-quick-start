package kotlin_advanced

import java.io.FileWriter


fun main() {
    FileWriter("test.txt")
        .use {
            //자동으로 close
            it.write("hello kotlin")
        }
}