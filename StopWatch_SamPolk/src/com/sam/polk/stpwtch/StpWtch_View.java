package com.sam.polk.stpwtch;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StpWtch_View extends JFrame {

	private JButton startButton = new JButton("Start");
	private JButton puaseButton = new JButton("Pause");
	private JButton stopButton = new JButton("Stop");
	private JTextField totalTime = new JTextField(20);

	StpWtch_View() {

		this.setTitle("StopWatch");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 100);

		JPanel stpWtchPanel = new JPanel();

		stpWtchPanel.add(startButton);
		stpWtchPanel.add(puaseButton);
		stpWtchPanel.add(stopButton);
		stpWtchPanel.add(totalTime);

		this.add(stpWtchPanel);
		this.setVisible(true);

	}

	void setTime(String time) {
		totalTime.setText(time);

	}

	void paused() {
		puaseButton.setText("Paused");
	}

	void pause() {
		puaseButton.setText("Pause");
	}

	void startActionListener(ActionListener listenStartButton) {

		startButton.addActionListener(listenStartButton);

	}

	void pauseActionListener(ActionListener listenPauseButton) {

		puaseButton.addActionListener(listenPauseButton);

	}

	void stopActionListener(ActionListener listenStopButton) {

		stopButton.addActionListener(listenStopButton);

	}

}
