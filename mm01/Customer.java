public class Customer {
	private String name;
    private String stateCode;
    private String region;
    private String county;

    public Customer() {
        name = "N/A";
        stateCode = "N/A";
        region = "N/A";
        county = "N/A";
    }

    public Customer(String name, String stateCode) {
        this.name = name;
        this.stateCode = stateCode;
        region = "N/A";
        county = "Estonia";

    }

    public Customer(String name, String stateCode, String region, String county) {
        this.name = name;
        this.stateCode = stateCode;
        this.region = region;
        this.county = county;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
