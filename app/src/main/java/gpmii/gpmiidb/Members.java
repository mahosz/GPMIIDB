package gpmii.gpmiidb;

/**
 * Created by mchho on 05/02/2018.
 */

public class Members {
    private String id;
    private String name;
    private String bod;
    private String address;
    private String division;
    private String region;

    public  Members(){

    }

    public  Members(String name,String address){
        this.name = name;
        this.address = address;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}
