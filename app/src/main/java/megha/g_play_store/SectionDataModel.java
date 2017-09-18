package megha.g_play_store;

import java.util.ArrayList;

/**
 * Created by Megha Chauhan on 15-Sep-17.
 */

public class SectionDataModel {
    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    private String headerTitle;

    public ArrayList<SingleItemModel> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(ArrayList<SingleItemModel> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }

    private ArrayList<SingleItemModel> allItemsInSection;
    public SectionDataModel(){}
    public  SectionDataModel(String headerTitle,ArrayList<SingleItemModel> allItemsInSection){
        this.allItemsInSection=allItemsInSection;
        this.headerTitle=headerTitle;
    }

}
