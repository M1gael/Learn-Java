package question1;

public class AnalogueWatch {
  private char faceType;
  private char faceShape;
  private Hand hourHand;
  private Hand minuteHand;
  private Hand secondHand;

  
  public AnalogueWatch(char faceType, char faceShape, Hand hourHand, Hand minuteHand, Hand secondHand) {
    this.faceType = faceType;
    this.faceShape = faceShape;
    this.hourHand = hourHand;
    this.minuteHand = minuteHand;
    this.secondHand = secondHand;
  }

  public AnalogueWatch(char faceType, char faceShape) {
   
    this.faceType = faceType;
    this.faceShape = faceShape;
  }


  public Hand getHourHand() {
    return hourHand;
  }

  public Hand getMinuteHand() {
    return minuteHand;
  }

  public Hand getSecondHand() {
    return secondHand;
  }

  
  public String getFaceDetails() {
    String type = faceType == 'G' ? "Glass" : "Plastic";
    String shape = faceShape == 'R' ? "Round" : faceShape == 'S' ? "Square" : "Other";
    return "Face: " + type + " (" + shape + ")";
  }

  
  public String showTime() {
    int hour = hourHand.getPosition(); 
    int minute = minuteHand.getPosition();
    int second = secondHand.getPosition();

   
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
