package tema7_cursul10;

public class CustomerPurches {
    int ID;
    String purchasedProdct;
    String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPurchasedProdct() {
        return purchasedProdct;
    }

    public void setPurchasedProdct(String purchasedProdct) {
        this.purchasedProdct = purchasedProdct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    String category;

    @Override
    public String toString() {
        return "CustomerPurches{" +
                "ID=" + ID +
                ", purchasedProdct='" + purchasedProdct + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
