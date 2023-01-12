public class BeginsWitha<T, T2> implements IsGood<T>
{
    private T2 oneLetter;

    public BeginsWitha(T2 oneLetter) {
        this.oneLetter = oneLetter;
    }

    @Override
    public boolean isGood(T item)
    {
        if (((String) item).charAt(0) == (char) oneLetter) return true;
        return false;
    }
}
