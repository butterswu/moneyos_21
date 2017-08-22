package ssm.model;

import java.util.List;

public class Park {
    private long id;
    private String province;
    private String city;
    private String parkAreaID;
    private String parkProvince;
    private String parkCity;
    private String parkDistrict;
    private String parkName;
    private String parkLocation;
    private List<Building> parkBuildingList;
    private int buildingCount;
    public String getProvince() {
        return province;
    }
    private String area;

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }



    public String getParkAreaID() {
        return parkAreaID;
    }

    public void setParkAreaID(String parkAreaId) {
        this.parkAreaID = parkAreaId;
    }



    public int getBuildingCount() {
        return buildingCount;
    }

    public void setBuildingCount(int buildingCount) {
        this.buildingCount = buildingCount;
    }

    public List<Building> getParkBuildingList() {
        return parkBuildingList;
    }

    public void setParkBuildingList(List<Building> parkBuildingList) {
        this.parkBuildingList = parkBuildingList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParkProvince() {
        return parkProvince;
    }

    public void setParkProvince(String parkProvince) {
        this.parkProvince = parkProvince;
    }

    public String getParkCity() {
        return parkCity;
    }

    public void setParkCity(String parkCity) {
        this.parkCity = parkCity;
    }

    public String getParkDistrict() {
        return parkDistrict;
    }

    public void setParkDistrict(String parkDistrict) {
        this.parkDistrict = parkDistrict;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkLocation() {
        return parkLocation;
    }

    public void setParkLocation(String parkLocation) {
        this.parkLocation = parkLocation;
    }
}
