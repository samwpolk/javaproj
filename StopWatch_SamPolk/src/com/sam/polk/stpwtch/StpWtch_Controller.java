package com.sam.polk.stpwtch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StpWtch_Controller {

	private StpWtch_View stopWatchView;
	private StpWtch_Model stopWatchModel;

	StpWtch_Controller(StpWtch_View stopWatchView, StpWtch_Model stopWatchModel) {

		this.stopWatchView = stopWatchView;
		this.stopWatchModel = stopWatchModel;

		this.stopWatchView.startActionListener(new StartListner());
		this.stopWatchView.pauseActionListener(new PauseListner());
		this.stopWatchView.stopActionListener(new StopListner());

	}


	class StartListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			stopWatchModel.initStartTime();

		}

	}

	class PauseListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (!stopWatchModel.getPauseToggel()) {
				stopWatchView.paused();
				stopWatchModel.setPauseToggle();
				stopWatchModel.setPauseStartTime();
			} else {

				stopWatchView.pause();
				stopWatchModel.setPauseToggle();
				stopWatchModel.setPauseStopTime();
				stopWatchModel.setPauseElaspeTime(
						stopWatchModel.getPauseStartTime(),
						stopWatchModel.getPauseStopTime());
				stopWatchModel.setPauseTotalTime(stopWatchModel
						.getPauseElaspeTime());
			}

		}

	}

	class StopListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			stopWatchModel.setStopTime();
			stopWatchModel.setElaspseTime(stopWatchModel.getStartTime(),
					stopWatchModel.getStopTime(),
					stopWatchModel.getPauseTolatTime());
			stopWatchView.setTime(Double.toString(stopWatchModel
					.getElapseTime()));

		}

	}

}
