package pl.ttpsc.builder;

import java.util.Date;
import java.util.Map;

public class Building {
    private Long id;
    private String streetName;
    private int streetNumber;
    private String zipCode;
    private String buildingCompanyName;
    private String landlordName;
    private Date constructionYear;
    private Date constructionEndYear;
    private long flatsNumber;
    private long completeRentArea;
    private String completeRentAreaUnit;
    private Map<String, String> flatsDescription;
    private Map<String, Long> flatsPrices;
    private boolean hasCarPark;
    private boolean hasGarden;
    private boolean hasFence;
    private boolean petFriendlyFlag;
    private boolean commercialGroundFloorFlag;

    private Building(BuildingBuilder buildingBuilder){
        this.id = buildingBuilder.id;
        this.streetName = buildingBuilder.streetName;
        this.streetNumber = buildingBuilder.streetNumber;
        this.zipCode = buildingBuilder.zipCode;
        this.buildingCompanyName = buildingBuilder.buildingCompanyName;
        this.landlordName = buildingBuilder.landlordName;
        this.constructionYear = buildingBuilder.constructionYear;
        this.constructionEndYear = buildingBuilder.constructionEndYear;
        this.flatsNumber = buildingBuilder.flatsNumber;
        this.completeRentArea = buildingBuilder.completeRentArea;
        this.completeRentAreaUnit = buildingBuilder.completeRentAreaUnit;
        this.flatsDescription = buildingBuilder.flatsDescription;
        this.flatsPrices = buildingBuilder.flatsPrices;
        this.hasCarPark = buildingBuilder.hasCarPark;
        this.hasGarden = buildingBuilder.hasGarden;
        this.hasFence = buildingBuilder.hasFence;
        this.petFriendlyFlag = buildingBuilder.petFriendlyFlag;
        this.commercialGroundFloorFlag = buildingBuilder.commercialGroundFloorFlag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getBuildingCompanyName() {
        return buildingCompanyName;
    }

    public void setBuildingCompanyName(String buildingCompanyName) {
        this.buildingCompanyName = buildingCompanyName;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public Date getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Date constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Date getConstructionEndYear() {
        return constructionEndYear;
    }

    public void setConstructionEndYear(Date constructionEndYear) {
        this.constructionEndYear = constructionEndYear;
    }

    public long getFlatsNumber() {
        return flatsNumber;
    }

    public void setFlatsNumber(long flatsNumber) {
        this.flatsNumber = flatsNumber;
    }

    public long getCompleteRentArea() {
        return completeRentArea;
    }

    public void setCompleteRentArea(long completeRentArea) {
        this.completeRentArea = completeRentArea;
    }

    public String getCompleteRentAreaUnit() {
        return completeRentAreaUnit;
    }

    public void setCompleteRentAreaUnit(String completeRentAreaUnit) {
        this.completeRentAreaUnit = completeRentAreaUnit;
    }

    public Map<String, String> getFlatsDescription() {
        return flatsDescription;
    }

    public void setFlatsDescription(Map<String, String> flatsDescription) {
        this.flatsDescription = flatsDescription;
    }

    public Map<String, Long> getFlatsPrices() {
        return flatsPrices;
    }

    public void setFlatsPrices(Map<String, Long> flatsPrices) {
        this.flatsPrices = flatsPrices;
    }

    public boolean isHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasFence() {
        return hasFence;
    }

    public void setHasFence(boolean hasFence) {
        this.hasFence = hasFence;
    }

    public boolean isPetFriendlyFlag() {
        return petFriendlyFlag;
    }

    public void setPetFriendlyFlag(boolean petFriendlyFlag) {
        this.petFriendlyFlag = petFriendlyFlag;
    }

    public boolean isCommercialGroundFloorFlag() {
        return commercialGroundFloorFlag;
    }

    public void setCommercialGroundFloorFlag(boolean commercialGroundFloorFlag) {
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
    }

    public static class BuildingBuilder {
        private Long id;
        private String streetName;
        private int streetNumber;
        private String zipCode;
        private String buildingCompanyName;
        private String landlordName;
        private Date constructionYear;
        private Date constructionEndYear;
        private long flatsNumber;
        private long completeRentArea;
        private String completeRentAreaUnit;
        private Map<String, String> flatsDescription;
        private Map<String, Long> flatsPrices;
        private boolean hasCarPark;
        private boolean hasGarden;
        private boolean hasFence;
        private boolean petFriendlyFlag;
        private boolean commercialGroundFloorFlag;

        public BuildingBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public BuildingBuilder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public BuildingBuilder setStreetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public BuildingBuilder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public BuildingBuilder setBuildingCompanyName(String buildingCompanyName) {
            this.buildingCompanyName = buildingCompanyName;
            return this;
        }

        public BuildingBuilder setLandlordName(String landlordName) {
            this.landlordName = landlordName;
            return this;
        }

        public BuildingBuilder setConstructionYear(Date constructionYear) {
            this.constructionYear = constructionYear;
            return this;
        }

        public BuildingBuilder setConstructionEndYear(Date constructionEndYear) {
            this.constructionEndYear = constructionEndYear;
            return this;
        }

        public BuildingBuilder setFlatsNumber(long flatsNumber) {
            this.flatsNumber = flatsNumber;
            return this;
        }

        public BuildingBuilder setCompleteRentArea(long completeRentArea) {
            this.completeRentArea = completeRentArea;
            return this;
        }

        public BuildingBuilder setCompleteRentAreaUnit(String completeRentAreaUnit) {
            this.completeRentAreaUnit = completeRentAreaUnit;
            return this;
        }

        public BuildingBuilder setFlatsDescription(Map<String, String> flatsDescription) {
            this.flatsDescription = flatsDescription;
            return this;
        }

        public BuildingBuilder setFlatsPrices(Map<String, Long> flatsPrices) {
            this.flatsPrices = flatsPrices;
            return this;
        }

        public BuildingBuilder setHasCarPark(boolean hasCarPark) {
            this.hasCarPark = hasCarPark;
            return this;
        }

        public BuildingBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public BuildingBuilder setHasFence(boolean hasFence) {
            this.hasFence = hasFence;
            return this;
        }

        public BuildingBuilder setPetFriendlyFlag(boolean petFriendlyFlag) {
            this.petFriendlyFlag = petFriendlyFlag;
            return this;
        }

        public BuildingBuilder setCommercialGroundFloorFlag(boolean commercialGroundFloorFlag) {
            this.commercialGroundFloorFlag = commercialGroundFloorFlag;
            return this;
        }

        public Building build() {
            return new Building(this);
        }
    }
}
