package pl.put.poznan.transformer.logic;

/**
 *Сlass capitalize the first word in a sentence
 *
 */
public class ToSentence extends TextTransformer{
    /**
     *Constructor of text transformation class.
     * @param transInterface text to decorate
     */
    public ToSentence(IText transInterface) {
        super(transInterface);
    }

    /**
     *Method performing the transformation
     * @param text text to decorate
     * @return answer text after transformation
     */
    @Override
    public String transform(String text){
        return toSentence(this.transInterface.transform(text));
    }

    /**
     * Method capitalize the first word in a sentence
     * @param text text to decorate
     * @return answer text after transformation
     */
    private String toSentence(String text)
    {
        String answer = "";
        boolean istnienia = true;
        for (int i = 0; i < text.length();i++)
        {
            if(istnienia){
                answer += Character.toUpperCase(text.charAt(i));
            }
            else{
                answer += Character.toLowerCase(text.charAt(i));
            }

            if(text.charAt(i) != ' ') {
                istnienia = false;
            }

            if(text.charAt(i) == '.') {
                istnienia = true;
            }
        }
        return answer;
    }
}
