import com.fasterxml.jackson.annotation.JsonProperty;

public class Faal {
    @JsonProperty("Poem")
    private String Poem;

    @JsonProperty("Interpretation")
    private String Interpretation;

    public String getInterpretation() {
        return Interpretation;
    }

    public String getPoem() {
        return Poem;
    }

    public void setInterpretation(String interpretation) {
        Interpretation = interpretation;
    }

    public void setPoem(String poem) {
        Poem = poem;
    }
}
