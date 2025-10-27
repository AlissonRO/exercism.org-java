import java.util.HashMap;
import java.util.Map;

class DialingCodes {
    private final Map<Integer, String> codeCountry = new HashMap<>();

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
        for (Map.Entry<Integer, String> entry : codeCountry.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        if (oldCode != null) {
            codeCountry.remove(oldCode);
            setDialingCode(code, country);
        }
    }
}