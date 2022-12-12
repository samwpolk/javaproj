package com.sam.polk.stpwtch;

public class StpWtch_Model {

	private double startTime;
	private double stopTime;
	private double elapseTime;
	private double pauseStartTime;
	private double pauseElaspeTime;
	private double pauseStopTime;
	private double pauseTolatTime;
	private double pauseElapseTime;
	private boolean pauseToggle = false;

	StpWtch_Model() {

	}

	public double initStartTime() {

		startTime = System.currentTimeMillis();
		return startTime;
	}

	public void setStopTime() {

		stopTime = System.currentTimeMillis();

	}

   public void setElaspseTime(double starTime, double stopTime, double pauseTotaltime) {

		elapseTime = ((stopTime - startTime) - pauseTotaltime) / 1000;
	}

    public void setPauseToggle() {

		pauseToggle = !pauseToggle;

	}

	public void setPauseStartTime() {

		pauseStartTime = System.currentTimeMillis();

	}

	 public void setPauseStopTime() {

		pauseStopTime = System.currentTimeMillis();

	}

	 public void setPauseElaspeTime(double pauseSrtTime, double pauseStpTime) {

		pauseElaspeTime = (pauseStpTime - pauseSrtTime);

	}

	public void setPauseTotalTime(double pauseElspeTime) {

		pauseTolatTime += pauseElspeTime;

	}

	public double getStartTime() {

		return startTime;
	}

	public double getStopTime() {
		return stopTime;
	}

	public double getElapseTime() {
		return elapseTime;
	}

	public double getPauseStartTime() {
		return pauseStartTime;
	}

	public double getPauseElaspeTime() {
		return pauseElaspeTime;
	}

	public double getPauseStopTime() {
		return pauseStopTime;
	}

	public double getPauseTolatTime() {
		return pauseTolatTime;
	}

	public boolean getPauseToggel() {

		return pauseToggle;
	}

}
