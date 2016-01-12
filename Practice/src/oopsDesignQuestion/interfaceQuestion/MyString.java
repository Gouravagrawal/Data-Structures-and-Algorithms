package oopsDesignQuestion.interfaceQuestion;

public interface MyString
{
    /**
     * Sets the value of the current string.
     * 
     * @param String
     *            The value to be set
     */
    void setString(String s);

    /**
     * Returns the current string
     * 
     * @return Current string
     */
    String getString();

    /**
     * Returns a string that consists of all the vowels in the current string,
     * in the same order and with the same case.
     * ("y" is not considered a vowel)
     * 
     * @return Vowels in the current string
     */
    String getVowels();

    /**
     * Returns the number of vowels in the current string
     * ("y" is not considered a vowel)
     * 
     * @return Number of vowels in the current string
     */
    int numberOfVowels();

    /**
     * Returns the character at position "position" in the string, with 1 being the
     * first position
     * 
     * @param position
     *            Position of the character to return
     * @return The character at position "position"
     * @throws ArgumentException
     *             If "position" is invalid (e.g., "position" <= 0)
     * @throws IndexOutOfRangeException
     *             If the string has less than "position" characters in it
     */
    char getCharacter(int position);

    /**
     * Changes the case of the alphabetic characters in the current string,
     * between startPosition and endPosition (included), with 1 being the first
     * position:
     * - lower case characters are replaced with the corresponding upper case characters
     * - upper case characters are replaced with the corresponding lower case characters
     * 
     * @param startPosition
     *            Position of the first character to consider
     * @param endPosition
     *            Position of the last character to consider
     * @return
     * @throws ArgumentException
     *             If either "startPosition" or "endPosition" are invalid (e.g.,
     *             "startPosition" <= 0, "endPosition" <= 0, "startPosition" > "endPosition")
     * @throws IndexOutOfRangeException
     *             If the string has less than "endPosition" characters in it
     */
    void flipCaseInSubstring(int startPosition, int endPosition);
}
