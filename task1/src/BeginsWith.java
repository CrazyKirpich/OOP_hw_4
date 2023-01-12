public class BeginsWith<T> implements IsGood<T>
{
    private T line;

    public BeginsWith(T line) {
        this.line = line;
    }

    @Override
    public boolean isGood(T text)
    {
        if(((String) line).equals(((String) text).substring(0,((String) line).length())))
        {
            return true;
        }
    return false;
    }
}
