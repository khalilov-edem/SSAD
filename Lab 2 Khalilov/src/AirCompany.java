import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AirCompany {
    String name;
    ArrayList<Landc> airplanes;
    ArrayList<AirPlane> landc;

    public static void main(String[] args) {
        AirCompany company = new AirCompany();
        company.landc = new ArrayList<AirPlane>();
        AirPlane airplane_temp = new AirPlane("Airbus", 300, "passenger", 5000, 2500);
        company.landc.add(airplane_temp);
        airplane_temp = new AirPlane("Boeng",500, "passenger", 5000, 5000);
        company.landc.add(airplane_temp);
        airplane_temp = new AirPlane("BlackHawk",5, "military", 2000, 10000);
        company.landc.add(airplane_temp);

        company.Critery();
    }
}

    public int LiftingAndCapacityCount(){ return landc.size(); }

    public void SortRange()
    {
        Collections.sort(landc, new Comparator<AirPlane>()){
            @Override
                    public int compare(AirPlane o1, AirPlane o2) { return o1.FlightRange - o2.FlightRange; }
    });
    for (int i=0; i<landc.size(); i++)
        {
            System.out.println(landc.get(i).name);

        }
    }
    public void Critery(int FlightRange_min, int FlightRange_max)
    {
        for (int i=0; i<landc.size(); i++)
        {
            if (landc.get(i).capacity >= FlightRange_min && landc.get(i).capacity <= FlightRange_max)
            {
                    System.out.println(landc.get(i).name);
                }


        }
    }


}