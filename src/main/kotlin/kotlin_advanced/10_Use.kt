package kotlin_advanced

import java.io.FileWriter


fun main() {
    FileWriter("test.txt")
        .use {
            //μλμΌλ‘ close
            it.write("hello kotlin")
        }
}