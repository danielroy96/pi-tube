import com.pi4j.wiringpi.Lcd;


public class LcdUtils {

  public static void setRow(int lcdHandle, int row, String destinationName, int arrivalSeconds) {
    clearRow(lcdHandle, row);
    int arrivalMinutes = Math.min(arrivalSeconds/60, 9);

    String destinationNameShort;

    if (destinationName.length() > 13) {
      destinationNameShort = destinationName.substring(0, 13);
    }
    else {
      destinationNameShort = destinationName;
    }
    Lcd.lcdPosition(lcdHandle, 0, row);
    Lcd.lcdPuts(lcdHandle, destinationNameShort);
    Lcd.lcdPosition(lcdHandle, 14, row);
    Lcd.lcdPuts(lcdHandle, arrivalMinutes + "m");
  }

  public static void setRow(int lcdHandle, int row, String destinationName) {
    clearRow(lcdHandle, row);
    String destinationNameShort;

    if (destinationName.length() > 13) {
      destinationNameShort = destinationName.substring(0, 13);
    }
    else {
      destinationNameShort = destinationName;
    }
    Lcd.lcdPosition(lcdHandle, 0, row);
    Lcd.lcdPuts(lcdHandle, destinationNameShort);
  }

  public static void trainApproaching(int lcdHandle) throws InterruptedException {
    animateClearRow(lcdHandle, 0);
    animateClearRow(lcdHandle, 1);
    Thread.sleep(1000);
    printRow(lcdHandle, 0, "** STAND BACK **");
    Thread.sleep(1000);
    clearRow(lcdHandle, 0);
    Thread.sleep(1000);
    printRow(lcdHandle, 0, "** STAND BACK **");
    Thread.sleep(1000);
    clearRow(lcdHandle, 0);
    Thread.sleep(1000);
    printRow(lcdHandle, 0, " *** TRAIN *** ");
    printRow(lcdHandle, 1, "* APPROACHING *");
    Thread.sleep(1000);
    clearRow(lcdHandle,0);
    clearRow(lcdHandle, 1);
    Thread.sleep(1000);
    printRow(lcdHandle, 0, " *** TRAIN *** ");
    printRow(lcdHandle, 1, "* APPROACHING *");
    Thread.sleep(1000);
    clearRow(lcdHandle, 0);
    clearRow(lcdHandle, 1);
    Thread.sleep(1000);
  }

  public static void printRow(int lcdHandle, int row, String text) {
    Lcd.lcdPosition(lcdHandle, 0, row);
    Lcd.lcdPuts(lcdHandle, text);
  }

  public static void clearRow(int lcdHandle, int row) {
    Lcd.lcdPosition(lcdHandle, 0, row);
    Lcd.lcdPuts(lcdHandle, "                ");
  }

  public static void animateClearRow(int lcdHandle, int row) throws InterruptedException {
    for (int i = 0; i<16; i++) {
      Lcd.lcdPosition(lcdHandle, i, row);
      Lcd.lcdPutchar(lcdHandle, (byte)0xFF);
      Thread.sleep(100);
      Lcd.lcdPosition(lcdHandle, i, row);
      Lcd.lcdPuts(lcdHandle, " ");
    }
  }

}
