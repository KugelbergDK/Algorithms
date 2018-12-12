package compression;

public class RunLengthEncoding {

    public static String bytesString = "10000010 01100111 10101110 10000001 10111101 10000110 00100010 10111000 \n" +
            "10010100 10010011 01001110 00100110 00101110 00101011 00101111 01111111 \n" +
            "00010011 11100011 00100111 10010111 11010100 01110001 10010001 10001010 \n" +
            "11111111 11001100 10010110 01011110 11001011 11010101 01001110 01111111 \n" +
            "00100111 00011001 10000100 00111101 01100001 00010110 01101100 00011001 \n" +
            "11001100 00110101 00011000 01110101 01000000 10001001 11101001 00110010 \n" +
            "10001110 10010011 11111000 11001000 01110010 00000000 10110111 11011111 \n" +
            "01100111 01110010 01011100 11000011 00110100 00101000 11101101 10101100 \n" +
            "01110010 01001101 10100111 00110011 11010000 10000001 01000010 11011010 \n" +
            "10110001 01110101 11110101 01001001 10011111 00100111 00000101 11001110 \n" +
            "11100100 00001010 11010111 10000010 00010110 00110011 01000101 00010110 \n" +
            "01101111 01011000 00100101 00111100 00001100 10010000 11100001 11011100 \n" +
            "11100111 00000000 00011101 00001010 01110101 00100001 01111011 11010110 \n" +
            "01001010 11001101 11001011 11100011 01001101 00001111 00101011 11110000 \n" +
            "01011110 01110000 01011000 01001000 01001011 10011000 10110000 10011000 \n" +
            "00101100 01010101 00111111 10110100 10001011 00101111 10100111 00000101 \n" +
            "01000000 11111111 11110001 10001010 01110010 00000000 10101110 01111001 \n" +
            "01010101 00011111 11010101 11010110 10110111 10001001 01101110 01101111 \n" +
            "11110011 00110001 11011000 00010101 10101000 00110100 00100010 01000111 \n" +
            "00000000 11110001 11001010 11100101 11101010 10101001 00011111 11101101 \n" +
            "00101011 00100011 00111000 10011101 00001010 00001110 01010110 01011001 \n" +
            "11100011 01100100 11000000 10111111 10000100 10010100 00001001 11000010 \n" +
            "10010100 10111011 00100011 00111110 00110110 11111100 01100000 10010010 \n" +
            "11101010 00011111 01011100 10010101 00111000 10000110 00100101 11101010 \n" +
            "10111100 11000000 11011011 10111001 00000011 01101110 00100000 00111110 \n" +
            "10110000 10000001 00110001 01000000 01111101 00001000 10110100 00001100 \n" +
            "11110011 01010111 11010101 10101001 11001010 11010111 10111011 11001000 \n" +
            "11100000 10001001 10100000 00100111 00100111 00011101 10010101 10010011 \n" +
            "11110100 01011000 01001101 01000111 01001101 00001101 01001001 00110011 \n" +
            "11011110 01000000 10011001 11111010 11100001 11101010 01111100 11001100 \n" +
            "10111001 11101001 01110000 00000111 11100111 11100011 01010100 00110001 \n" +
            "01010010 01010101 01110111 00000010 11101000 01001111 01111110 11010011 \n" +
            "10111110 00011100 11111000 10101011 01100010 01011011 10100101 01010110 \n" +
            "10100101 00111011 00100111 11110010 00011111 10011110 11000010 11010011 \n" +
            "01100010 01001110 11000101 11111101 00010111 11001011 10100101 10101111 \n" +
            "01111001 01010011 10110101 10001011 00111111 11101010 01101111 00010111 \n" +
            "11110110 01001110 10101110 11100110 00110101 00111010 11001001 11000110 \n" +
            "00010110 00100011 10000110 10111100 aaaaaa";

    public static String compress(){
        String newByteString = "";
        for (int i = 0; i < bytesString.length(); i++) {

            String c = String.valueOf(bytesString.charAt(i));

            if (c.equals("1") || c.equals("0")){
                newByteString += c;
            }
        }

        // Encoding part
        String compressedString = "";
        int lenghtCount = 1;

        for (int i = 0; i < newByteString.length(); i++) {
            char thisChar = newByteString.charAt(i);

            /**
             * If this iteration is less than the text length AND current char equeals the next char,
             * then count
             */
            if (i + 1 < newByteString.length() && thisChar == newByteString.charAt(i+1)){
                lenghtCount++;
            }

            /**
             * Else if count is larger than 1,
             * then add the length and the character
             */

            else if (lenghtCount > 1){
                compressedString += "(" + lenghtCount + ")" + newByteString.charAt(i);
                lenghtCount = 1; // Resets the counter

            }

            /**
             * Else if count equals 1,
             * then add the character
             */

            else if (lenghtCount == 1){
                compressedString += newByteString.charAt(i);

            }
        }
        return compressedString;

    }

}