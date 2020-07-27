package de.dc.fx.tongue.demo.person.cell;

import de.dc.fx.tongue.demo.person.model.Person;
import javafx.scene.control.ListCell;

public class PersonListCell extends ListCell<Person>{

	@Override
	protected void updateItem(Person item, boolean empty) {
		super.updateItem(item, empty);
		if (item == null || empty) {
			setText(null);
			setGraphic(null);
		}else {
			setText(item.getName()+", "+item.getFamilyname());
		}
	}
}
