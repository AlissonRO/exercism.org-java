import java.util.HashMap;
import java.util.Map;

class DialingCodes {
    private Map<Integer, String> codeCountry = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codeCountry;
    }

    public void setDialingCode(Integer code, String country) {
       codeCountry.put(code, country);
    }

    public String getCountry(Integer code) {
        return codeCountry.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!codeCountry.containsKey(code)
                && !codeCountry.containsValue(country)) codeCountry.put(code, country);
    }

    public Integer findDialingCode(String country) {
        return  codeCountry.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(country))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldKey = codeCountry.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(country))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        if (oldKey != null) {
           
            String existingValue = codeCountry.remove(oldKey);
            codeCountry.put(code, existingValue);
        }
    }
}