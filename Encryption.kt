package com.example.project3

class Encryption(private var shift: Int) {

    fun encrypt(text: String): String {
        val encryptedText = StringBuilder()

        for (char in text) {
            val shiftedChar = when (char) {
                in 'A'..'Z' -> {
                  
                    ((char - 'A' + shift) % 26 + 'A'.code).toChar()
                }
             
                in 'a'..'z' -> {
                    ((char - 'a' + shift) % 26 + 'a'.code).toChar()
                }
                else -> {
                    char
                }
            }
            encryptedText.append(shiftedChar)
        }

        return encryptedText.toString()
    }
}
