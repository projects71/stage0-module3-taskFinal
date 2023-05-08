package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double ans =  (temperatureCelsius * (double) 9/5) + 32;
        System.out.println(ans);
    }
}
