package megha.g_play_store;

/**
 * Created by Megha Chauhan on 15-Sep-17.
 */

public class SingleItemModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    private String url;
    public SingleItemModel(){}
    public SingleItemModel(String name,String url){
        this.name=name;
        this.url=url;
    }

}
