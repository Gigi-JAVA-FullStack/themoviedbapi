package info.movito.themoviedbapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.model.core.NamedElement;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class Translation extends NamedElement {

    @JsonProperty("iso_3166_1")
    private String countryCode;


    @JsonProperty("iso_639_1")
    private String languageCode;


    @JsonProperty("english_name")
    private String englishName;


    private Data data;


    public String getCountryCode() {
        return countryCode;
    }


    public String getEnglishName() {
        return englishName;
    }


    /**
     * @deprecated use {@code getLanguageCode} as iso_3166_1 (country iso code) was added.
     */
    @Deprecated
    public String getIsoCode() {
        return getLanguageCode();
    }


    public String getLanguageCode() {
        return languageCode;
    }


    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @deprecated use {@code setLanguageCode} as iso_3166_1 (country iso code) was added.
     */
    @Deprecated
    public void setIsoCode(String isoCode) {
        setLanguageCode(isoCode);
    }


    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }


    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }


    public Data getData() {
        return data;
    }


    public void setData(Data data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
