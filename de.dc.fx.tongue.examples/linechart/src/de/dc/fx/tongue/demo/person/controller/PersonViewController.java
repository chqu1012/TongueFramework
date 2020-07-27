package de.dc.fx.tongue.demo.person.controller;
	
import java.util.Random;

import de.dc.fx.tongue.FXSeries;
import de.dc.fx.tongue.FXTongueFactory;
import de.dc.fx.tongue.FXXYData;
import de.dc.fx.tongue.demo.person.model.PersonViewControllerIDs;
import de.dc.fx.tonque.core.TongueControlRenderer;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
public class PersonViewController extends BasePersonViewController{

	private Random r = new Random();
	
	@Override
	public void initializeDatabinding() {
		super.initializeDatabinding();
		VBox.setVgrow(chartLine, Priority.ALWAYS);
	}
	
	public void onButtonAddSeries(MouseEvent e) {
		if (renderer instanceof TongueControlRenderer) {
			TongueControlRenderer controlRenderer = (TongueControlRenderer) renderer;
			int seriesCount = Integer.parseInt(model.getTextCountOfSeries());
			for (int j = 0; j < seriesCount; j++) {
				FXSeries fxSeries = FXTongueFactory.eINSTANCE.createFXSeries();
				fxSeries.setName("Test "+chartLine.getData().size());
				for (int i = 0; i < 50; i++) {
					FXXYData data = FXTongueFactory.eINSTANCE.createFXXYData();
					data.setX(String.valueOf(i));
					data.setY(String.valueOf(r.nextInt()));
					fxSeries.getInput().add(data);
				}
				
				controlRenderer.addSerieById(PersonViewControllerIDs.chartLine, fxSeries );
			}
		}
	}
	
	public void onButtonClearChart(MouseEvent e) {
		chartLine.getData().clear();
	}
}
