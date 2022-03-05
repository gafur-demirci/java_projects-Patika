package PatikaStore;

public class ProductGroups {

    private int groupId;
    private String brandName;

    public ProductGroups(int groupId, String brandName) {
        this.groupId = groupId;
        this.brandName = brandName;
    }




    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}