package carbon.component;

import android.view.ViewGroup;

import carbon.R;
import carbon.widget.DropDown;

public class IconDropDownRow<Type extends IconDropDownItem> extends DataBindingComponent<Type> {

    private DropDown<Type> dropDown;

    public IconDropDownRow(ViewGroup parent) {
        super(parent, R.layout.carbon_row_icondropdown);
        dropDown = getView().findViewById(R.id.carbon_dropDown);
    }

    @Override
    public void bind(Type data) {
        super.bind(data);
        dropDown.setItems((Type[]) data.getItems());
    }

    public DropDown getDropDown() {
        return dropDown;
    }

    public Object getSelectedItem() {
        return dropDown.getSelectedItem();
    }

    public void setSelectedItem(Type item) {
        dropDown.setSelectedItem(item);
    }
}
