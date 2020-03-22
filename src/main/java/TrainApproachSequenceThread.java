public class TrainApproachSequenceThread extends Thread {

  private int lcdHandle;
  private String destination;

  public void run() {
    LcdUtils.setRow(lcdHandle, 0, destination);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      LcdUtils.trainApproaching(lcdHandle);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    LcdUtils.setRow(lcdHandle, 0, destination);
  }

  public TrainApproachSequenceThread (int lcdHandle, String destination) {
    this.lcdHandle = lcdHandle;
    this.destination = destination;
  }

}
