package balloontester;

public class Balloon 
{

    private int altitude;
    private String color;

    public int getAltitude() 
    {
        return altitude;
    }

    public void increaseAltitude(int altitude) 
    {
        this.altitude += altitude;
        
        if(this.altitude < 0)
        {
            this.altitude = 0;
        }
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }
    
    public boolean equals(Balloon balloon)
    {
        return ((this.altitude == balloon.altitude)&&(this.color.equalsIgnoreCase(balloon.color)));
    }

}
