

import java.util.ArrayList;

/**
   A class for testing an implementation of the Observer pattern.
*/
public class ObserverTester
{
   private static TextFrame frame;

/**
      Creates a DataModel and attaches barchart and textfield listeners
      @param args unused
   */
   public static void main(String[] args)
   {
      ArrayList<Double> data = new ArrayList<Double>();

      data.add(33.0);
      data.add(44.0);
      data.add(22.0);
      data.add(22.0);

      DataModel model = new DataModel(data);

      frame = new TextFrame(model);

      BarFrame barFrame = new BarFrame(model);

      model.attach(barFrame);
   }
}
