package homework_17.Lilit_Adamyan.deepClone;

import homework_6.Anush_Ananyan.chapter_8.As;

public class AsiaContinent implements Cloneable{
    private EurasiaMainland eurasiaMainland;

    public AsiaContinent(EurasiaMainland eurasiaMainland) {
        this.eurasiaMainland = eurasiaMainland;
    }

    public EurasiaMainland getEurasiaMainland() {
        return eurasiaMainland;
    }

    public void setEurasiaMainland(EurasiaMainland eurasiaMainland) {
        this.eurasiaMainland = eurasiaMainland;
    }


    protected AsiaContinent deepClone() throws CloneNotSupportedException {
        AsiaContinent clone = (AsiaContinent) super.clone();
        clone.setEurasiaMainland(this.getEurasiaMainland().deepClone());
        return clone;

    }
}
