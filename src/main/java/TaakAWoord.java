public class TaakAWoord {
    private String woord;

    public TaakAWoord(String woord){
        this.woord = woord;
    }

    public boolean isPalindroom(){
        String omgekeerd = new StringBuilder(woord).reverse().toString();
        return woord.equals(omgekeerd);
    }
}
